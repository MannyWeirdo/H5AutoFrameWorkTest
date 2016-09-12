package testPackage.FunctionDetailPage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.functionDetailPage.FunctionDetailPage;
import testCases.AbstractTestCases;

	public class RewardLink extends AbstractTestCases {	
		
		@Test(testName = "", description = "悬赏")
	    public void intoRewardLink() throws Exception {
	        NavigationPage navigationPage = new NavigationPage(driver);
	        FunctionDetailPage functionDetailPage = navigationPage.clickFunctionDetaillLink();
	        functionDetailPage.clickRewardLink();
	        WebReporter.log(driver, driver.getTitle(), true, true);
            }
}
