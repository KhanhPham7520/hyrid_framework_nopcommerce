package pageObjects;

import actions.commons.BasePage;
import interfaces.pageUI.HomePageUI;
import org.openqa.selenium.WebDriver;


public class HomePageObject extends BasePage {

    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToRegisterLink() {
        waitForElementVisible(driver, HomePageUI.REGISTER_LINK);
        clickToElement(driver,HomePageUI.REGISTER_LINK);
    }

    public void clickToLoginLink() {
        waitForElementVisible(driver, HomePageUI.LOGIN_LINK);
        clickToElement(driver,HomePageUI.LOGIN_LINK);
    }
}
