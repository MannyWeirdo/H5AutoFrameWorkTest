package appTestPackage.activityTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import basicTool.appLoginTool;
import page.app.discover.ActivityPage;
import page.app.discover.DiscoverPage;
import page.app.navigation.NavigationPage;
import testCases.AbstractTestCases;

public class IntoH5ActivityPageByActivity extends AbstractTestCases {
    @Test(testName = "Activity1", description = "进入hybrid的第一个活动页面", groups = "phone")
    public void IntoTheFristH5ActivityPage() throws Exception {
        NavigationPage navigationPage = appLoginTool.appDefaultAccountLogin();
        DiscoverPage discoverPage = navigationPage.navigationToDiscover();
        ActivityPage activityPage = discoverPage.clickActivityButton();
        activityPage.intoActivelPageByNum(0);
        WebReporter.log(appiumDirver, true, true, true);
    }

}
