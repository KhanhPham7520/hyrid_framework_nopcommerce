package actions.pageObjects;

import actions.commons.BasePage;
import actions.pageAction.PageGenerator;
import actions.pageUIs.HomePageUI;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {

    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterPageObject clickToRegisterLink() {
        waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
        clickToElement(driver, HomePageUI.REGISTER_LINK);
        return PageGenerator.getRegisterPage(driver);
    }

    public boolean isMyAccountLinkDisplayed() {
        return false;
    }

    public CustomerInfoPageObject clickToMyAccountLink() {
        waitForElementClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
        clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
        return PageGenerator.getCustomerInfoPage(driver);
    }
}
