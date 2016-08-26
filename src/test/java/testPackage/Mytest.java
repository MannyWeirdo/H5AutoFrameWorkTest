
package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import TestCases.AbstractTestCases;
import dataBean.app.login.UserBean;
import dataTool.DataFactory;
import page.app.setup.FristSwipePage;
import page.app.setup.LoginPage;
import page.pc.NavigationPage;
import page.pc.NewListPage;
import page.pc.homePage.PCHomePage;

public class Mytest extends AbstractTestCases {

    UserBean userBean;

    // @Test(testName = "1256")
    public void MyfristTest10() throws Exception {
        System.out.println("********MyfristTest10 HOME************");
        PCHomePage pCHomePage = new PCHomePage(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        NewListPage newListPage = navigationPage.clickNewListLink();
        navigationPage.clickFunctionDetaillLink();
        navigationPage.clickPromoterApplyLink();
        navigationPage.clickAboutUsLink();
        navigationPage.clickPayPageLink();
        navigationPage.clickBusinessVersionLink();

    }

    // @Test(testName = "1257")
    public void MyfristTest11() throws Exception {
        System.out.println("********MyfristTest11 Payment************");
        PCHomePage pCHomePage = new PCHomePage(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickNewListLink();
        navigationPage.clickFunctionDetaillLink();
        navigationPage.clickPromoterApplyLink();
        navigationPage.clickAboutUsLink();
        navigationPage.clickBusinessVersionLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    // @Test(testName = "1257")
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
        Assert.assertTrue(false);

    }

    @Test(testName = "1")
    public void MyfristTest14() throws Exception {
        userBean = DataFactory.GetData(UserBean.class);
        FristSwipePage fristSwipePage = new FristSwipePage(appiumDirver);
        LoginPage loginPage = fristSwipePage.finishSwipe();
        loginPage.login(userBean);
        WebReporter.log(appiumDirver, true, true, true);

    }

    // @Test(testName = "2")
    public void MyfristTest15() throws Exception {
        System.out.println("********MyfristTest10 HOME************");
        WebReporter.log(appiumDirver, true, true, true);
        WebReporter.log(appiumDirver, true, true, true);
        WebReporter.log(appiumDirver, true, true, true);

    }

    // @Test(testName = "3")
    public void MyfristTest16() throws Exception {
        System.out.println("********MyfristTest10 HOME************");
        WebReporter.log(appiumDirver, true, true, true);
        WebReporter.log(appiumDirver, true, true, true);
        WebReporter.log(appiumDirver, true, true, true);

    }

    // @Test(testName = "4")
    public void MyfristTest17() throws Exception {
        System.out.println("********MyfristTest10 HOME************");
        WebReporter.log(appiumDirver, true, true, true);
        WebReporter.log(appiumDirver, true, true, true);
        WebReporter.log(appiumDirver, true, true, true);
        Assert.assertTrue(false);

    }

}
