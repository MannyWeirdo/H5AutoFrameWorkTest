package testPackage.FinancialServiceTest;

import org.testng.annotations.Test;

import basicTool.window.WindowsUtil;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.enterprisePage.EnterprisePCPage;
import page.pc.enterprisePage.FinancialServicePCPage;
import testCases.AbstractTestCases;

public class FinancialServicePageMoveTest extends AbstractTestCases{
    @Test(testName="financialService1",description="企业版页面进入金融服务页",groups="pc")
    public void EnterpriseToFinancialService() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        FinancialServicePCPage financialServicePCPage=enterprisePCPage.clickFinancialServiceLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="financialService2",description="金融服务页鼠标移动到规范上市",groups="pc")
    public void ClickSpecificationListingTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        FinancialServicePCPage financialServicePCPage=enterprisePCPage.clickFinancialServiceLink();
        financialServicePCPage.MoveToSpecificationListing();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="financialService3",description="金融服务页鼠标移动到并购重组",groups="pc")
    public void ClickMergerAndAcquisitionTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        FinancialServicePCPage financialServicePCPage=enterprisePCPage.clickFinancialServiceLink();
        financialServicePCPage.MoveToMergerAndAcquisition();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="financialService4",description="金融服务页鼠标移动到股权管理",groups="pc")
    public void ClickEquityManagementTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        FinancialServicePCPage financialServicePCPage=enterprisePCPage.clickFinancialServiceLink();
        financialServicePCPage.MoveToEquityManagement();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="financialService5",description="金融服务页鼠标移动到基金管理",groups="pc")
    public void ClickFundManagementTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        FinancialServicePCPage financialServicePCPage=enterprisePCPage.clickFinancialServiceLink();
        financialServicePCPage.MoveToFundManagement();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
    @Test(testName="financialService6",description="金融服务页鼠标移动到综合保险",groups="pc")
    public void ClickComprehensiveInsuranceTest() throws Exception{
        NavigationPage navigationPage=new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage=navigationPage.clickEnterpriseLink();
        FinancialServicePCPage financialServicePCPage=enterprisePCPage.clickFinancialServiceLink();
        financialServicePCPage.MoveToComprehensiveInsurance();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
    
}
