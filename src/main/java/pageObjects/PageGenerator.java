package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGenerator {
    public static HomePageObject getHomePageObject(WebDriver driver){
        return new HomePageObject(driver);
    }
}
