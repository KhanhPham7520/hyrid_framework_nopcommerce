package com.jquery;

import actions.commons.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Level_13_UploadFile extends BaseTest {

    @Parameters({"url", "browser"})
    @BeforeClass
    public void beforeClass(String urlValue, String browserName) {
        driver = getBrowserDriver(urlValue, browserName);


    }

    @Test
    public void upload(){
        System.out.print("Da vao day roi");
    }

    @AfterClass
    public void afterClass(){
        closeBrowserDriver(driver);
    }
}
