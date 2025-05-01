package com.users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Level_01_Repeat_Yourself {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void TC_01_Register() {
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("");
        driver.findElement(By.id("LastName")).sendKeys("");
        driver.findElement(By.id("Email")).sendKeys("");
        driver.findElement(By.id("Password")).sendKeys("");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("");
        driver.findElement(By.id("register-button")).click();
    }

    @Test
    public void TC_02_Login() {

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
