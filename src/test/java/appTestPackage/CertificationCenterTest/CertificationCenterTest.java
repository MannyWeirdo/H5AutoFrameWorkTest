package appTestPackage.CertificationCenterTest;

import org.testng.annotations.Test;

import page.app.navigation.NavigationPage;
import page.app.wallet.PersonalInformationPage;
import page.app.wallet.WalletPage;
import basicTool.appLoginTool;
import testCases.AbstractTestCases;

public class CertificationCenterTest extends AbstractTestCases{
	@Test(testName = "CertificationCenterTest", description = "进入认证中心页面", groups = "phone")
	public void IntoCertificationCenterPage() throws Exception{
		NavigationPage navigationPage = appLoginTool.appSimpleAccountLogin();
		WalletPage walletPage = navigationPage.navigationToWallet();
		PersonalInformationPage personalInformationPage = walletPage.ToPersonalInformatinPage();
		personalInformationPage.ToCertificationCenterPage();
		
	}
}
