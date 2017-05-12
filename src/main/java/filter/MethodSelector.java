package filter;

import java.util.ArrayList;
import java.util.List;

import org.ConfigUtil.ConfigUtil;
import org.apache.log4j.Logger;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.Test;

import abstractTestCase.AbstractTestCases;

public class MethodSelector extends AbstractTestCases implements IMethodInterceptor {

    private static Logger log = Logger.getLogger(MethodSelector.class);

    /**
     * init System paramaters for testNG
     */

    {
        ConfigUtil.initTestConfig();

    }

    private ArrayList<String> testcaseIDList = new ArrayList<String>();

    /**
     * Constractor
     * 
     * init testMehtod list
     */
    public MethodSelector() {

        String TCID = ConfigUtil.getConfigUtil().getConfigFileContent("testName");
        if (TCID == null || TCID.isEmpty())
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
            try {
                if (isExpectedMethod(testMethod) && testMethod.getGroups()[0]
                        .equals(ConfigUtil.getConfigUtil().getConfigFileContent("deviceType")))
                    updatedMethodInstance.add(method);
            } catch (Exception e) {
            }

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
        else
            return true;
    }

}
