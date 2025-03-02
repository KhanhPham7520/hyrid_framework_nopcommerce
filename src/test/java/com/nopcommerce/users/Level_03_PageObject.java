package com.nopcommerce.users;

import actions.commons.BasePage;
import actions.pageObjects.RegisterPageObject;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import actions.pageObjects.CustomerInfoPageObject;
import pageObjects.HomePageObject;
import actions.pageObjects.LoginPageObject;

import java.time.Duration;

public class Level_03_PageObject extends BasePage {

    WebDriver driver;
    String emailAddress;

    HomePageObject homePage;
    CustomerInfoPageObject customerInfoPage;
    LoginPageObject loginPage;
    RegisterPageObject registerPage;

    @BeforeClass
    public void beforeClass() {
        ChromeOptions chromeOptions = new ChromeOptions();

        // Initialize WebDriver with ChromeOptions
        driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.get("http://localhost/");

        homePage = new HomePageObject(driver);
    }

    @Test
    public void TC_01_Register() {
        homePage.clickToRegisterLink();

        registerPage = new RegisterPageObject(driver);
        registerPage.enterToFirstNameTextbox("");
//        registerPage.enterToLastNameTextbox("");
//        registerPage.enterToEmailTextbox("");
//        registerPage.enterToPasswordTextbox("");
//        registerPage.enterToConfirmPasswordTextbox("");
//
//        registerPage.clickToRegisterButton();
//
//        Assert.assertEquals("","", "Your registration completed");
//        registerPage.getRegisterSuccessMessage();
//
//        // Navigate back to Home Page
//        homePage = new HomePageObject();
    }

    @Test
    public void TC_02_Login(){
        homePage.clickToLoginLink();
//
//        loginPage = new LoginPageObject();
//        loginPage.enterToEmailTextbox();
//        loginPage.enterToPasswordTextbox();
//        loginPage.clickToLoginButton();
    }


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
