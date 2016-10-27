package appTestPackage.rrcTest;

import org.testng.annotations.Test;

import page.app.discover.DebtDetailPage;
import page.app.discover.DiscoverPage;
import page.app.discover.RrcEntrancePage;
import page.app.discover.RrcTaskListPage;
import page.app.navigation.NavigationPage;
import testCases.AbstractTestCases;
import basicTool.appLoginTool;

import com.customize.reporter.WebReporter;

public class DidHistoryTest extends AbstractTestCases{
	
	@Test(testName = "DidHistory", description = "进入出价记录页", groups = "phone")
	public void IntoRrcTaskListPage() throws Exception {

		NavigationPage navigationPage = appLoginTool.appSimpleAccountLogin();
		DiscoverPage discoverPage = navigationPage.navigationToDiscover();
		RrcEntrancePage rrcEntrancePage = discoverPage.clickRrcButton();
		RrcTaskListPage rrcTaskListPage = rrcEntrancePage.RrcEntranceToRrcTaskListPage();
		DebtDetailPage debtDetailPage = rrcTaskListPage.ToDebtDetailPage();
		debtDetailPage.DebtDetailPageToDidHistoryPage();
		WebReporter.log(appiumDirver, true, true, true);
	}
}
	
