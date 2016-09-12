package testPackage.FunctionDetailPage;


import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.functionDetailPage.FunctionDetailPage;
import testCases.AbstractTestCases;

	public class InvestmentLink extends AbstractTestCases {	
		
		@Test(testName = "", description = "投资")
	    public void intoInvestmentLink() throws Exception {
	        NavigationPage navigationPage = new NavigationPage(driver);
	        FunctionDetailPage functionDetailPage = navigationPage.clickFunctionDetaillLink();
	        functionDetailPage.clickInvestmentLink();
	        WebReporter.log(driver, driver.getTitle(), true, true);
		}


}
