package com.jquery;

import actions.commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Level_13_UploadFile extends BaseTest {

    @Parameters({"url", "browser"})
    @BeforeClass
    public void beforeClass(String urlValue, String browserName) {
        driver = getBrowserDriver(browserName);

        //homePage = PageGenerator.g()
    }
}
