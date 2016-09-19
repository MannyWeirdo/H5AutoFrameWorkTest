package testPackage.pcHomePageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.homePage.PCHomePage;
import testCases.AbstractTestCases;

public class PCHomePageTest extends AbstractTestCases {

    @Test(testName = "pcHome1", description = "点击切换到 first banner", groups = "pc")
    public void pointerFirstBannerButton() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.pointerFirstBannerButton();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "pcHome2", description = "点击切换到 second banner", groups = "pc")
    public void pointerSecondBannerButton() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.pointerSecondBannerButton();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "pcHome3", description = "切换至first banner 点击跳转至企业版", groups = "pc")
    public void goToBusinessVersionPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.goToBusinessVersionPage();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "pcHome4", description = "切换至second banner后，立刻下载QR", groups = "pc")
    public void downloadNow() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.downloadNow();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "pcHome5", description = "切换至second banner后，去观看视频", groups = "pc")
    public void toWatchVideo() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.toWatchVideo();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "pcHome6", description = "切换至second banner后，点击play button 播放视频", groups = "pc")
    public void clickAndPlayVideo() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.clickAndPlayVideo();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "pcHome7", description = "扫二维码下载", groups = "pc")
    public void moveToDownloadByQRCode() throws Exception {

        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.moveToTempPart2();
        pCHomePage.moveToDownloadNowByQRCode();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "pcHome8", description = "按系统下载", groups = "pc")
    public void moveToDownloadBySystem() throws Exception {

        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.moveToTempPart2();
        pCHomePage.moveToDownloadNowBySystem();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "pcHome9", description = "iOS下载", groups = "pc")
    public void movetoDownloadNowByiOS() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.moveToTempPart2();
        pCHomePage.moveToDownloadNowBySystem();
        pCHomePage.moveToDownloadNowByiOS();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "pcHome10", description = "Android下载", groups = "pc")
    public void movetoDownloadNowByAndroid() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.moveToTempPart2();
        pCHomePage.moveToDownloadNowBySystem();
        pCHomePage.moveToDownloadNowByAndroid();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "pcHome11", description = "点击 阅读更多 新闻", groups = "pc")
    public void readMoreNews() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        PCHomePage pCHomePage = navigationPage.clickHomePageLink();
        pCHomePage.readMoreNews();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
