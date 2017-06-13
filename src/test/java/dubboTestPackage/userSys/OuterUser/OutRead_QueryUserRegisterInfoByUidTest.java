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

public class OutRead_QueryUserRegisterInfoByUidTest extends AbstractTestCases{

    @Test(testName = "queryUserRegqisterInfoByUid", description = "all_scenario", groups = "dubbo")
    public void queryUserRegqisterInfoByUidTest() throws Exception{

//        // uid 没开户
//        String uid = "000000000020170612160315595717";

        // uid 开户
        String uid = "000000000020170612160952709678";

        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<UserRegisterResDto> result = api.queryUserRegisterInfoByUid(uid);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
