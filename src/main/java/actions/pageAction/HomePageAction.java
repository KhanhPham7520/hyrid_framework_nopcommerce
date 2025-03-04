package actions.pageAction;

import actions.commons.BasePage;
import actions.pageAction.products.DesktopPageAction;
import org.openqa.selenium.WebDriver;
import pageUI.HomePageUI;


public class HomePageAction extends BasePage {

    private WebDriver driver;

    public HomePageAction(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToRegisterLink() {
        waitForElementVisible(driver, HomePageUI.REGISTER_LINK);
        clickToElement(driver, HomePageUI.REGISTER_LINK);
    }

    public LoginPageAction clickToLoginLink() {
        waitForElementVisible(driver, HomePageUI.LOGIN_LINK);
        clickToElement(driver, HomePageUI.LOGIN_LINK);
        return new LoginPageAction(driver);
    }

    public DesktopPageAction navigateToTop3Product() {
        String top3ProductUrl = "http://localhost/desktops?viewmode=grid&orderby=0&pagesize=3&price=0-10000";
        driver.navigate().to(top3ProductUrl);
        return new DesktopPageAction(driver);
    }
}
