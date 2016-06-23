package Filter;

import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.Test;

import BasicTool.ConfigUtil;
import TestCases.AbstractTestCases;

public class MethodSelector extends AbstractTestCases implements IMethodInterceptor {

    private ArrayList<String> testcaseIDList = new ArrayList<String>();

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
        if (updatedMethodInstance.size() > 0)
            return updatedMethodInstance;
        else
            return methods;
    }

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
