package BasicTool;

import org.testng.annotations.Test;

import Page.NavigationPage;
import Page.PaymentPage;
import Tool.PageFactroy;

public class Mytest extends AbstractTestCases {
    @Test
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

}
