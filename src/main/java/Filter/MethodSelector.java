package Filter;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.Test;

import BasicTool.ConfigUtil;
import TestCases.AbstractTestCases;

public class MethodSelector extends AbstractTestCases implements IMethodInterceptor {

    private static Logger log = Logger.getLogger(MethodSelector.class);

    /**
     * init System paramaters for testNG
     */

    {
        try {
            if (System.getProperty("Group") != null | System.getProperty("testName") != null
                    | System.getProperty("IsRemoteDriver") != null)
                ConfigUtil.setConfigValue("IsRemoteDriver", "testName", "Group");
        } catch (Exception e) {
            log.info("Can't use -D method to add paramater!!!");
        }

    }

    private ArrayList<String> testcaseIDList = new ArrayList<String>();

    /**
     * Constractor
     * 
     * init testMehtod list
     */
    public MethodSelector() {
        String TCID = ConfigUtil.getConfigUtil().getConfigFileContent("testName");
        if (TCID == null)
            return;
        for (String testName : TCID.split(",")) {
            testcaseIDList.add(testName);
        }
    }

    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
        List<IMethodInstance> updatedMethodInstance = new ArrayList<IMethodInstance>();
        for (IMethodInstance method : methods) {
            ITestNGMethod testMethod = method.getMethod();
            if (isExpectedMethod(testMethod))
                updatedMethodInstance.add(method);
        }
        return updatedMethodInstance;
    }

    /**
     * verify method whether to belong to running method
     * 
     * @param method
     * @return
     */
    private boolean isExpectedMethod(ITestNGMethod method) {

        Test testMethod = method.getConstructorOrMethod().getMethod().getAnnotation(Test.class);
        String testName = testMethod.testName();
        if (!testcaseIDList.isEmpty() && !testcaseIDList.contains(testName))
            return false;
        String currretTestLocale = GROUP.getCurrentGroup();
        for (String group : method.getGroups()) {
            if (currretTestLocale.equals(group))
                return true;
        }
        return false;
    }

}
