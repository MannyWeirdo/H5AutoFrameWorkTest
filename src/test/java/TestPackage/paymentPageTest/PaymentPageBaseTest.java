package TestPackage.paymentPageTest;

import Page.NavigationPage;
import Page.Payment.PaymentBalancePage;
import Page.Payment.PaymentLoginPage;
import TestCases.AbstractTestCases;

public class PaymentPageBaseTest extends AbstractTestCases {
	public PaymentBalancePage loginPaymentPage(String loginDevice) throws Exception {
    	NavigationPage navigationPage = new NavigationPage(driver);
        PaymentLoginPage paymentLoginPage = navigationPage.clickPayPageLink();
        if("IOS".equals(loginDevice)) {
        	return paymentLoginPage.scanQrCodeByIOS();
        }
        return paymentLoginPage.scanQrCodeByANDRIOD();
    }
}
