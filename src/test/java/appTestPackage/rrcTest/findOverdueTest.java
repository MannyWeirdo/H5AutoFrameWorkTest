package appTestPackage.rrcTest;

import org.testng.annotations.Test;

import page.app.discover.DiscoverPage;
import page.app.discover.FindOverduePage;
import page.app.discover.RrcEntrancePage;
import page.app.navigation.NavigationPage;
import basicTool.appLoginTool;

import com.customize.reporter.WebReporter;

import testCases.AbstractTestCases;

public class findOverdueTest extends AbstractTestCases{
	@Test(testName = "rrcFindOverdueTest", description = "进入查老赖页面", groups = "phone")
	public void IntoFindOverduePage() throws Exception {
        NavigationPage navigationPage = appLoginTool.appSimpleAccountLogin();
        DiscoverPage discoverPage = navigationPage.navigationToDiscover();        
        RrcEntrancePage rrcEntrancePage = discoverPage.clickRrcButton();
        FindOverduePage findOverduePage = rrcEntrancePage.RrcEntranceToFindOverduePage();
        findOverduePage.search("18813199946");
        WebReporter.log(appiumDirver, true, true, true);
}
	
}
