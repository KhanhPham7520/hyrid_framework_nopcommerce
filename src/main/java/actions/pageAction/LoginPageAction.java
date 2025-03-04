package actions.pageAction;

import actions.commons.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPageAction extends BasePage {

    WebDriver driver;

    public LoginPageAction(WebDriver driver) {
        this.driver = driver;
    }

}
