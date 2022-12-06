package com.nopcommerce.commons;

import commons.AbstractTest;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pageObjects.HomePageObject;
import pageObjects.RegisterPO;

public class Common_01_RegisterToSystem extends AbstractTest {

    private WebDriver driver;

    private HomePageObject homePage;
    private RegisterPO registerPage;

    @Parameters({"browser"})
    @BeforeSuite
    public void createNewUser(@Optional("chrome") String browserName) {
        driver = getBrowserDriver(browserName);
        System.out.println("Driver at CM1 : " + driver.toString());

        homePage = PageGeneratorManager.getHomePage(driver);

        registerPage = homePage.clickToRegisterLink();
        registerPage.clickToMaleRadioButton();
        registerPage.inputToFirstName();
        registerPage.inputToLastName();
        registerPage.selectDayDropdown();
        registerPage.selectMonthDropdown();
        registerPage.selectYearDropdown();
        registerPage.inputToEmail();
        registerPage.inputToCompany();
        registerPage.inputToPassword();
        registerPage.inputToConfirmPassword();
        registerPage.clickToRegisterButton();
        Assert.assertTrue(registerPage.getRegisterSuccessMessage());

        closeBrowserAndDriver(driver);
    }

    public void sleepInSecond(long timeout) {
        try {
            Thread.sleep(timeout * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
