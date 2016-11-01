package testPackage.FinancialServiceTest;

import org.testng.annotations.Test;

import page.pc.NavigationPage;
import page.pc.enterprisePage.EnterprisePCPage;
import page.pc.enterprisePage.FinancialServicePCPage;
import testCases.AbstractTestCases;
import basicTool.window.WindowsUtil;

import com.customize.reporter.WebReporter;

public class FinancialServicePageClickTest extends AbstractTestCases {

    @Test(testName = "financialService7", description = "金融服务页面点击九鼎投资", groups = "pc")
    public void ClickJiuDingInvestmentTest() throws Exception {

        NavigationPage navigationPage = new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage = navigationPage.clickEnterpriseLink();
        FinancialServicePCPage financialServicePCPage = enterprisePCPage.clickFinancialServiceLink();
        financialServicePCPage.GoToJiuDingInvestment();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "financialService8", description = "金融服务页面点击九州证券", groups = "pc")
    public void ClickJiuZhouSecuritiesTest() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage = navigationPage.clickEnterpriseLink();
        FinancialServicePCPage financialServicePCPage = enterprisePCPage.clickFinancialServiceLink();
        financialServicePCPage.GoToJiuZhouSecurities();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "financialService9", description = "金融服务页面点击九泰基金", groups = "pc")
    public void ClickJiuTaiFundTest() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage = navigationPage.clickEnterpriseLink();
        FinancialServicePCPage financialServicePCPage = enterprisePCPage.clickFinancialServiceLink();
        financialServicePCPage.GoToJiuTaiFund();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "financialService10", description = "金融服务页面点击九信金融", groups = "pc")
    public void ClickJiuXinFinanceTest() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage = navigationPage.clickEnterpriseLink();
        FinancialServicePCPage financialServicePCPage = enterprisePCPage.clickFinancialServiceLink();
        financialServicePCPage.GoToJiuXinFinance();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "financialService11", description = "金融服务页面点击富通保险", groups = "pc")
    public void ClickFuTongInsuranceTest() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        EnterprisePCPage enterprisePCPage = navigationPage.clickEnterpriseLink();
        FinancialServicePCPage financialServicePCPage = enterprisePCPage.clickFinancialServiceLink();
        financialServicePCPage.GoToFuTongInsurance();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
