package testCases;

import java.net.MalformedURLException;

import org.DriverFactory.Factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.customize.reporter.WebReporter;

import basicTool.config.ConfigUtil;
import io.appium.java_client.AppiumDriver;

@Listeners({ filter.MethodSelector.class })
public class AbstractTestCases {
    public static WebDriver driver;
    public static AppiumDriver appiumDirver;

    /**
     * Init driver
     * 
     * @throws MalformedURLException
     */
    @BeforeMethod
    public void initDriver() throws MalformedURLException {
        switch (ConfigUtil.getConfigUtil().getConfigFileContent("deviceType")) {
        case "pc":
            driver = DriverFactory.createNewDriver();
            break;

        case "phone":
            appiumDirver = DriverFactory.createAppiumDriver();
            break;

        default:
            break;
        }
    }

    /**
     * Destory driver
     */
    @AfterMethod
    public void destoryDriver() {
        switch (ConfigUtil.getConfigUtil().getConfigFileContent("deviceType")) {
        case "phone":
            WebReporter.log(appiumDirver, true, true, true);
            DriverFactory.closeAppiumDriver();
            break;
        case "pc":
            WebReporter.log(driver, driver.getTitle(), true, true);
            DriverFactory.CloseDriver();
            break;
        default:
            break;
        }
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
