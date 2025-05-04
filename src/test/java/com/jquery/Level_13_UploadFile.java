package com.jquery;

import actions.commons.BaseTest;
import actions.pageAction.PageGenerator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Level_13_UploadFile extends BaseTest {

    String MacProImg = "MacPro.png";
    String X1 = "X1.jpg";

    @Parameters({"url", "browser"})
    @BeforeClass
    public void beforeClass(String urlValue, String browserName) {
        driver = getBrowserDriver(urlValue, browserName);

        homePage = PageGenerator.getHomePage(driver);
    }

    @Test
    public void TC_01_Upload_Single_File(){
        homePage.uploadFile(MacProImg);
        homePage.uploadFile(X1);
        homePage.sleepInSecond(5000);

        Assert.assertTrue(homePage.isFileLoadedSuccess(driver,MacProImg));
        Assert.assertTrue(homePage.isFileLoadedSuccess(driver, X1));
    }

    @Test
    public void TC_02_Upload_Multiple_Files(){
        homePage.refreshCurrentPage(driver);
        homePage.uploadFile(MacProImg);
        homePage.uploadFile(X1);
        homePage.sleepInSecond(5000);

        Assert.assertTrue(homePage.isFileLoadedSuccess(driver,MacProImg));
        Assert.assertTrue(homePage.isFileLoadedSuccess(driver, X1));
    }

    @AfterClass
    public void afterClass(){
        closeBrowserDriver(driver);
    }
}
