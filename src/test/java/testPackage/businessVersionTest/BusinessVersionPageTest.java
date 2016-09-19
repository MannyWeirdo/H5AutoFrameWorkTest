package testPackage.businessVersionTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.businessVersionPage.BusinessVersionPage;
import testCases.AbstractTestCases;

public class BusinessVersionPageTest extends AbstractTestCases {

    @Test(testName = "businessVersion1", description = "点击注册button，跳转注册企业账户页面", groups = "pc")

    public void clickSignUpOne() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickSignUpOne();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "businessVersion2", description = "已有账户，直接登录", groups = "pc")
    public void clickLoginLink() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickLoginLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "businessVersion3", description = "start playing the video", groups = "pc")
    public void clickPlayButton() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickStartPlayButton();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "businessVersion4", description = "纯信用融资了解更多", groups = "pc")
    public void clickKnowMoreButton() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickKnowMoreButton();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "businessVersion5", description = "click the enroll icon", groups = "pc")
    public void clickEnrollIcon() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickEnrollIcon();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "businessVersion6", description = "click the charge icon", groups = "pc")
    public void clickChargeIcon() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickRechargeIcon();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "businessVersion7", description = "click the payoff icon", groups = "pc")
    public void clickPayoffIcon() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickPayoffIcon();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "businessVersion8", description = "click the financing icon", groups = "pc")
    public void clickFinancingIcon() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickFinancingIcon();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "businessVersion9", description = "click the withdraw icon", groups = "pc")
    public void clickWithdrawIcon() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        BusinessVersionPage businessVerPage = navigationPage.clickBusinessVersionLink();
        businessVerPage.clickWithdrawIcon();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
