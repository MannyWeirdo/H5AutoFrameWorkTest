package TestPackage.NavigationPage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import Page.NavigationPage;
import TestCases.AbstractTestCases;

public class NavigationToBusinessVersionPage extends AbstractTestCases {

    @Test(testName = "2", description = "通过导航栏进入到企业版页面")
    public void navigationToBusinessVersionPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickBusinessVersionLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
