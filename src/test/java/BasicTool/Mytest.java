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
        wd.get("http://www.jiedaibao.com/pcIndex.html");
        BaseHtmlReport.createScreenshots(wd);
        NavigationPage navigationPage = new NavigationPage(wd);
        navigationPage.clickFunctionDetialLink();
        BaseHtmlReport.createScreenshots(wd);
        navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(wd);
        PaymentPage paymentPage = new PaymentPage(wd);
        TestPage m  = new TestPage(wd);

    }

    @Test(testName = "12562", groups = { "Payment" })
    public void MyfristTest7() throws InterruptedException {
        wd.get("http://www.jiedaibao.com/pcIndex.html");
        BaseHtmlReport.createScreenshots(wd);
        NavigationPage navigationPage = new NavigationPage(wd);
        navigationPage.clickFunctionDetialLink();
        BaseHtmlReport.createScreenshots(wd);
        navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(wd);
        PaymentPage paymentPage = new PaymentPage(wd);
        TestPage m  = new TestPage(wd);

    }

    @Test(testName = "1256", groups = { "Home" })
    public void MyfristTest9() throws InterruptedException {
        BaseHtmlReport.createScreenshots(wd);
        NavigationPage navigationPage = new NavigationPage(wd);
        navigationPage.clickFunctionDetialLink();
        BaseHtmlReport.createScreenshots(wd);
        navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(wd);
        PaymentPage paymentPage = new PaymentPage(wd);
        TestPage m  = new TestPage(wd);

    }
    

}
