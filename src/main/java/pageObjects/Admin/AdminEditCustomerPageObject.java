package pageObjects.Admin;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;

public class AdminEditCustomerPageObject extends AbstractPages {
    WebDriver driver;

    public AdminEditCustomerPageObject(WebDriver driver) {
        this.driver = driver;
    }

//    public void clickDeletedInConfirmBox(WebDriver driver) {
//        waitToElementVisible(driver, EditCustomerPageUI.MODAL_POPUP_DELETE_CONFIRM);
//        System.out.println("Driver before switch: " + driver.toString());
//        driver.switchTo().activeElement();
//        clickIntoButton(driver, EditCustomerPageUI.DELETE_BUTTON_IN_DELETE_MODAL_CONFIRM);
//        driver.switchTo().defaultContent();
//
//    }


}
