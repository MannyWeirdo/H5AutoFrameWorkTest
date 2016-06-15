package BasicTool;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mytest extends AbstractTestCases {
     @Test
    public void MyfristTest5() throws InterruptedException {
        wd.get("http://www.jiedaibao.com/pcIndex.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://qiye.jiedaibao.com/#/home");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://chongzhi.jiedaibao.com/");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/functionDetail.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/pcNewsList.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/partials/aboutUs/promoterApply.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/pcAbout.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("http://www.jiedaibao.com/pcIndex.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://qiye.jiedaibao.com/#/home");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://chongzhi.jiedaibao.com/");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/functionDetail.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/pcNewsList.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/partials/aboutUs/promoterApply.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/pcAbout.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
    }

    @Test
    public void MyfristTest6() throws InterruptedException {
        wd.get("http://www.baidu.com");
        baiduPage page = new baiduPage(wd);
        page.MyTestFunction();
        // wd.findElement(By.id("kw")).sendKeys("CoderInfo");
        // wd.findElement(By.id("su")).click();
        // searchTextField.sendKeys("Symbio大傻逼公司");
        // clickButton.click();
        // BaseHtmlReport.createScreenshots(wd);
        // wd.get("http://www.bing.com");
        // Thread.sleep(3000);
        // bSearchTextField.sendKeys("Symbio大傻逼公司");
        // bClickButton.click();
        // BaseHtmlReport.createScreenshots(wd);

    }

    @Test
    public void MyfristTest7() throws InterruptedException {

        wd.get("http://www.jiedaibao.com/pcIndex.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://qiye.jiedaibao.com/#/home");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://chongzhi.jiedaibao.com/");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/functionDetail.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/pcNewsList.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/partials/aboutUs/promoterApply.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("https://www.jiedaibao.com/pcAbout.html");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        Assert.assertTrue(false);
    }

}
