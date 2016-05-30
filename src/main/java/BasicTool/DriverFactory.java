package BasicTool;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	private static WebDriver driver = null;

	private DriverFactory() {
	}

	private static WebDriver CreateBroswerDriver() {
		ConfigUtil configUtil = ConfigUtil.getConfigUtil();
		switch (configUtil.getConfigFileContent("Broswer.type")) {
		case "firefox":
			driver = new FirefoxDriver();
			return driver;
		default:		
		}
		return null;

	}

	public static WebDriver getDriver() {
		if (driver == null) {
			synchronized (WebDriver.class) {
				if (driver == null) {
					return CreateBroswerDriver();
				}
			}
		}
		return driver;
	}
	
}
