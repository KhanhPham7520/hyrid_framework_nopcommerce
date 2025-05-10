package com.users;

import actions.commons.BaseTest;
import actions.pageObjects.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Level_03_Page_Object extends BaseTest {

    // Declare variables
    private WebDriver driver;

    // Pre - Condition
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  nó được sinh ra và bắt đầu làm những action của page đó
        homePage = PageGenerator.getHomePage(driver);
        loginPage = PageGenerator.getLoginPage(driver);
        registerPage = PageGenerator.getRegisterPage(driver);
        customerInfoPage = PageGenerator.getCustomerInfoPage(driver);
    }

    @Test
    public void User_01_Register() {
        homePage.clickToRegisterLink();

        registerPage.clickToMaleRadio();
        registerPage.enterToFirstNameTextbox("");
        registerPage.enterToLastNameTextbox("");
        registerPage.selectDayDropdown("");
        registerPage.selectMonthDropdown("");
        registerPage.selectYearDropdown("");
        registerPage.enterToEmailTextbox("");
        registerPage.enterToCompanyNameTextbox("");
        registerPage.enterToPasswordTextbox("");
        registerPage.enterToConfirmPasswordTextbox("");
        registerPage.clickToRegisterButton();

        Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
    }

    @Test
    public void User_02_Login() {
        registerPage.clickToLoginButton();

        loginPage.enterToEmailTextbox("");
        loginPage.enterToPasswordTextbox("");
        loginPage.clickToLoginButton();
        Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
    }

    @Test
    public void User_03_My_Account() {
        homePage.clickToMyAccountLink();
        Assert.assertTrue(customerInfoPage.isGenderMaleSelected());

        customerInfoPage.getFirstNameTextboxValue();
        Assert.assertEquals(customerInfoPage.getFirstNameTextboxValue(), "");
        Assert.assertEquals(customerInfoPage.getLastNameTextboxValue(), "");
        Assert.assertEquals(customerInfoPage.getDayDropdownSelectedValue(), "");
        Assert.assertEquals(customerInfoPage.getMonthDropdownSelectedValue(), "");
        Assert.assertEquals(customerInfoPage.getYearDropdownSelectedValue(), "");
        Assert.assertEquals(customerInfoPage.getEmailTextboxValue(), "");
    }

    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}
