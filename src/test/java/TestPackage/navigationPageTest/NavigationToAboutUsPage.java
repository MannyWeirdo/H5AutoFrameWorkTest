package TestPackage.navigationPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import Page.NavigationPage;
import TestCases.AbstractTestCases;

public class NavigationToAboutUsPage extends AbstractTestCases {

    @Test(testName = "7", description = "通过导航栏进入到关于我们页面")
    public void navigationToPromotionAndCooperationPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickAboutWeLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
