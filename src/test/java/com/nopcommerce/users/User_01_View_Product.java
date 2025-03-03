package com.nopcommerce.users;

import actions.commons.BaseTest;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePageObject;
import pageObjects.PageGenerator;

import java.time.Duration;

public class User_01_View_Product extends BaseTest {

    WebDriver driver;
    HomePageObject homePage;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName, String adminUrl, String endUserUrl){
        driver = getBrowserDriver(browserName);

        homePage = PageGenerator.getHomePageObject(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.get("http://localhost/");

    }

    @Test
    public void TC_01_View_User(){

    }


}
