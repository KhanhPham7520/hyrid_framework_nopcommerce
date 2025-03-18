package com.nopcommerce.users;

import actions.pageObjects.CustomerInfoPageObject;
import actions.pageObjects.HomePageObject;
import actions.pageObjects.LoginPageObject;
import actions.pageObjects.RegisterPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Level_03_Page_Object {

    // Declare variables
    private WebDriver driver;
    private HomePageObject homePage;
    private RegisterPageObject registerPage;
    private LoginPageObject loginPage;
    private CustomerInfoPageObject customerInfoPage;

    // Pre - Condition
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  nó được sinh ra và bắt đầu làm những action của page đó
        homePage = new HomePageObject();
    }


    @Test
    public void User_01_Register() {

        // Action 1
        homePage.clickToRegisterLink();

        // Từ Home Page qua Register Page
        //  Page được sinh ra và bắt đầu làm những action của page đó
        registerPage = new RegisterPageObject();

        registerPage.clickToMaleRadio();
        registerPage.enterToFirstNameTextbox("");
        registerPage.enterToLastNameTextbox("");
        registerPage.selectDayDropdown("");
        registerPage.selectMonthDropdown("");
        registerPage.selectYearDropdown("");
        registerPage.enterEmailCheckbox("");
        registerPage.enterToCompanyNameTextbox("");
        registerPage.enterToPasswordTextbox("");
        registerPage.enterToConfirmPasswordTextbox("");
        registerPage.clickToRegisterButton("");

        Assert.assertEquals(registerPage.getRegisterSuccessMessage(),"Your registration completed");

    }

    @Test
    public void User_02_Login() {
        registerPage.clickToLoginButton();

        loginPage = new LoginPageObject();

        loginPage.enterToEmailTextbox("");
        loginPage.enterToPasswordTextbox("");
        loginPage.clickToLoginButton();

        // Từ Login Page qua Home Page
        homePage = new HomePageObject();

        Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
    }

    @Test
    public void User_03_My_Account() {
        homePage.clickToMyAccountLink();

        customerInfoPage = new CustomerInfoPageObject();

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
