package actions.pageObjects;

import actions.commons.BasePage;
import org.openqa.selenium.WebDriver;

public class CustomerInfoPageObject extends BasePage {

    private WebDriver driver;

    public CustomerInfoPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isGenderMaleSelected() {
        return false;
    }

    public String getFirstNameTextboxValue() {
        return null;
    }

    public String getLastNameTextboxValue() {
        return null;
    }

    public String getDayDropdownSelectedValue() {
        return null;
    }

    public String getMonthDropdownSelectedValue() {
        return null;
    }

    public String getYearDropdownSelectedValue() {
        return null;
    }

    public String getEmailTextboxValue() {
        return null;
    }
}
