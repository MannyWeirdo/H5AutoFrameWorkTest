package appTestPackage.rrcTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import abstractTestCase.AbstractTestCases;
import basicTool.appLoginTool;
import page.app.discover.DiscoverPage;
import page.app.discover.RrcEntrancePage;
import page.app.discover.RrcTaskListPage;
import page.app.navigation.NavigationPage;

public class DebtDetailTest extends AbstractTestCases {

    @Test(testName = "DebtDetailTest", description = "进入人人催债务详情页", groups = "phone")
    public void IntoRrcTaskListPage() throws Exception {
        NavigationPage navigationPage = appLoginTool.appDefaultAccountLogin();
        DiscoverPage discoverPage = navigationPage.navigationToDiscover();
        RrcEntrancePage rrcEntrancePage = discoverPage.clickRrcButton();
        RrcTaskListPage rrcTaskListPage = rrcEntrancePage.RrcEntranceToRrcTaskListPage();
        rrcTaskListPage.ToDebtDetailPage();
        WebReporter.log(appiumDirver, true, true, true);

    }
}
