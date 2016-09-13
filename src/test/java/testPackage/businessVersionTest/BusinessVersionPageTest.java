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

    @Test(testName = "3", description = "start playing the video")
    public void clickPlayButton() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickStartPlayButton();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "4", description = "纯信用融资了解更多")
    public void clickKnowMoreButton() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickKnowMoreButton();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "5", description = "click the enroll icon")
    public void clickEnrollIcon() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickEnrollIcon();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "6", description = "click the charge icon")
    public void clickChargeIcon() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickRechargeIcon();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "7", description = "click the payoff icon")
    public void clickPayoffIcon() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickPayoffIcon();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "8", description = "click the financing icon")
    public void clickFinancingIcon() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickFinancingIcon();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "9", description = "click the withdraw icon")
    public void clickWithdrawIcon() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickWithdrawIcon();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
