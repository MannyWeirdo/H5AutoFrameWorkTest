package testPackage.paymentPageTest;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.payment.PaymentBalancePage;
import page.pc.payment.PaymentLoginPage;
import testCases.AbstractTestCases;

public class PaymentSimpleOpreationTest extends AbstractTestCases {

    @Test(testName = "payment3", description = "充值金额小于10000元", groups = "pc")
    public void setLessMoneyOnRechargeTextField() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("999");
        balancePage.clickNextStepButton();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment4", description = "填写充值金额为非法字符串", groups = "pc")
    public void setIllegalValueOnRechargeTextField() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("fdsa999");
        balancePage.clickNextStepButton();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment5", description = "查看充值限额", groups = "pc")
    public void viewOnlineBankingRechargeLimit() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.clickViewRechargeLimitLink();
        new WebDriverWait(driver, 2000);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "payment7", description = "填写充值金额为空", groups = "pc")
    public void setVoidValueOnRechargeTextField() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        PaymentBalancePage balancePage = paymentLoginPage.scanQrCode();
        balancePage.clickRechargeButton();
        balancePage.setInputRechargeTextField("   ");
        balancePage.clickNextStepButton();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
