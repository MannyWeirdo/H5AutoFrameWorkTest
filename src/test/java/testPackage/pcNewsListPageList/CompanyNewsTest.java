package testPackage.pcNewsListPageList;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.newListPage.NewListPage;
import testCases.AbstractTestCases;

public class CompanyNewsTest extends AbstractTestCases {

    @Test(testName = "pcNewsList1", description = "信息动态点进公司新闻", groups = "pc")
    public void intoCompanyNewList() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        NewListPage newListPage = navigationPage.clickNewListLink();
        newListPage.clickcompanyNewsList();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
