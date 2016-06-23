package BasicTool;

import org.testng.annotations.Test;

import Page.NavigationPage;
import Page.PaymentPage;
import Page.Mytest.TestPage;
import Report.BaseHtmlReport;
import TestCases.AbstractTestCases;

public class Mytest extends AbstractTestCases {

    @Test(testName = "1256", groups = { "Payment" }, description = "")
    public void MyfristTest6() throws InterruptedException {
        driver.get("http://www.jiedaibao.com/pcIndex.html");
        BaseHtmlReport.createScreenshots(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickFunctionDetialLink();
        BaseHtmlReport.createScreenshots(driver);
        navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        TestPage m = new TestPage(driver);

    }

    @Test(testName = "12562", groups = { "Payment" })
    public void MyfristTest7() throws InterruptedException {
        driver.get("http://www.jiedaibao.com/pcIndex.html");
        BaseHtmlReport.createScreenshots(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickFunctionDetialLink();
        BaseHtmlReport.createScreenshots(driver);
        navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        TestPage m = new TestPage(driver);

    }

    @Test(testName = "1256", groups = { "Home" })
    public void MyfristTest9() throws InterruptedException {
        BaseHtmlReport.createScreenshots(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickFunctionDetialLink();
        BaseHtmlReport.createScreenshots(driver);
        navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        TestPage m = new TestPage(driver);

    }

}
