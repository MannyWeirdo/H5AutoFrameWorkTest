package testPackage.opromoterApplyTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import TestCases.AbstractTestCases;
import dataBean.pc.opromoter.OpromoterBean;
import dataTool.DataFactory;
import page.pc.NavigationPage;
import page.pc.promoterApply.CompanyOpromoterPage;
import page.pc.promoterApply.OpromoterApplyPage;

public class PromoterApplyTest extends AbstractTestCases {
    NavigationPage navigationPage;
    OpromoterBean opromoterBean;
    OpromoterApplyPage opromoterApplyPage;

    @Test(description = "申请为推广商个人版")
    public void testPersonPromoterApply() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(description = "申请为推广商企业版")
    public void testCompanyPromoterApply() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterBean.setPromotionDirection(1);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(description = "企业版推广联系方式")
    public void testPromoterLink() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        CompanyOpromoterPage companyOpromoterPage = opromoterApplyPage.clickCompanyOpromoterLink();
        companyOpromoterPage.searchCompanyPromoter("北京");
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
