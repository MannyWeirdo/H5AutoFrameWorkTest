package testPackage.aboutUsPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.aboutUsPage.AboutUsPage;
import page.pc.aboutUsPage.JDBRecruitPage;
import testCases.AbstractTestCases;
//在关于我们页面点击加入我们连接进入招聘页面
public class AboutUsPagClickJoinUs extends AbstractTestCases{
       
    @Test(testName="aboutUs2",description="在关于我们页面通过点击加入我们进入借贷宝招聘页面")
    public void AboutUsPagClickJoinUsToJDBRecruitPageTest() throws Exception{
        //构建一个首页导航栏对象
        NavigationPage navigationPage=new NavigationPage(driver);
        //构建一个关于我们的页面
        AboutUsPage aboutUsPage=navigationPage.clickAboutUsLink();
        //通过点击加入我们进入借贷宝招聘页面
        JDBRecruitPage jdbRecruitPage=aboutUsPage.clickJoinUsLink();
        //截取屏幕查看是否正确
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
