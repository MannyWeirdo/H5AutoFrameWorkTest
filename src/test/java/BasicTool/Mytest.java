package BasicTool;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mytest {

    @Test
    public void MyfristTest5() throws InterruptedException {
      WebDriver wd = DriverFactory.getDriver();
      wd.get("http://www.baidu.com");
      Thread.sleep(5000);
      BaseHtmlReport.createScreenshots(wd);
      wd.get("http://www.google.com");
      Thread.sleep(10000);
      BaseHtmlReport.createScreenshots(wd);                
    }
    
 //   @Test
    public void MyfristTest6() throws InterruptedException {
        WebDriver wd = DriverFactory.getDriver();
        wd.get("http://www.baidu.com");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("http://www.google.com");
        Thread.sleep(10000);
        BaseHtmlReport.createScreenshots(wd);
        
        
    }
    
//    @Test
    public void MyfristTest7() throws InterruptedException {
        WebDriver wd = DriverFactory.getDriver();
        wd.get("http://www.baidu.com");
        Thread.sleep(5000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("http://www.google.com");
        Thread.sleep(10000);
        BaseHtmlReport.createScreenshots(wd);
        wd.get("http://www.baidu.com");
        Thread.sleep(10000);
        Assert.assertTrue(false);    
    }
}
