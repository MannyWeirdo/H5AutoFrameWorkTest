package DriverFactory;

import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
                System.setProperty("webdriver.chrome.driver", configUtil.getConfigFileContent("chromeDriverPath"));
                DesiredCapabilities dc = DesiredCapabilities.chrome();
                driver = new ChromeDriver(dc);
                return driver;
            case "ie":
                System.setProperty("webdriver.ie.driver", configUtil.getConfigFileContent("ieDriverPath"));
                 dc = DesiredCapabilities.internetExplorer();
                driver = new InternetExplorerDriver(dc);
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
                URL remoteUrl = new URL(configUtil.getConfigFileContent("remoteDriverURL"));
                switch (configUtil.getConfigFileContent("Broswer.type")) {
                case "firefox":
                    DesiredCapabilities dc = DesiredCapabilities.firefox();
                    driver = new RemoteWebDriver(remoteUrl, dc);
                    return driver;
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", configUtil.getConfigFileContent("chromeDriverPath"));
                    dc = DesiredCapabilities.chrome();
                    driver = new RemoteWebDriver(remoteUrl, dc);
                    return driver;
                case "ie": 
                    System.setProperty("webdriver.ie.driver", configUtil.getConfigFileContent("ieDriverPath"));
                    dc = DesiredCapabilities.internetExplorer();
                    driver = new RemoteWebDriver(remoteUrl, dc);
                    return driver;
                case "safari":
                    dc = DesiredCapabilities.safari();
                    driver = new RemoteWebDriver(remoteUrl, dc);
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
