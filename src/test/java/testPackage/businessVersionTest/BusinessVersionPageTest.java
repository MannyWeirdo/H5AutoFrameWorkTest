package testPackage.businessVersionTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.businessVersionPage.BusinessVersionPage;
import testCases.AbstractTestCases;


public class BusinessVersionPageTest extends AbstractTestCases{
	
	//Test(testName = "1", description = "璺宠浆鍒颁紒涓氭敞鍐岄〉闈�)
	public void clickSignUpOne() throws Exception{
		NavigationPage navigationPage = new NavigationPage(driver);
		BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
		businessVerPage.clickSignUpOne();
		WebReporter.log(driver, driver.getTitle(), true, true);
	}
	
	//@Test(testName = "2", description = "宸叉湁璐﹀彿锛岀洿鎺ョ櫥褰�)
	public void clickLoginLink() throws Exception{
		NavigationPage navigationPage = new NavigationPage(driver);
		BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
		businessVerPage.clickLoginLink();
		WebReporter.log(driver, driver.getTitle(), true, true);
	}
	
	@Test(testName = "3", description = "浜嗚В鏇村")
	public void clickKnowMoreButton() throws Exception{
		NavigationPage navigationPage = new NavigationPage(driver);
		BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
		businessVerPage.clickKnowMoreButton();
		WebReporter.log(driver, driver.getTitle(), true, true);
	}

}
