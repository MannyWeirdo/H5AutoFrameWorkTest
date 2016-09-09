
package testPackage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import basicTool.appLoginTool;
import dataBean.app.login.UserBean;
import page.pc.NavigationPage;
import page.pc.homePage.PCHomePage;
import testCases.AbstractTestCases;

public class Mytest extends AbstractTestCases {

    UserBean userBean;

<<<<<<< Updated upstream
    @Test(testName = "1257")
=======
     @Test(testName = "1257")
>>>>>>> Stashed changes
    public void MyfristTest12() throws Exception {
        System.out.println("********MyfristTest12 HOME************");
        PCHomePage pCHomePage = new PCHomePage(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickNewListLink();
        navigationPage.clickFunctionDetaillLink();
        navigationPage.clickPromoterApplyLink();
        navigationPage.clickAboutUsLink();
        navigationPage.clickPayPageLink();
        navigationPage.clickBusinessVersionLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
        // Assert.assertTrue(false);

    }

<<<<<<< Updated upstream
    // @Test(testName = "1")
=======
   // @Test(testName = "1")
>>>>>>> Stashed changes
    public void MyfristTest14() throws Exception {
        appLoginTool.appSimpleAccountLogin();
        WebReporter.log(appiumDirver, true, true, true);

    }

}
