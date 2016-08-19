package testPackage.navigationPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import TestCases.AbstractTestCases;
import page.NavigationPage;

public class NavigationToBusinessVersionPage extends AbstractTestCases {

    @Test(testName = "2", description = "通过导航栏进入到企业版页面")
    public void navigationToBusinessVersionPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickBusinessVersionLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
