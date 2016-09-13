package testPackage.FunctionDetailPage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.functionDetailPage.FunctionDetailPage;
import testCases.AbstractTestCases;

	public class EarnSpreadsLink extends AbstractTestCases {	
		
		@Test(testName = "", description = "赚利差")
	    public void intoEarnSpreadsLink() throws Exception {
	        NavigationPage navigationPage = new NavigationPage(driver);
	        FunctionDetailPage functionDetailPage = navigationPage.clickFunctionDetaillLink();
	        functionDetailPage.clickEarnSpreadsLink();
	        WebReporter.log(driver, driver.getTitle(), true, true);
		    }
}