package testPackage.navigationPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import TestCases.AbstractTestCases;
import page.pc.NavigationPage;

public class NavigationToFunctionDetailPage extends AbstractTestCases {

    @Test(testName = "4", description = "通过导航栏进入到功能介绍页面")
    public void navigationToFunctionDetailPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickFunctionDetaillLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
