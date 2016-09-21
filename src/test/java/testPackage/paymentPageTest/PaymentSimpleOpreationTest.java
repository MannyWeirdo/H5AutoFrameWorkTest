package testPackage.paymentPageTest;

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

}
