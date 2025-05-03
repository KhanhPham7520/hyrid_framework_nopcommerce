package actions.commons;

import actions.pageObjects.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    protected HomePageObject homePage;
    protected RegisterPageObject registerPage;
    protected LoginPageObject loginPage;
    protected CustomerInfoPageObject customerInfoPage;
    protected DesktopPageObject desktopPage;

    protected WebDriver getBrowserDriver(String url, String browserName) {
        BrowserType browserType = BrowserType.valueOf(browserName.toUpperCase());

        switch (browserType) {
            case CHROME:
                driver = new ChromeDriver();
                break;

            case EDGE:
                driver = new EdgeDriver();
                break;

            case FIREFOX:
                driver = new FirefoxDriver();
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
        driver.get(url);

        return driver;
    }

    protected void closeBrowserDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
        killDriverProcess();
    }


    protected void killDriverProcess() {
        String os = System.getProperty("os.name").toLowerCase();
        Runtime runtime = Runtime.getRuntime();

        try {
            if (os.contains("mac") || os.contains("nix") || os.contains("nux")) {
                // macOS/Linux
                runtime.exec("pkill -f chromedriver");
                runtime.exec("pkill -f geckodriver");
                runtime.exec("pkill -f msedgedriver");
            } else if (os.contains("win")) {
                // Windows
                runtime.exec("taskkill /F /IM chromedriver.exe");
                runtime.exec("taskkill /F /IM geckodriver.exe");
                runtime.exec("taskkill /F /IM msedgedriver.exe");
            } else {
                System.out.println("Unsupported OS: " + os);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
