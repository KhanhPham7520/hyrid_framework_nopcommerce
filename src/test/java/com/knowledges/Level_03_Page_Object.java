package com.knowledges;

import actions.commons.BaseTest;
import actions.pageAction.HomePageAction;
import actions.pageAction.RegisterPageAction;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Level_03_Page_Object extends BaseTest {

    WebDriver driver;

    HomePageAction homePage;
    RegisterPageAction registerPage;

    @BeforeClass
    public void beforeClass() {
        ChromeOptions chromeOptions = new ChromeOptions();

        // Initialize WebDriver with ChromeOptions
        driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.get("http://localhost/");

        homePage = new HomePageAction(driver);
    }

    @Test
    public void TC_01_Register() {
        homePage.clickToRegisterLink();

        registerPage = new RegisterPageAction(driver);
        registerPage.enterToFirstNameTextbox("");
    }

    @Test
    public void TC_02_Login() {
        homePage.clickToLoginLink();
    }


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
