package testPackage.EnterprisePageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.enterprisePage.EnterprisePCPage;
import page.pc.enterprisePage.HelpPCPage;
import testCases.AbstractTestCases;

public class EnterprisePageToHelpPage extends AbstractTestCases{
    @Test(testName="enterpriseHelpPage1",description="在企业版页面进入帮助页", groups = "pc")
    public void EnterpriselToHelpPage() throws Exception{
        NavigationPage navigation=new NavigationPage(driver);
        //进入企业版页面
        EnterprisePCPage enterprisePCPage=navigation.clickEnterpriseLink();
        //进入帮助页面
        HelpPCPage helpPCPage=enterprisePCPage.clickHelpLink();
       // helpPCPage.ClickPayBenefits();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
}
