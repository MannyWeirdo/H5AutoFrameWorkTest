package BasicTool;

import org.testng.annotations.Test;

import Filter.GROUP;
import Page.NavigationPage;
import Page.PaymentPage;
import Report.BaseHtmlReport;
import TestCases.AbstractTestCases;
import Tool.PageFactroy;

public class Mytest extends AbstractTestCases {

    @Test(testName = "1256", groups = { "Home" }, description = "")
    public void MyfristTest6() throws InterruptedException {
        wd.get("http://www.jiedaibao.com/pcIndex.html");
        BaseHtmlReport.createScreenshots(wd);
        NavigationPage navigationPage = PageFactroy.getPageObject(NavigationPage.class, wd);
        navigationPage.clickFunctionDetialLink();
        BaseHtmlReport.createScreenshots(wd);
        navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(wd);
        PaymentPage paymentPage = PageFactroy.getPageObject(PaymentPage.class, wd);

    }

    @Test(testName = "12562", groups = { "Payment" })
    public void MyfristTest7() throws InterruptedException {
        wd.get("http://www.jiedaibao.com/pcIndex.html");
        BaseHtmlReport.createScreenshots(wd);
        NavigationPage navigationPage = PageFactroy.getPageObject(NavigationPage.class, wd);
        navigationPage.clickFunctionDetialLink();
        BaseHtmlReport.createScreenshots(wd);
        navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(wd);
        PaymentPage paymentPage = PageFactroy.getPageObject(PaymentPage.class, wd);

    }

    @Test(testName = "1256", groups = { "Home" })
    public void MyfristTest9() throws InterruptedException {
        wd.get("http://www.jiedaibao.com/pcIndex.html");
        BaseHtmlReport.createScreenshots(wd);
        NavigationPage navigationPage = PageFactroy.getPageObject(NavigationPage.class, wd);
        navigationPage.clickFunctionDetialLink();
        BaseHtmlReport.createScreenshots(wd);
        navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(wd);
        PaymentPage paymentPage = PageFactroy.getPageObject(PaymentPage.class, wd);

    }

}
