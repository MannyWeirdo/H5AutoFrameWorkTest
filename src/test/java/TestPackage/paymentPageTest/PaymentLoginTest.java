package TestPackage.paymentPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import Page.NavigationPage;
import Page.Payment.PaymentLoginPage;
import TestCases.AbstractTestCases;

public class PaymentLoginTest extends AbstractTestCases {
    @Test(testName = "", description = "在线充值扫描二维码登录")
    public void scanQrcodeLoginTest() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        paymentLoginPage.scanQrCodeByIOS();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
