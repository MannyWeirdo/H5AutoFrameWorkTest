package testPackage.navigationPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import testCases.AbstractTestCases;

public class NavigationToAboutUsPage extends AbstractTestCases {

    @Test(testName = "navigation7", description = "通过导航栏进入到关于我们页面", groups = "pc")
    public void navigationToPromotionAndCooperationPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickAboutUsLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
