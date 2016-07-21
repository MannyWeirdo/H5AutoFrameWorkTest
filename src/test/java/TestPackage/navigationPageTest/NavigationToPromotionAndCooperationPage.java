package TestPackage.navigationPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import Page.NavigationPage;
import TestCases.AbstractTestCases;

public class NavigationToPromotionAndCooperationPage extends AbstractTestCases {

    @Test(testName = "6", description = "通过导航栏进入到推广合作页面")
    public void navigationToPromotionAndCooperationPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickPromotionAndCooperationLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
