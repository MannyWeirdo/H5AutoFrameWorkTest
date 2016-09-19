package testPackage.functionDetailPage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import page.pc.functionDetailPage.FunctionDetailPage;
import testCases.AbstractTestCases;

public class VoipLink extends AbstractTestCases {

    @Test(testName = "functionDetail6", description = "免费电话", groups = "pc")
    public void intoVoipLink() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        FunctionDetailPage functionDetailPage = navigationPage.clickFunctionDetaillLink();
        functionDetailPage.clickVoipLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
