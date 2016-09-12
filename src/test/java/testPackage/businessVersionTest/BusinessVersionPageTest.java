package testPackage.businessVersionTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.businessVersionPage.BusinessVersionPage;
import testCases.AbstractTestCases;

public class BusinessVersionPageTest extends AbstractTestCases {

    @Test(testName = "1", description = "点击注册button，跳转注册企业账户页面")

    public void clickSignUpOne() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickSignUpOne();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "2", description = "已有账户，直接登录")
    public void clickLoginLink() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickLoginLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "3", description = "纯信用融资了解更多")
    public void clickKnowMoreButton() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickKnowMoreButton();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
