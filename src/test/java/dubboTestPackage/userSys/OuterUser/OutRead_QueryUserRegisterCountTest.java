package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_QueryUserRegisterCountTest extends AbstractTestCases{

    @Test(testName = "queryUserRegisterCount", description = "all_scenario", groups = "dubbo")
    public void queryUserRegisterCountTest() throws Exception{

        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<Integer> result = api.queryUserRegisterCount();

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
