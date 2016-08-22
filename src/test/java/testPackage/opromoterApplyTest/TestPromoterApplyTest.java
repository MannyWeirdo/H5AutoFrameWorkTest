package testPackage.opromoterApplyTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import DataBean.OpromoterBean;
import DataTool.DataFactory;
import TestCases.AbstractTestCases;
import page.pc.NavigationPage;
import page.pc.promoterApply.OpromoterApplyPage;

public class TestPromoterApplyTest extends AbstractTestCases {
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

    // @Test(description = "申请为推广商企业版")
    public void testCompanyPromoterApply() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterBean.setPromotionDirection(1);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    // @Test(description = "个人版企业版连接")
    public void testPromoterLink() throws Exception {
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterApplyPage.clickPersonOpromoterLink();
        navigationPage.clickPromoterApplyLink();
        opromoterApplyPage.clickCompanyOpromoterLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
