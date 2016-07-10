
package BasicTool;

import org.testng.annotations.Test;

import Page.NavigationPage;
import Page.PCHomePage;
import TestCases.AbstractTestCases;

public class Mytest extends AbstractTestCases {

    @Test(testName = "1256", groups = { "Home" })
    public void MyfristTest10() throws Exception {
        System.out.println("********MyfristTest10 HOME************");
        PCHomePage pCHomePage = new PCHomePage(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickNewListLink();
        navigationPage.clickFunctionDetaillLink();
        navigationPage.clickPromotionAndCooperationLink();
        navigationPage.clickAboutWeLink();
        navigationPage.clickPayPageLink();
        navigationPage.clickBusinessVersionLink();

    }

    @Test(testName = "1257", groups = { "Payment" })
    public void MyfristTest11() throws Exception {
        System.out.println("********MyfristTest11 Payment************");
        PCHomePage pCHomePage = new PCHomePage(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickNewListLink();
        navigationPage.clickFunctionDetaillLink();
        navigationPage.clickPromotionAndCooperationLink();
        navigationPage.clickAboutWeLink();
        navigationPage.clickPayPageLink();
        navigationPage.clickBusinessVersionLink();
    }

    @Test(testName = "1257", groups = { "Home" })
    public void MyfristTest12() throws Exception {
        System.out.println("********MyfristTest12 HOME************");
        PCHomePage pCHomePage = new PCHomePage(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickNewListLink();
        navigationPage.clickFunctionDetaillLink();
        navigationPage.clickPromotionAndCooperationLink();
        navigationPage.clickAboutWeLink();
        navigationPage.clickPayPageLink();
        navigationPage.clickBusinessVersionLink();
    }

}
