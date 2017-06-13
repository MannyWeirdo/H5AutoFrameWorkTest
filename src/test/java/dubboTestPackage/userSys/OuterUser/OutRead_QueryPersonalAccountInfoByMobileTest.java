package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.querypersonalaccountinfo.UserBankAccountInfoResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_QueryPersonalAccountInfoByMobileTest extends AbstractTestCases{

    @Test(testName = "queryPersonalAccountInfoByMobile", description = "all_scenario", groups = "dubbo")
    public void queryPersonalAccountInfoByMobileTest() throws Exception{

        // mobile 没开户
        String mobile = "11100000010";

//        // mobile 开户
//        String mobile = "17600312345";

//        // mobile 空
//        String mobile = "";

        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<UserBankAccountInfoResDto> result = api.queryAccountInfoByMobile(mobile);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
