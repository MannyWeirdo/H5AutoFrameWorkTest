
package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import Page.NavigationPage;
import Page.NewListPage;
import Page.PCHomePage;
import Page.Mytest.TestPage;
import TestCases.AbstractTestCases;

public class Mytest extends AbstractTestCases {

    @Test(testName = "1256")
    public void MyfristTest10() throws Exception {
        System.out.println("********MyfristTest10 HOME************");
        PCHomePage pCHomePage = new PCHomePage(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        NewListPage newListPage = navigationPage.clickNewListLink();
        navigationPage.clickFunctionDetaillLink();
        navigationPage.clickPromotionAndCooperationLink();
        navigationPage.clickAboutUsLink();
        navigationPage.clickPayPageLink();
        navigationPage.clickBusinessVersionLink();
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "1257")
    public void MyfristTest11() throws Exception {
        System.out.println("********MyfristTest11 Payment************");
        PCHomePage pCHomePage = new PCHomePage(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickNewListLink();
        navigationPage.clickFunctionDetaillLink();
        navigationPage.clickPromotionAndCooperationLink();
        navigationPage.clickAboutUsLink();
        navigationPage.clickPayPageLink();
        navigationPage.clickBusinessVersionLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "1257")
    public void MyfristTest12() throws Exception {
        System.out.println("********MyfristTest12 HOME************");
        PCHomePage pCHomePage = new PCHomePage(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickNewListLink();
        navigationPage.clickFunctionDetaillLink();
        navigationPage.clickPromotionAndCooperationLink();
        navigationPage.clickAboutUsLink();
        navigationPage.clickPayPageLink();
        navigationPage.clickBusinessVersionLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
        Assert.assertTrue(false);

    }

    // @Test(testName = "1258", groups = { "Home" })
    public void MyfristTest13() throws Exception {
        System.out.println("********MyfristTest13 HOME************");
        TestPage testPage = new TestPage(driver);
    }

}
