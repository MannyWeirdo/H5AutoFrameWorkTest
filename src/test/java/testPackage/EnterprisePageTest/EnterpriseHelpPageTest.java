package testPackage.EnterprisePageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.enterprisePage.EnterprisePCPage;
import page.pc.enterprisePage.HelpPCPage;
import testCases.AbstractTestCases;

public class EnterpriseHelpPageTest extends AbstractTestCases{
        
    @Test(testName = "EnterpriseHelpPage", description = "跳转到帮助页面", groups = "pc")
        public void EnterpriseToHelpPage() throws Exception{
            NavigationPage navigationPage=new NavigationPage(driver);
            EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
            HelpPCPage helpPCPage=enterprisePCPage.clickHelpLink();
            WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="EnterpriseHelpPage1",description="帮助页面点击关于我们",groups="pc")
    public void ClickAboutUsTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        HelpPCPage helpPCPage=enterprisePCPage.clickHelpLink();
        helpPCPage.ClickAboutUs();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="EnterpriseHelpPage2",description="帮助页面点击发工资的好处",groups="pc")
    public void ClickPayBenefitsTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        HelpPCPage helpPCPage=enterprisePCPage.clickHelpLink();
        helpPCPage.ClickPayBenefits();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="EnterpriseHelpPage3",description="借力员工融资",groups="pc")
    public void ClickEmployeesFinancingTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        HelpPCPage helpPCPage=enterprisePCPage.clickHelpLink();
        helpPCPage.ClickEmployeesFinancing();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="EnterpriseHelpPage4",description="借钱投资",groups="pc")
    public void clickBorrowMoneyInvestTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        HelpPCPage helpPCPage=enterprisePCPage.clickHelpLink();
        helpPCPage.ClickBorrowMoneyInvest();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="EnterpriseHelpPage5",description="注册和登录",groups="pc")
    public void ClickRegistrationAndLoginTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        HelpPCPage helpPCPage=enterprisePCPage.clickHelpLink();
        helpPCPage.ClickRegistrationAndLogin();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="EnterpriseHelpPage6",description="充值和提现",groups="pc")
    public void ClickRechargeAndWithdrawTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        HelpPCPage helpPCPage=enterprisePCPage.clickHelpLink();
        helpPCPage.ClickRechargeAndWithdraw();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="EnterpriseHelpPage7",description="员工和工资",groups="pc")
    public void ClickEmployeesAndWageTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        HelpPCPage helpPCPage=enterprisePCPage.clickHelpLink();
        helpPCPage.ClickEmployeesAndWage();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="EnterpriseHelpPage8",description="融资",groups="pc")
    public void ClickFinancingTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        HelpPCPage helpPCPage=enterprisePCPage.clickHelpLink();
        helpPCPage.ClickFinancing();
        WebReporter.log(driver, driver.getTitle(), true, true);
    } 
    
}
