package actions.pageObjects;

import actions.commons.BasePage;
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

    public DesktopPageObject navigateToTop3Product() {
        String top3ProductUrl = "http://localhost/desktops?viewmode=grid&orderby=0&pagesize=3&price=0-10000";
        driver.navigate().to(top3ProductUrl);
        return PageGenerator.getDesktopPage(driver);
    }

    public void clickToLoginLink() {
    }

    public void uploadFile(String fileName) {
        waitForElementPresence(driver, HomePageUI.UPLOAD_FILE_TYPE);
        uploadFiles(driver, fileName);
    }


}
