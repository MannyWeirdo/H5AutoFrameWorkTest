package DriverFactory;

import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import BasicTool.ConfigUtil;
import Factory.LogFactory;

public class DriverFactory {
    private static WebDriver driver = null;
    private static Logger log = LogFactory.getLogger(DriverFactory.class);
    private static ConfigUtil configUtil = ConfigUtil.getConfigUtil();

    private DriverFactory() {
    }

    private static WebDriver CreateBroswerDriver() {
        if (configUtil.getConfigFileContent("IsRemoteDriver").equals("false")) {
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
                try {
                    throw new Exception("Don't support this broswer on local!!!!!");
                } catch (Exception e) {
                    e.printStackTrace();
                    return driver;
                }
            }
        } else {
            try {
                switch (configUtil.getConfigFileContent("Broswer.type")) {
                case "firefox":
                    DesiredCapabilities dc = DesiredCapabilities.firefox();
                    driver = new RemoteWebDriver(new URL("http://172.27.51.118:4444/wd/hub"), dc);
                    return driver;
                case "chrome":
                    return driver;
                case "ie":
                    return driver;
                case "safari":
                    return driver;
                default:
                    return driver;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return driver;
            }
        }

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

    public static WebDriver getCurrentDriver() {
        return createNewDriver();
    }

    public static void CloseDriver() {
        driver.quit();
        driver = null;
    }

}
