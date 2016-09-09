package testPackage.pcNewsListPageList;

import org.testng.annotations.Test;

import page.pc.NavigationPage;
import page.pc.newListPage.NewListPage;
import testCases.AbstractTestCases;

import com.customize.reporter.WebReporter;

public class ProductNewsTest extends AbstractTestCases{
	
	@Test(testName = "",description = "信息动态点进产品新闻")
	public void intoProductNewList() throws Exception{
		NavigationPage navigationPage = new NavigationPage(driver);
		NewListPage newListPage = navigationPage.clickNewListLink();
		newListPage.clickProductNewsList();
		WebReporter.log(driver, driver.getTitle(), true, true);
	}
	
}



