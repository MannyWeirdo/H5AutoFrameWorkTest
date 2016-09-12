package testPackage.navigationPageTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import page.pc.NavigationPage;
import testCases.AbstractTestCases;

public class NavigationToBusinessVersionPage extends AbstractTestCases {

    @Test(testName = "2", description = "閫氳繃瀵艰埅鏍忚繘鍏ュ埌浼佷笟鐗堥〉闈�)")
    public void navigationToBusinessVersionPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickBusinessVersionLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
