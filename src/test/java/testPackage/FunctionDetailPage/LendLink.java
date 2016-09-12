package testPackage.FunctionDetailPage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.functionDetailPage.FunctionDetailPage;
import testCases.AbstractTestCases;

	public class LendLink extends AbstractTestCases {	
		
		@Test(testName = "", description = "借钱")
	    public void intoLendLink() throws Exception {
	        NavigationPage navigationPage = new NavigationPage(driver);
	        FunctionDetailPage functionDetailPage = navigationPage.clickFunctionDetaillLink();
	        functionDetailPage.clickLendLink();
	        WebReporter.log(driver, driver.getTitle(), true, true);
		}

}
