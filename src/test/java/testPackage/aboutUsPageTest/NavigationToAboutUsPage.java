package testPackage.aboutUsPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.aboutUsPage.AboutUsPage;
import testCases.AbstractTestCases;

public class NavigationToAboutUsPage extends AbstractTestCases {

    @Test(testName = "aboutUs1", description = "通过导航栏进入关于我们的页面", groups = "pc")
    public void navigationToAboutPageTest() throws Exception {
    	
        NavigationPage navigationPage = new NavigationPage(driver);
        
        AboutUsPage aboutUsPage = navigationPage.clickAboutUsLink();
        
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
