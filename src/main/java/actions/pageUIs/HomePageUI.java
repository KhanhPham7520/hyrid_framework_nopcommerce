package actions.pageUIs;

public class HomePageUI {

    public static final String REGISTER_LINK = "//a[text()='Register']";

    public static final String LOGIN_LINK = "//a[text()='Log in']";

    public static final String COMPUTER_HEADER_MENU = "//div[@class='header-menu']/" +
            "/ul[contains(@class,'notmobile')]//li//a[contains(text(),'Computers')]";

    public static final String DESKTOP_HEADER_SUB_ITEM = "//ul[contains(@class,'notmobile')]//" +
            "li//a[contains(text(),'Desktops')]";
}
