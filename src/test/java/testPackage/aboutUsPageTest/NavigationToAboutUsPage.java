package testPackage.aboutUsPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.aboutUsPage.AboutUsPage;
import testCases.AbstractTestCases;

public class NavigationToAboutUsPage extends AbstractTestCases{
    
    @Test(testName="aboutUs1",description="通过导航栏进入关于我们的页面")
    public void navigationToAboutPageTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        //通过点击关于我们的连接进入关于我们的页面
        AboutUsPage aboutUsPage=navigationPage.clickAboutUsLink();
        //进入页面后进行截屏处理
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
