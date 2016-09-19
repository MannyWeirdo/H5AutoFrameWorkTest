package testPackage.functionDetailPage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.functionDetailPage.FunctionDetailPage;
import testCases.AbstractTestCases;

public class JiaofeiLink extends AbstractTestCases {

    @Test(testName = "functionDetail3", description = "缴费", groups = "pc")
    public void intoJiaofeiLink() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        FunctionDetailPage functionDetailPage = navigationPage.clickFunctionDetaillLink();
        functionDetailPage.clickJiaofeiLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
