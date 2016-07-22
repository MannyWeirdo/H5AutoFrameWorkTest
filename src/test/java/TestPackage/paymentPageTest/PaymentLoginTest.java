package TestPackage.paymentPageTest;

import org.testng.annotations.Test;
import Page.Payment.PaymentBalancePage;
import com.customize.reporter.WebReporter;

public class PaymentLoginTest extends PaymentPageBaseTest {
    @Test(testName = "", description = "在线充值IOS扫描二维码登录")
    public void scanQrcodeLoginFromIOSTest() throws Exception {
    	PaymentBalancePage balancePage = loginPaymentPage("IOS");
    	balancePage.logout();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName = "", description = "在线充值Android扫描二维码登录")
    public void scanQrcodeLoginFromAndroidTest() throws Exception {
    	PaymentBalancePage balancePage = loginPaymentPage("Android");
    	balancePage.logout();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
