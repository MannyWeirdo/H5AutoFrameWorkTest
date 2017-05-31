package abstractTestCase;

import com.customize.reporter.WebReporter;
import io.appium.java_client.AppiumDriver;
import org.ConfigUtil.ConfigUtil;
import org.DriverFactory.Factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import video.VideoReord;

import java.lang.reflect.Method;

@Listeners({ filter.MethodSelector.class })
public class AbstractTestCases {
	public static WebDriver driver;
	public static AppiumDriver appiumDirver;
	public static ClassPathXmlApplicationContext context;

	/**
	 * Init driver
	 * 
	 * @throws Exception
	 */
	@BeforeMethod
	public void initDriver(Method method) throws Exception {
		if (ConfigUtil.getConfigUtil().getConfigFileContent("isVideo").equals("true"))
			VideoReord.getInstance().startRecording(method.getName());
		switch (ConfigUtil.getConfigUtil().getConfigFileContent("deviceType")) {
		case "pc":
			driver = DriverFactory.createNewDriver();
			break;
		case "phone":
			appiumDirver = DriverFactory.createAppiumDriver();
			break;
		case "dubbo":
			context = new ClassPathXmlApplicationContext(new String[] {"applicationConsumer.xml"});
			context.start();
		    break;
		case "http":
		    break;
		default:
			break;
		}
	}

	/**
	 * Destory driver
	 * 
	 * @throws Exception
	 */
	@AfterMethod
	public void destoryDriver() throws Exception {

		switch (ConfigUtil.getConfigUtil().getConfigFileContent("deviceType")) {
		case "phone":
			WebReporter.log(appiumDirver, true, true, true);
			DriverFactory.closeAppiumDriver();
			break;
		case "pc":
			WebReporter.log(driver, driver.getTitle(), true, true);
			DriverFactory.CloseDriver();
			break;
		case "dubbo":
		    break;
		case "http":
		    break;
		default:
			break;
		}
		if (ConfigUtil.getConfigUtil().getConfigFileContent("isVideo").equals("true"))
			VideoReord.getInstance().stopRecording();
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
