
package testPackage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import dataBean.app.login.UserBean;
import page.pc.homePage.PCHomePage;
import page.pc.livePage.LivePage;
import page.pc.loginPage.LoginPage;
import page.pc.navigationPage.NavigationPage;
import testCases.AbstractTestCases;

public class Mytest extends AbstractTestCases {

	UserBean userBean;

    @Test(testName = "1257", description = "", groups = "pc")
    public void LoginTest() throws Exception {
        PCHomePage pchomePage = new PCHomePage(driver);
        LoginPage loginPage = pchomePage.gotoLoginPage();
        pchomePage = loginPage.login("13295422111", "xiaoyang00x");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }
    
    @Test(testName = "1258", description = "", groups = "pc")
    public void gotoLivePage() throws Exception {
        PCHomePage pchomePage = new PCHomePage(driver);
        LoginPage loginPage = pchomePage.gotoLoginPage();
        pchomePage = loginPage.login("13295422111", "xiaoyang00x");
        NavigationPage navigationPage = new NavigationPage(driver);      
        LivePage livePage = navigationPage.navigationLivePage();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
