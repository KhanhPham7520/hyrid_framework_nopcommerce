package actions.pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGenerator {

    // Viết các đoạn khởi tạo Page Object Class thành các hàm (tái sử dụng) + tính chất đóng gói

    public static HomePageObject getHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }

    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static LoginPageObject getHomePageAction(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static RegisterPageObject getRegisterPage(WebDriver driver) {
        return new RegisterPageObject(driver);
    }

    public static CustomerInfoPageObject getCustomerInfoPage(WebDriver driver) {
        return new CustomerInfoPageObject(driver);
    }

    public static DesktopPageObject getDesktopPage(WebDriver driver) {
        return new DesktopPageObject(driver);
    }

    public static Object getPageInstance(Object object,WebDriver driver){
        return new Object();
    }

}