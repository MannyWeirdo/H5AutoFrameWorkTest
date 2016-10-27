package appTestPackage.rrcTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import basicTool.appLoginTool;
import page.app.discover.DiscoverPage;
import page.app.navigation.NavigationPage;
import testCases.AbstractTestCases;

public class rrcEntranceTest extends AbstractTestCases {

    @Test(testName = "rrcEntranceTest", description = "进入人人催页面", groups = "phone")
    public void IntoRrcEntrancePage() throws Exception {
        NavigationPage navigationPage = appLoginTool.appDefaultAccountLogin();
        DiscoverPage discoverPage = navigationPage.navigationToDiscover();
        discoverPage.clickRrcButton();
        WebReporter.log(appiumDirver, true, true, true);
    }
}
