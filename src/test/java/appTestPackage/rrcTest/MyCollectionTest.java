package appTestPackage.rrcTest;

import org.testng.annotations.Test;

import page.app.discover.DiscoverPage;
import page.app.discover.RrcEntrancePage;
import page.app.discover.RrcTaskListPage;
import page.app.navigation.NavigationPage;
import basicTool.appLoginTool;

import com.customize.reporter.WebReporter;

import testCases.AbstractTestCases;

public class MyCollectionTest extends AbstractTestCases{
	
	@Test(testName = "myCollection", description = "进入我的催收", groups = "phone")
	public void IntoRrcTaskListPage() throws Exception {
		NavigationPage navigationPage = appLoginTool.appSimpleAccountLogin();
		DiscoverPage discoverPage = navigationPage.navigationToDiscover();
		RrcEntrancePage rrcEntrancePage = discoverPage.clickRrcButton();
		RrcTaskListPage rrcTaskListPage = rrcEntrancePage.RrcEntranceToRrcTaskListPage();
		rrcTaskListPage.ToMyCollectionPage();
		WebReporter.log(appiumDirver, true, true, true);
	}

}
