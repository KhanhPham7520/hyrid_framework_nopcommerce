package actions.pageAction;

import actions.pageAction.products.DesktopPageAction;
import org.openqa.selenium.WebDriver;

public class PageGenerator {

    public static HomePageAction getHomePageAction(WebDriver driver) {
        return new HomePageAction(driver);
    }

    public static DesktopPageAction getDesktopPageAction(WebDriver driver) {
        return new DesktopPageAction(driver);
    }
}
