package com.users;

import actions.commons.BaseTest;
import actions.pageAction.PageGenerator;
import actions.pageUIs.LoginPageUI;
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

import java.time.Duration;

@Slf4j
public class User_01_View_Product extends BaseTest {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        ChromeOptions chromeOptions = new ChromeOptions();

        driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.get("http://localhost/");

        homePage = PageGenerator.getHomePage(driver);
        loginPage = PageGenerator.getLoginPage(driver);
        desktopPage = PageGenerator.getDesktopPage(driver);


        loginPage.sendKeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, "phamphannhatkhanh7520@gmail.com");
        loginPage.sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, "Testing123");
    }

    @Test
    @Description("Check product size between UI And DB")
    public void TC_01_Check_Matching_Number_Item_Between_UI_AND_DB() {
        log.info("View Product - Step 01 : Navigate to TOP 3 Product");
        desktopPage = homePage.navigateToTop3Product();

        log.info("View Product - Step 02 : Get all product from UI");
        int totalNumberFromUI = desktopPage.getProductSizeAtUI();

        log.info("View Product - Step 03 : Get all product from DB");
        int totalNumberFromDB = desktopPage.getProductSizeAtDB();

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
