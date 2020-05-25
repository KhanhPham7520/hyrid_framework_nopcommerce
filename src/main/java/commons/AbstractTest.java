package commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractTest extends CommonFunction {

	protected final Log log;
	private String rootFolder = System.getProperty("user.dir");
	private WebDriver driver;

	public AbstractTest() {
		log = LogFactory.getLog(getClass());
	}

	public void printBrowserConsoleLogs(WebDriver driver) {
		LogEntries logs = driver.manage().logs().get("browser");
		List<LogEntry> logList = logs.getAll();
		for (LogEntry logging : logList) {
			log.info("-------------" + logging.getLevel().toString() + "------------ \n" + logging.getMessage());
		}
	}

	public WebDriver getBrowserDriverOfAdmin(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(GlobalConstants.FIREFOX_DRIVER_SYSTEM_KEY, GlobalConstants.FIREFOX_DRIVER_SYSTEM_VALUE);
			driver = new FirefoxDriver();
		}
		if (browserName.equalsIgnoreCase("headless_firefox")) {
			System.setProperty(GlobalConstants.FIREFOX_DRIVER_SYSTEM_KEY, GlobalConstants.FIREFOX_DRIVER_SYSTEM_VALUE);
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new FirefoxDriver(options);
		}
		if (browserName.equalsIgnoreCase("headless_chrome")) {
			System.setProperty(GlobalConstants.CHROME_DRIVER_SYSTEM_KEY, GlobalConstants.CHROME_DRIVER_SYSTEM_VALUE);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			options.setHeadless(true);
			driver = new ChromeDriver(options);
		}
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "/Users/apple/Desktop/msedgedriver");
			driver = new EdgeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.get(GlobalConstants.ADMIN_PAGE_URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}

	public WebDriver getBrowserDriver(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			// WebDriverManager.firefoxdriver().setup();
			//// Install plugins for Chrome
			// FirefoxProfile profile = new FirefoxProfile();
			// File translate = new File(rootFolder + "\\browserExtension\\google_translate.xpi");
			// profile.addExtension(translate);
			// FirefoxOptions options = new FirefoxOptions();
			// options.setProfile(profile);
			// driver = new FirefoxDriver(options);
			// System.setProperty(GlobalConstants.FIREFOX_DRIVER_SYSTEM_KEY, GlobalConstants.FIREFOX_DRIVER_SYSTEM_VALUE);
			WebDriverManager.firefoxdriver().setup();
			// System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
			// System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, rootFolder + "\\LogBrowser\\Firefox.log");

			driver = new FirefoxDriver();
		}
		if (browserName.equalsIgnoreCase("headless_firefox")) {
			System.setProperty(GlobalConstants.FIREFOX_DRIVER_SYSTEM_KEY, GlobalConstants.FIREFOX_DRIVER_SYSTEM_VALUE);
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new FirefoxDriver(options);
		}
		if (browserName.equalsIgnoreCase("headless_chrome")) {
			System.setProperty(GlobalConstants.CHROME_DRIVER_SYSTEM_KEY, GlobalConstants.CHROME_DRIVER_SYSTEM_VALUE);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			options.setHeadless(true);
			driver = new ChromeDriver(options);
		}
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.args", "--disable-logging");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			// Install plugins for Chrome
			// File file = new File(rootFolder + "\\browserExtension\\google_translate.crx");
			// ChromeOptions options = new ChromeOptions();
			// options.addExtensions(file);
			// driver = new ChromeDriver(options);
			driver = new ChromeDriver();

		}
		if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty(GlobalConstants.EDGE_DRIVER_SYSTEM_KEY, GlobalConstants.EDGE_DRIVER_SYSTEM_VALUE);
			driver = new EdgeDriver();
		}
		if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
			driver.manage().window().maximize();
		}
		driver.manage().deleteAllCookies();
		driver.get(GlobalConstants.DEV_URL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		return driver;
	}

	public WebDriver getBrowserDriverofBankGuru(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(GlobalConstants.FIREFOX_DRIVER_SYSTEM_KEY, GlobalConstants.FIREFOX_DRIVER_SYSTEM_VALUE);
			driver = new FirefoxDriver();
		}
		if (browserName.equalsIgnoreCase("headless_firefox")) {
			System.setProperty(GlobalConstants.FIREFOX_DRIVER_SYSTEM_KEY, GlobalConstants.FIREFOX_DRIVER_SYSTEM_VALUE);
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new FirefoxDriver(options);
		}
		if (browserName.equalsIgnoreCase("headless_chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/apple/Desktop/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			options.setHeadless(true);
			driver = new ChromeDriver(options);
		}
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(GlobalConstants.CHROME_DRIVER_SYSTEM_KEY, GlobalConstants.CHROME_DRIVER_SYSTEM_VALUE);
			driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("edge")) {
			// System.setProperty(GlobalConstants.EDGE_DRIVER_SYSTEM_KEY, GlobalConstants.EDGE_DRIVER_SYSTEM_VALUE);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
			driver.manage().window().maximize();
		}
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		return driver;
	}

	private boolean checkTrue(boolean condition) {
		boolean pass = true;
		try {
			if (condition == true) {
				log.info(" -------------------------- PASSED -------------------------- ");
			} else {
				log.info(" -------------------------- FAILED -------------------------- ");
			}
			Assert.assertTrue(condition);
		} catch (Throwable e) {
			pass = false;

			// Add lỗi vào ReportNG
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	public WebDriver getBrowserDriver(String browserName, String url) {
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(GlobalConstants.FIREFOX_DRIVER_SYSTEM_KEY, GlobalConstants.FIREFOX_DRIVER_SYSTEM_VALUE);
			driver = new FirefoxDriver();
		}
		if (browserName.equalsIgnoreCase("headless_firefox")) {
			System.setProperty(GlobalConstants.FIREFOX_DRIVER_SYSTEM_KEY, GlobalConstants.FIREFOX_DRIVER_SYSTEM_VALUE);
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new FirefoxDriver(options);
		}
		if (browserName.equalsIgnoreCase("headless_chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/apple/Desktop/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			options.setHeadless(true);
			driver = new ChromeDriver(options);
		}
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("edge")) {
			// System.setProperty(GlobalConstants.EDGE_DRIVER_SYSTEM_KEY, GlobalConstants.EDGE_DRIVER_SYSTEM_VALUE);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		// driver.manage().deleteAllCookies();
		driver.get(GlobalConstants.DEV_URL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		return driver;
	}

	protected boolean verifyTrue(boolean condition) {
		return checkTrue(condition);
	}

	private boolean checkFailed(boolean condition) {
		boolean pass = true;
		try {
			if (condition == false) {
				log.info(" -------------------------- PASSED -------------------------- ");
			} else {
				log.info(" -------------------------- FAILED -------------------------- ");
			}
			Assert.assertFalse(condition);
		} catch (Throwable e) {
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyFalse(boolean condition) {
		return checkFailed(condition);
	}

	private boolean checkEquals(Object actual, Object expected) {
		boolean pass = true;
		try {
			Assert.assertEquals(actual, expected);
			log.info(" -------------------------- PASSED -------------------------- ");
		} catch (Throwable e) {
			pass = false;
			log.info(" -------------------------- FAILED -------------------------- ");
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyEquals(Object actual, Object expected) {
		return checkEquals(actual, expected);
	}

	protected void closeBrowserAndDriver(WebDriver driver) {
		try {
			// get ra tên của OS và convert qua chữ thường
			String osName = System.getProperty("os.name").toLowerCase();
			log.info("OS name = " + osName);

			// Khai báo 1 biến command line để thực thi
			String cmd = "";
			if (driver != null) {
				driver.quit();
			}

			if (driver.toString().toLowerCase().contains("chrome")) {
				if (osName.toLowerCase().contains("mac")) {
					cmd = "pkill chromedriver";
				} else if (osName.toLowerCase().contains("windows")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
				}
			} else if (driver.toString().toLowerCase().contains("internetexplorer")) {
				if (osName.toLowerCase().contains("window")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq IEDriverServer*\"";
				}
			} else if (driver.toString().toLowerCase().contains("firefox")) {
				if (osName.toLowerCase().contains("mac")) {
					cmd = "pkill geckodriver";
				} else if (osName.toLowerCase().contains("windows")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq geckodriver*\"";
				}
			}

			Process process = Runtime.getRuntime().exec(cmd);
			process.waitFor();

			log.info("---------- QUIT BROWSER SUCCESS ----------");
		} catch (Exception e) {
			log.info(e.getMessage());
		}
	}

	protected Object formatDate(String dateValue) {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		try {
			Date date = simpleDateFormat.parse(dateValue);
			dateValue = simpleDateFormat.format(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dateValue;
	}

	protected String getCurrentDay() {
		DateTime nowUTC = new DateTime(DateTimeZone.UTC);
		int day = nowUTC.getDayOfMonth();
		if (day < 10) {
			String dayValue = "0" + day;
			return dayValue;
		}
		return day + "";
	}

	protected String getCurrentMonth() {
		DateTime now = new DateTime(DateTimeZone.UTC);
		int month = now.getMonthOfYear();
		if (month < 10) {
			String monthValue = "0" + month;
			return monthValue;
		}
		return month + "";
	}

	protected String getCurrentYear() {
		DateTime now = new DateTime(DateTimeZone.UTC);
		return now.getYear() + "";
	}

	protected String getBankGuruToday() {
		return getCurrentYear() + "-" + getCurrentMonth() + "-" + getCurrentDay();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
