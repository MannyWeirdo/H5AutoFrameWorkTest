package BasicTool;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.AbstractPage;
import Page.NavigationPage;
import Page.PaymentPage;

public class Mytest extends AbstractTestCases {

    @Test(description="Mytest")
    public void MyfristTest7() throws InterruptedException {

    	NavigationPage navigationPage = new NavigationPage(wd);
    	navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(wd);
        navigationPage.clickFunctionDetialLink(); 
        PaymentPage paymentPage = new PaymentPage(wd);
        BaseHtmlReport.createScreenshots(wd);
        Assert.assertTrue(false);
    }

    @Test(description="Mytest")
    public void MyfristTest6() throws InterruptedException {

    	NavigationPage navigationPage = new NavigationPage(wd);
    	navigationPage.clickPayPageLink();
        BaseHtmlReport.createScreenshots(wd);
        navigationPage.clickFunctionDetialLink(); 
        PaymentPage paymentPage = new PaymentPage(wd);
        BaseHtmlReport.createScreenshots(wd);
    }
    
    public static void main(String[] args) {
    	//IdcardClient.class.getResource("/idcheck-license.txt").getPath();
    	File rootFile = new File( AbstractTestCases.class.getResource(".").getFile());
	}

}
