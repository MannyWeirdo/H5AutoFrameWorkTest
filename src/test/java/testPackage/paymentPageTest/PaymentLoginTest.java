package testPackage.paymentPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.payment.PaymentBalancePage;
import page.pc.payment.PaymentLoginPage;
import testCases.AbstractTestCases;

public class PaymentLoginTest extends AbstractTestCases {
    @Test(testName = "payment1", description = "在线充值无绑卡用户扫描二维码登录", groups = "pc")
    public void scanQrcodeLoginForNoBindBankCardAccount() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCodeByNoBankCard();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment2", description = "在线充值有绑卡用户扫描二维码登录", groups = "pc")
    public void scanQrcodeLoginForBindBankCardAccount() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.logout();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
