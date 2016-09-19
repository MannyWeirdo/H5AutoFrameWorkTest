package testPackage.navigationPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import testCases.AbstractTestCases;

public class NavigationToBusinessVersionPage extends AbstractTestCases {

    @Test(testName = "navigation2", description = "通过导航栏进入企业版页面", groups = "pc")
    public void navigationToBusinessVersionPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickBusinessVersionLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
