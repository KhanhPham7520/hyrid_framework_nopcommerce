package actions.pageObjects;

import actions.commons.BasePage;
import actions.pageUIs.RegisterPageUI;
import org.openqa.selenium.WebDriver;

public class RegisterPageObject extends BasePage {

    private WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void enterToFirstNameTextbox(String inputValue) {
        waitForElementVisible(driver, RegisterPageUI.FIRST_NAME_TEXT_BOX);
        sendKeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXT_BOX, inputValue);
    }

    public void enterToLastNameTextbox(String inputValue) {
        waitForElementVisible(driver, RegisterPageUI.LAST_NAME_TEXT_BOX);
        sendKeyToElement(driver, RegisterPageUI.LAST_NAME_TEXT_BOX, inputValue);
    }

    public void enterToEmailTextbox(String inputValue) {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXT_BOX);
        sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXT_BOX, inputValue);
    }

    public void enterToPasswordTextbox(String inputValue) {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXT_BOX);
        sendKeyToElement(driver, RegisterPageUI.PASSWORD_TEXT_BOX, inputValue);
    }

    public void enterToConfirmPasswordTextbox(String inputValue) {
        waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXT_BOX);
        sendKeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXT_BOX, inputValue);
    }

    public void clickToRegisterButton() {
        waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
        clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
    }

    public void clickToMaleRadio() {

    }

    public void selectDayDropdown(String s) {
    }

    public void selectYearDropdown(String s) {
    }

    public void selectMonthDropdown(String s) {
    }

    public void enterToCompanyNameTextbox(String s) {
    }

    public String getRegisterSuccessMessage() {
        return null;
    }

    public void clickToLoginButton() {

    }
}
