package testPackage.navigationPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import testCases.AbstractTestCases;

public class NavigationToNewListPage extends AbstractTestCases {

    @Test(testName = "navigation5", description = "通过导航栏进入到新闻动态页面", groups = "pc")
    public void navigationToNewListPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickNewListLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
