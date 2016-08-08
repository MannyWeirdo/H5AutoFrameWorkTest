package com.jiedaibao.test.opromoterApply;

import java.io.File;

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
		File f = new File(DataFactory.class.getResource("/").getPath());
		System.out.println(System.getProperty("user.dir"));
		System.out.println(f);

//		navigationPage = new NavigationPage(driver);
//		opromoterApplyPage = navigationPage.clickPromoterApplyLink();
//		opromoterBean = DataFactory.GetData(OpromoterBean.class);
//		
//		
//		
//		opromoterApplyPage.applyForPersonOpromoter(opromoterBean);
		// opromoterApplyPage.clickSubmitButton();
	}

	//@Test(description = "申请为推广商企业版")
	public void testCompanyPromoterApply() throws Exception {
		navigationPage = new NavigationPage(driver);
		opromoterBean = new OpromoterBean("tester", "612657189910110389",
				"19100000012", "test@jiedaibao.com", "北京", "沙河", "cooperSource");
		opromoterApplyPage = navigationPage.clickPromoterApplyLink();
		opromoterApplyPage.applyForCompanyOpromoter(opromoterBean);
		// opromoterApplyPage.clickSubmitButton();
	}

	//@Test(description = "个人版企业版连接")
	public void testPromoterLink() throws Exception {
		opromoterApplyPage = navigationPage.clickPromoterApplyLink();
		opromoterApplyPage.clickPersonOpromoterLink();
		navigationPage.clickPromoterApplyLink();
		opromoterApplyPage.clickCompanyOpromoterLink();
	}

}
