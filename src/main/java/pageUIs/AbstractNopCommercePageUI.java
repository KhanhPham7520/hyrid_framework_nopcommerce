package pageUIs;

public class AbstractNopCommercePageUI {

	// Header
	public static final String HEADER_LOG_OUT_LINK = "//a[text()='Log out']";
	public static final String HEADER_LOGIN_LINK = "//div[@class='header-links']//a[text()='Log in']";

	// Footer
	public static final String HOME_PAGE_LINK = "//div[@class='header-logo']//a[@href='/']";
	public static final String FOOTER_NEW_PRODUCT_LINK = "//div[@class='footer']//a[text()='New products']";
	public static final String FOOTER_MY_ACCOUNT_LINK = "//div[@class='footer']//a[text()='My account']";
	public static final String FOOTER_SEARCH_LINK = "//div[@class='footer']//a[contains(text(),'Search')]";
	public static final String FOOTER_COMPARE_LINK = "//div[@class='footer']//div[@class='footer-block customer-service']//ul[@class='list']//li//a[text()='Compare products list']";
	public static final String FOOTER_RECENT_VIEW_PRODUCT_LINK = "//a[text()='Compare products list']";

	// Navbar of header menu
	public static final String LINK_NAME_OF_HEADER_MENU = "//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a[contains(text(),'%s')]";
	public static final String SUBLIST_OF_HEADER_MENU = "//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a[contains(text(),'%s')]//following-sibling::ul//li//a[contains(text(),'%s')]";

	// Dynamic link
	public static final String DYNAMIC_FOOTER_LINK = "//div[@class='footer']//a[text()='%s']";

	public static final String ADD_NEW_BUTTON = "//a[@href='/Admin/Customer/Create']";
	public static final String CUSTOMER_ROLES_SELECT = "//select[@id='SelectedCustomerRoleIds']";

	public static final String PRODUCT_TITLE = "//h2[@class='product-title']//a";
	public static final String PRODUCT_PRICE = "//span[@class='price actual-price']";

	public static final String SHOPPING_CART_HEADER_LINK = "//a[@class='ico-cart']";

	public static final String INPUT_TEXTBOX = "//input[@id='%s']";
	public static final String INPUT_RADIO = "//input[@id='%s']";

	public static final String ERROR_MESSAGE_VALIDATION = "//span[@id='%s' and text()='%s']";

	public static final String SELECT_DROPDOWN = "//select[@name='%s']";

}
