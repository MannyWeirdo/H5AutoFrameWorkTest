package testPackage.pcNewsListPageList;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.newListPage.NewListPage;
import testCases.AbstractTestCases;

public class CompanyNewsTest extends AbstractTestCases {
	
	
	
	@Test(testName = "",description = "信息动态点进公司新闻")
	public void intoCompanyNewList() throws Exception{
		NavigationPage navigationPage = new NavigationPage(driver);
		NewListPage newListPage = navigationPage.clickNewListLink();
		newListPage.clickcompanyNewsList();
		WebReporter.log(driver, driver.getTitle(), true, true);
	}
	
	
}
