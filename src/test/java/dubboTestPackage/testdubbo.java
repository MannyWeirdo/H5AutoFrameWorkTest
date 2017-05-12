package dubboTestPackage;

import org.testng.annotations.Test;

import abstractTestCase.AbstractTestCases;

public class testdubbo extends AbstractTestCases{

    @Test(testName = "1010", description = "", groups = "dubbo")
    public void dubbo() throws Exception {
        //PCHomePage pchomePage = new PCHomePage(driver);
//        LoginPage loginPage = pchomePage.gotoLoginPage();
//        pchomePage = loginPage.login("13295422111", "xiaoyang00x");
//        NavigationPage navigationPage = new NavigationPage(driver);      
//        LivePage livePage = navigationPage.navigationLivePage();
 //      WebReporter.log(driver, driver.getTitle(), true, true);
        System.out.println("测试dubbo的");
    }   
}
