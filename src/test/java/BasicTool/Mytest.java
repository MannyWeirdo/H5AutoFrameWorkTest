
package BasicTool;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import Page.BusinessVersionPage;
import Page.FunctionDetailPage;
import Page.NavigationPage;
import Page.PCHomePage;
import Page.PaymentPage;
import TestCases.AbstractTestCases;

public class Mytest extends AbstractTestCases {

    // @Test(testName = "1256", groups = { "Payment" }, description = "")
    public void MyfristTest6() throws Exception {
    }

    // @Test(testName = "12562", groups = { "Payment" })
    public void MyfristTest7() throws Exception {
    }

    //@Test(testName = "1256", groups = { "Home" })
    public void MyfristTest9() throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);
        NavigationPage navigationPage = new NavigationPage(driver);
        FunctionDetailPage functionDetailPage = navigationPage.clickFunctionDetaillLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
        PaymentPage paymentPage = navigationPage.clickPayPageLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);

        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WebReporter.log(driver, driver.getTitle(), true, true);

        WebReporter.log(driver, driver.getTitle(), true, true);
        // TestPage m = new TestPage(driver);

    }
    
    @Test(testName = "1256", groups = { "Home" })
    public void MyfristTest10() throws Exception {
        PCHomePage pCHomePage = new PCHomePage(driver);
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickNewListLink();
        navigationPage.clickFunctionDetaillLink();
        navigationPage.clickPromotionAndCooperationLink();
        navigationPage.clickAboutWeLink();
        navigationPage.clickPayPageLink();
        navigationPage.clickBusinessVersionLink();

      
    }

}
