package BasicTool;

import org.testng.annotations.Test;

import Page.FunctionDetailPage;
import Page.NavigationPage;
import Page.PaymentPage;
import Page.Mytest.TestPage;
import Report.BaseHtmlReport;
import TestCases.AbstractTestCases;

public class Mytest extends AbstractTestCases {

    @Test(testName = "1256", groups = { "Payment" }, description = "")
    public void MyfristTest6() throws Exception {
        driver.get("http://www.jiedaibao.com/pcIndex.html");
        BaseHtmlReport.createScreenshots(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickFunctionDetaillLink();
        BaseHtmlReport.createScreenshots(driver);
        navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        TestPage m = new TestPage(driver);

    }

    @Test(testName = "12562", groups = { "Payment" })
    public void MyfristTest7() throws Exception {
        driver.get("http://www.jiedaibao.com/pcIndex.html");
        BaseHtmlReport.createScreenshots(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickFunctionDetaillLink();
        BaseHtmlReport.createScreenshots(driver);
        navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        TestPage m = new TestPage(driver);

    }

    @Test(testName = "1256", groups = { "Home" })
    public void MyfristTest9() throws Exception {
        BaseHtmlReport.createScreenshots(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        FunctionDetailPage functionDetailPage = navigationPage.clickFunctionDetaillLink();
        BaseHtmlReport.createScreenshots(driver);
        PaymentPage paymentPage = navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(driver);
        TestPage m = new TestPage(driver);

    }

}
