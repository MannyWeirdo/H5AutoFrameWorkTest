package testPackage.FunctionDetailPage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.functionDetailPage.FunctionDetailPage;
import testCases.AbstractTestCases;

	public class VoipLink extends AbstractTestCases {	
		
		@Test(testName = "", description = "免费电话")
	    public void intoVoipLink() throws Exception {
	        NavigationPage navigationPage = new NavigationPage(driver);
	        FunctionDetailPage functionDetailPage = navigationPage.clickFunctionDetaillLink();
	        functionDetailPage.clickVoipLink();
	        WebReporter.log(driver, driver.getTitle(), true, true);
		    }
}