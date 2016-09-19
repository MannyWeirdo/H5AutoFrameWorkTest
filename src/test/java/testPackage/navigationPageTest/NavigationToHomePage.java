package testPackage.navigationPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import testCases.AbstractTestCases;

public class NavigationToHomePage extends AbstractTestCases {

    @Test(testName = "navigation1", description = "通过导航栏进入到首页", groups = "pc")
    public void navigationToHomePage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickHomePageLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
