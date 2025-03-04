package actions.pageAction;

import org.openqa.selenium.WebDriver;

public class PageGenerator {
    public static HomePageAction getHomePageObject(WebDriver driver){
        return new HomePageAction(driver);
    }
}
