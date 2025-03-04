package com.nopcommerce.users;

import actions.commons.BaseTest;
import actions.pageAction.LoginPageAction;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import actions.pageAction.HomePageAction;
import pageUI.LoginPageUI;

import java.time.Duration;

@Slf4j
public class User_01_View_Product extends BaseTest {

    WebDriver driver;
    HomePageAction homePage;
    LoginPageAction loginPage;

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
    public void TC_01_View_Product_Name() {
        homePage

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
