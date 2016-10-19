package testPackage.opromoterApplyTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import dataBean.pc.opromoter.OpromoterBean;
import dataTool.DataFactory;
import page.pc.NavigationPage;
import page.pc.promoterApply.ExtensionPage;
import page.pc.promoterApply.OpromoterApplyPage;
import testCases.AbstractTestCases;

public class PromoterApplyTest extends AbstractTestCases {
    NavigationPage navigationPage;
    OpromoterBean opromoterBean;
    OpromoterApplyPage opromoterApplyPage;

    @Test(testName = "opromoterApply1", description = "申请成为企业资源引荐人", groups = "pc")
    public void testPersonPromoterApply() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterBean = DataFactory.getObject(OpromoterBean.class, "default");
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply2", description = "查看推广联系方式", groups = "pc")
    public void testCompanyPromoterApply() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply3", description = "查看北京负责人", groups = "pc")
    public void testViewOwnerInCityBJ() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("北京");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply4", description = "查看天津负责人", groups = "pc")
    public void testViewOwnerInCityTJ() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("天津");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply5", description = "查看河北负责人", groups = "pc")
    public void testViewOwnerInCityHB() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("河北");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply6", description = "查看山西负责人", groups = "pc")
    public void testViewOwnerInCitySX() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("山西");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply7", description = "查看内蒙古负责人", groups = "pc")
    public void testViewOwnerInCityNMG() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("内蒙古");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply8", description = "查看上海负责人", groups = "pc")
    public void testViewOwnerInCitySH() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("上海");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply9", description = "查看江苏负责人", groups = "pc")
    public void testViewOwnerInCityJS() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("江苏");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply10", description = "查看浙江负责人", groups = "pc")
    public void testViewOwnerInCityZJ() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("浙江");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply11", description = "查看安徽负责人", groups = "pc")
    public void testViewOwnerInCityAH() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("安徽");
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply12", description = "查看福建负责人", groups = "pc")
    public void testViewOwnerInCityFJ() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("福建");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply13", description = "查看山东负责人", groups = "pc")
    public void testViewOwnerInCitySD() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("山东");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply14", description = "查看广东负责人", groups = "pc")
    public void testViewOwnerInCityGD() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("广东");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply15", description = "查看广西负责人", groups = "pc")
    public void testViewOwnerInCityGX() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("广西");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply16", description = "查看海南负责人", groups = "pc")
    public void testViewOwnerInCityHN() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("海南");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply17", description = "查看江西负责人", groups = "pc")
    public void testViewOwnerInCityJX() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("江西");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply18", description = "查看河南负责人", groups = "pc")
    public void testViewOwnerInCityHeN() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("河南");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply19", description = "查看湖北负责人", groups = "pc")
    public void testViewOwnerInCityHuB() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("湖北");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply20", description = "查看湖南负责人", groups = "pc")
    public void testViewOwnerInCityHuN() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("湖南");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply21", description = "查看重庆负责人", groups = "pc")
    public void testViewOwnerInCityCQ() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("重庆");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply22", description = "查看四川负责人", groups = "pc")
    public void testViewOwnerInCitySQ() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("四川");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply23", description = "查看贵州负责人", groups = "pc")
    public void testViewOwnerInCityGZ() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("贵州");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply24", description = "查看云南负责人", groups = "pc")
    public void testViewOwnerInCityYN() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("云南");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply25", description = "查看西藏负责人", groups = "pc")
    public void testViewOwnerInCityXZ() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("西藏");
        WebReporter.log(driver, driver.getTitle(), true, true);

    }

    @Test(testName = "opromoterApply26", description = "查看陕西负责人", groups = "pc")
    public void testViewOwnerInCitySX2() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("陕西");
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply27", description = "查看甘肃负责人", groups = "pc")
    public void testViewOwnerInCityGS() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("甘肃");
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply28", description = "查看青海负责人", groups = "pc")
    public void testViewOwnerInCityQH() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("青海");
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply29", description = "查看新疆负责人", groups = "pc")
    public void testViewOwnerInCityXJ() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("新疆");
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply30", description = "查看宁夏负责人", groups = "pc")
    public void testViewOwnerInCityNX() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("宁夏");
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply31", description = "查看辽宁负责人", groups = "pc")
    public void testViewOwnerInCityLN() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("辽宁");
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply32", description = "查看吉林负责人", groups = "pc")
    public void testViewOwnerInCityJL() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("吉林");
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply33", description = "查看黑龙江负责人", groups = "pc")
    public void testViewOwnerInCityHLJ() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        ExtensionPage extensionPage = opromoterApplyPage.clickViewContactLink();
        extensionPage.viewOwnerByCity("黑龙江");
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
