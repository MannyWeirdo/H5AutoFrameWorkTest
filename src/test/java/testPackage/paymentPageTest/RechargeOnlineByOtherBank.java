package testPackage.paymentPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.payment.PaymentBalancePage;
import page.pc.payment.PaymentLoginPage;
import page.pc.payment.RechargeErrorPage;
import testCases.AbstractTestCases;

public class RechargeOnlineByOtherBank extends AbstractTestCases {

    @Test(testName = "payment6", description = "中国工商银行充值", groups = "pc")
    public void ICBCBankRecharge() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByICBC();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment8", description = "中国建设银行充值", groups = "pc")
    public void CCBBankRecharge() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByCCB();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment9", description = "中国邮政银行充值", groups = "pc")
    public void PSBCRecharge() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByPSBC();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment17", description = "中国农业银行充值", groups = "pc")
    public void ABCRecharge() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByABC();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment10", description = "招商银行充值", groups = "pc")
    public void CMBRecharge() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByCMB();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment11", description = "浦发银行充值", groups = "pc")
    public void SPDBRecharge() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeBySPDB();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment12", description = "广发银行充值", groups = "pc")
    public void GDBRecharge() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByGDB();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment13", description = "民生银行充值", groups = "pc")
    public void CMBCRecharge() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByGDB();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment14", description = "平安银行充值", groups = "pc")
    public void PABCRecharge() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByPABC();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment14", description = "银联充值", groups = "pc")
    public void bankGroupRecharge() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByBankGroup();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment15", description = "充值成功后查看余额", groups = "pc")
    public void rechargeSuccessAndChectoutBalance() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByICBC();
        balancePage.rechargeSuccess();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment15", description = "充值失败后查看余额", groups = "pc")
    public void rechargeFailedAndChectoutBalance() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByICBC();
        RechargeErrorPage rechargeErrorPage = balancePage.rechargeFailed();
        rechargeErrorPage.clickCheckoutMineLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment16", description = "充值失败后退出", groups = "pc")
    public void rechargeFailedAndLogout() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("100000");
        balancePage.rechargeByICBC();
        RechargeErrorPage rechargeErrorPage = balancePage.rechargeFailed();
        rechargeErrorPage.clickLogoutButton();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
