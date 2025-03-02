package actions.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageObjects.HomePageObject;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;

    protected WebDriver getBrowserDriver(String url, String browserName) throws Exception {
        BrowserType browserType = BrowserType.valueOf(browserName.toUpperCase());

        switch (browserType){
            case CHROME:
                driver = new ChromeDriver();
                break;

            case EDGE:
                driver = new EdgeDriver();
                break;

            default:
                throw new Exception("No browser found");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.get("https://demo.nopcommerce.com/");
        return null;
    }

}
