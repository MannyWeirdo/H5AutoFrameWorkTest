package testPackage.pcNewsListPageList;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.newListPage.NewListPage;
import testCases.AbstractTestCases;

public class ProductNewsTest extends AbstractTestCases {

    @Test(testName = "pcNewsList2", description = "信息动态点进产品新闻", groups = "pc")
    public void intoProductNewList() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        NewListPage newListPage = navigationPage.clickNewListLink();
        newListPage.clickProductNewsList();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
