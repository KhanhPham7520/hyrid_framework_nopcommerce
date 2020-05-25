package pageObjects.bankGuru;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

    public static RegisterPageObject getRegisterPage(WebDriver driver) {
        return new RegisterPageObject(driver);
    }

    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static NewCustomerPageObject getCustomerPage(WebDriver driver) {
        return new NewCustomerPageObject(driver);
    }

    public static EditAccountPageObject getEditAccountPage(WebDriver driver) {
        return new EditAccountPageObject(driver);
    }

    public static DepositPageObject getDepositPage(WebDriver driver) {
        return new DepositPageObject(driver);
    }

    public static WithdrawalPageObject getWithdrawalPage(WebDriver driver) {
        return new WithdrawalPageObject(driver);
    }

    public static FundTransferPageObject getFundTransferPage(WebDriver driver) {
        return new FundTransferPageObject(driver);
    }

    public static BalanceEnquiryPageObject getBalanceEnquiryPage(WebDriver driver) {
        return new BalanceEnquiryPageObject(driver);
    }

    public static DeleteAccountPageObject getDeleteAccountPage(WebDriver driver) {
        return new DeleteAccountPageObject(driver);
    }

    public static DeleteCustomerPageObject getDeleteCustomerPagePage(WebDriver driver) {
        return new DeleteCustomerPageObject(driver);
    }

    public static EditCustomerPageObject getEditCustomerPage(WebDriver driver) {
        return new EditCustomerPageObject(driver);
    }

    public static NewAccountPageObject getNewAccountPage(WebDriver driver) {
        return new NewAccountPageObject(driver);
    }
}