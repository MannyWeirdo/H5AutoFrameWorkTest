package appTestPackage.rrcTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import basicTool.appLoginTool;
import page.app.discover.DiscoverPage;
import page.app.discover.RrcEntrancePage;
import page.app.navigation.NavigationPage;
import testCases.AbstractTestCases;

public class rrcTaskListTest extends AbstractTestCases {

    @Test(testName = "rrcTaskListTest", description = "进入人人催催收任务列表页", groups = "phone")
    public void IntoRrcTaskListPage() throws Exception {
        NavigationPage navigationPage = appLoginTool.appDefaultAccountLogin();
        DiscoverPage discoverPage = navigationPage.navigationToDiscover();
        RrcEntrancePage rrcEntrancePage = discoverPage.clickRrcButton();
        rrcEntrancePage.RrcEntranceToRrcTaskListPage();
        WebReporter.log(appiumDirver, true, true, true);
    }
}