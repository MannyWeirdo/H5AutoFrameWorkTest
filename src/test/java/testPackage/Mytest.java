
package testPackage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;
import com.customize.reporter.model.WebLog;

import dataBean.app.login.UserBean;
import testCases.AbstractTestCases;

public class Mytest extends AbstractTestCases {

	UserBean userBean;

	@Test(testName = "1257", description = "", groups = "pc")
	public void MyfristTest12() throws Exception {
		System.out.println("hahaha");
		WebReporter.log(driver, driver.getTitle(), true, true);
		WebReporter.log(driver, driver.getTitle(), true, true);
		WebReporter.log(driver, driver.getTitle(), true, true);
		WebReporter.log(driver, driver.getTitle(), true, true);
		WebReporter.log(driver, driver.getTitle(), true, true);
		WebReporter.log(driver, driver.getTitle(), true, true);
		WebReporter.log(driver, driver.getTitle(), true, true);
		WebReporter.log(driver, driver.getTitle(), true, true);
		WebReporter.log(driver, driver.getTitle(), true, true);
		WebReporter.log(driver, driver.getTitle(), true, true);
	}

}
