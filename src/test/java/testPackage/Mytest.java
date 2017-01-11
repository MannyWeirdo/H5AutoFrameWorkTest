
package testPackage;

import org.testng.annotations.Test;

import dataBean.app.login.UserBean;
import testCases.AbstractTestCases;

public class Mytest extends AbstractTestCases {

	UserBean userBean;

	@Test(testName = "1257", description = "", groups = "pc")
	public void MyfristTest12() throws Exception {
		System.out.println("hahaha");
	}

}
