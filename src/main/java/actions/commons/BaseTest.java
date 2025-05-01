package actions.commons;

import actions.pageObjects.CustomerInfoPageObject;
import actions.pageObjects.HomePageObject;
import actions.pageObjects.LoginPageObject;
import actions.pageObjects.RegisterPageObject;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    protected HomePageObject homePage;
    protected RegisterPageObject registerPage;
    protected LoginPageObject loginPage;
    protected CustomerInfoPageObject customerInfoPage;

    protected WebDriver getBrowserDriver(String browserName) {
        BrowserType browserType = BrowserType.valueOf(browserName.toUpperCase());

        switch (browserType) {
            case CHROME:
                driver = new ChromeDriver();
                break;

            case EDGE:
                driver = new EdgeDriver();
                break;

            default:
                try {
                    throw new Exception("No browser found");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.get("http://localhost/");
        return null;
    }

}
