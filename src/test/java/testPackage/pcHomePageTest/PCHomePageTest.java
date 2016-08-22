package testPackage.pcHomePageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import TestCases.AbstractTestCases;
import page.pc.NavigationPage;
import page.pc.homePage.PCHomePage;

public class PCHomePageTest extends AbstractTestCases {

   // @Test(testName = "1", description = "扫二维码下载")
    public void moveToDownloadByQRCode() throws Exception {

        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.moveToTempPart2();
        pCHomePage.moveToDownloadNowByQRCode();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

  //   @Test(testName = "2", description = "按系统下载")
    public void moveToDownloadBySystem() throws Exception {

        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.moveToTempPart2();
        pCHomePage.moveToDownloadNowBySystem();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

 //    @Test(testName = "3", description = "iOS下载")
    public void movetoDownloadNowByiOS() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.moveToTempPart2();
        pCHomePage.moveToDownloadNowBySystem();
        pCHomePage.moveToDownloadNowByiOS();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

     @Test(testName = "4", description = "Android下载")
    public void movetoDownloadNowByAndroid() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.moveToTempPart2();
        pCHomePage.moveToDownloadNowBySystem();
        pCHomePage.moveToDownloadNowByAndroid();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }


}
