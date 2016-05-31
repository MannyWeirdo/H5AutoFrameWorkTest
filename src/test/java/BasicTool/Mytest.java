package BasicTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mytest {

	@Test
	public void MyfristTest() {
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.baidu.com");
		wd.close();
	}
}
