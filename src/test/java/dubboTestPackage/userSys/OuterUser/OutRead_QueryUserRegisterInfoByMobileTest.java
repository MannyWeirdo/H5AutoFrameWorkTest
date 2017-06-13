package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userregister.UserRegisterResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_QueryUserRegisterInfoByMobileTest extends AbstractTestCases{

    @Test(testName = "queryUserRegisterInfoByMobile", description = "all_scenario", groups = "dubbo")
    public void queryUserRegisterInfoByMobileTest() throws Exception{

        // mobile 没开户
        String mobile = "15011032705";

//        // mobile 开户
//        String mobile = "17600312345";

        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<UserRegisterResDto> result = api.queryUserRegisterInfoByMobile(mobile);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
