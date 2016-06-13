package BasicTool;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractTestCases {
    public static WebDriver wd;

    @BeforeMethod
    public void initDriver() {
        wd = DriverFactory.createNewDriver();
    }

    @AfterMethod
    public void destoryDriver() {
        DriverFactory.CloseDriver();
    }

    /**
     * log message to TestNG result
     * 
     * @param str
     */
    public static void logMessage(String str) {
        Reporter.log(str, 5, true); // Making a log entry.
    }
}
