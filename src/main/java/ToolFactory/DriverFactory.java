package ToolFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;

public class DriverFactory {
    private static WebDriver driver = null;
    private static Logger log = LogFactory.getLogger(DriverFactory.class);
    private static ConfigUtil configUtil = ConfigUtil.getConfigUtil();

    private DriverFactory() {
    }

    private static WebDriver CreateBroswerDriver() {
        switch (configUtil.getConfigFileContent("Broswer.type")) {
        case "firefox":
            driver = new FirefoxDriver();
            return driver;
        case "chrome":
            return driver;
        case "ie":
            return driver;
        case "safari":
            return driver;
        default:
        }
        return null;

    }

    public static WebDriver createNewDriver() {
        log.info("Current Driver is null : " + (driver == null));
        if (driver == null) {
            synchronized (WebDriver.class) {
                if (driver == null) {
                    driver = CreateBroswerDriver();
                    driver.manage().window().maximize();
                    driver.get(configUtil.getConfigFileContent("DefaultURL"));
                    return driver;
                }
            }
        }
        return driver;
    }

    public static WebDriver getCurrentDriver(){
        return createNewDriver();
    }
    
        
    public static void CloseDriver() {
        driver.quit();
        driver = null;
    }

}
