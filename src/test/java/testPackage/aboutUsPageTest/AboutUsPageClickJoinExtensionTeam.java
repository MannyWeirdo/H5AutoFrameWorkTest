package testPackage.aboutUsPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.aboutUsPage.AboutUsPage;
import page.pc.aboutUsPage.JDBRecruitPage;
import testCases.AbstractTestCases;

//在关于我们页面点击加入推广团队进入借贷宝招聘页面
public class AboutUsPageClickJoinExtensionTeam extends AbstractTestCases {

    @Test(testName = "aboutUs3", description = "通过点击加入推广团队进入借贷宝招聘页面", groups = "pc")
    public void AboutUsPagClickJoinExtensionTeamToJDBRecruitPageTest() throws Exception {

    	AboutUsPage aboutUsPage = new NavigationPage(driver).clickAboutUsLink();
        
        JDBRecruitPage jDBRecruitPage = aboutUsPage.clickJoinExtensionTeamLink();

        WebReporter.log(driver, driver.getTitle(), true, true);

    }
}
