package TestCases;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.customize.reporter.WebReporter;

import DriverFactory.DriverFactory;

@Listeners({ Filter.MethodSelector.class })
public class AbstractTestCases {
    public static WebDriver driver;
    
    /**
     * Init driver
     */
    @BeforeMethod
    public void initDriver() {
        driver = DriverFactory.createNewDriver();
    }

    /**
     * Destory driver
     */
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
