package TestPackage.opromoterApply;

import org.testng.annotations.Test;

import DataBean.OpromoterBean;
import DataTool.DataFactory;
import Page.NavigationPage;
import Page.promoterApply.OpromoterApplyPage;
import TestCases.AbstractTestCases;

public class TestPromoterApply extends AbstractTestCases {
    NavigationPage navigationPage;
    OpromoterBean opromoterBean;
    OpromoterApplyPage opromoterApplyPage;

    @Test(description = "申请为推广商个人版")
    public void testPersonPromoterApply() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterApplyPage.fillOpromoterInformation(opromoterBean);
        opromoterApplyPage.clickSubmitButton(); 
    }

    // @Test(description = "申请为推广商企业版")
    public void testCompanyPromoterApply() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterBean.setPromotionDirection(1);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterApplyPage.fillOpromoterInformation(opromoterBean);
        opromoterApplyPage.clickSubmitButton();
    }

    // @Test(description = "个人版企业版连接")
    public void testPromoterLink() throws Exception {
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterApplyPage.clickPersonOpromoterLink();
        navigationPage.clickPromoterApplyLink();
        opromoterApplyPage.clickCompanyOpromoterLink();
    }

}
