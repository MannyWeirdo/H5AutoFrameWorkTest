package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.querypersonalaccountinfo.AccountMutilDetailInfoResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_QueryPersonalAccountMDIByMobileTest extends AbstractTestCases{

    @Test(testName = "queryPersonalAccountMDIByMobile", description = "all_scenario", groups = "dubbo")
    public void queryPersonalAccountMDIByMobileTest() throws Exception{

//        // 个人用户
//        String mobile = "11101234561";

        // 企业用户
        String mobile = "11100000002";

//        // 空用户
//        String mobile = null;



        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<AccountMutilDetailInfoResDto> result = api.queryPersonalAccountMDIByMobile(mobile);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
