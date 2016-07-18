package TestPackage.NavigationPage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import Page.NavigationPage;
import TestCases.AbstractTestCases;

public class NavigationToHomePage extends AbstractTestCases {

    @Test(testName = "1", description = "通过导航栏进入到首页")
    public void navigationToHomePage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickHomePageLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
