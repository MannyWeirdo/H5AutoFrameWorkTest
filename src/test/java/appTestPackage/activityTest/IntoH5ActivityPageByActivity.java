package appTestPackage.activityTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import abstractTestCase.AbstractTestCases;
import basicTool.appLoginTool;
import page.app.discover.ActivityPage;
import page.app.discover.DiscoverPage;
import page.app.navigation.NavigationPage;

public class IntoH5ActivityPageByActivity extends AbstractTestCases {
    @Test(testName = "Activity1", description = "通过活动入口进入随便一个活动页面", groups = "phone")
    public void IntoTheFristH5ActivityPage() throws Exception {
        NavigationPage navigationPage = appLoginTool.appDefaultAccountLogin();
        DiscoverPage discoverPage = navigationPage.navigationToDiscover();
        ActivityPage activityPage = discoverPage.clickActivityButton();
        activityPage.intoActivelPageByNum(1);
        WebReporter.log(appiumDirver, true, true, true);
    }

}
