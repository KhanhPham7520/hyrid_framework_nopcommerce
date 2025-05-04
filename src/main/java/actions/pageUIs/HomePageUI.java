package actions.pageUIs;

public class HomePageUI {

    public static final String REGISTER_LINK = "//a[text()='Register']";

    public static final String LOGIN_LINK = "//a[text()='Log in']";

    public static final String COMPUTER_HEADER_MENU = "//div[@class='header-menu']/" +
            "/ul[contains(@class,'notmobile')]//li//a[contains(text(),'Computers')]";

    public static final String DESKTOP_HEADER_SUB_ITEM = "//ul[contains(@class,'notmobile')]//" +
            "li//a[contains(text(),'Desktops')]";

    public static final String MY_ACCOUNT_LINK = "";

    public static final String UPLOAD_FILE_TYPE = "//input[@name='files[]']";
    public static final String FILE_LOADED_BY_NAME = "//p[@class='name' and text()='%s']";
}
