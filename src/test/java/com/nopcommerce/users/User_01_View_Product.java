package com.nopcommerce.users;

import actions.commons.BaseTest;
import actions.pageAction.HomePageAction;
import actions.pageAction.LoginPageAction;
import actions.pageAction.products.DesktopPageAction;
import jdk.jfr.Description;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageUI.LoginPageUI;

import java.time.Duration;

@Slf4j
public class User_01_View_Product extends BaseTest {

    WebDriver driver;
    HomePageAction homePage;
    LoginPageAction loginPage;
    DesktopPageAction desktopPageAction;

    @BeforeClass
    public void beforeClass() {
        ChromeOptions chromeOptions = new ChromeOptions();

        driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.get("http://localhost/");

        homePage = new HomePageAction(driver);
        loginPage = new LoginPageAction(driver);

        loginPage = homePage.clickToLoginLink();

        loginPage.sendKeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, "phamphannhatkhanh7520@gmail.com");
        loginPage.sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, "Testing123");
        homePage = loginPage.clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

    }

    @Test
    @Description("Check product size between UI And DB")
    public void TC_01_Check_Matching_Number_Item_Between_UI_AND_DB() {
        log.info("View Product - Step 01 : Navigate to TOP 3 Product");
        desktopPageAction = homePage.navigateToTop3Product();

        log.info("View Product - Step 02 : Get all product from UI");
        int totalNumberFromUI = desktopPageAction.getProductSizeAtUI();

        log.info("View Product - Step 03 : Get all product from DB");
        int totalNumberFromDB = desktopPageAction.getProductSizeAtDB();

        log.info("View Product - Step 04 : Verify the product size are matching");
        Assert.assertEquals(totalNumberFromUI, totalNumberFromDB);

        System.out.println("totalNumberFromUI : " + totalNumberFromUI);
        System.out.println("totalNumberFromDB : " + totalNumberFromDB);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
