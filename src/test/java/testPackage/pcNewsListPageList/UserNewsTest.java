package testPackage.pcNewsListPageList;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.newListPage.NewListPage;
import testCases.AbstractTestCases;

public class UserNewsTest extends AbstractTestCases {

    @Test(testName = "pcNewsList3", description = "信息动态点进用户故事", groups = "pc")
    public void intoUserNewList() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        NewListPage newListPage = navigationPage.clickNewListLink();
        newListPage.clickUserNewsList();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
