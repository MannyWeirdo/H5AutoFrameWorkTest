package TestPackage.navigationPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import Page.NavigationPage;
import TestCases.AbstractTestCases;

public class NavigationToFunctionDetailPage extends AbstractTestCases {

    @Test(testName = "4", description = "通过导航栏进入到功能介绍页面")
    public void navigationToFunctionDetailPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickFunctionDetaillLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
