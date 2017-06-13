package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.enterpriseinfo.UserEnterpriseInfoResDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.querypersonalaccountinfo.AccountMutilDetailInfoResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_QueryUserEnterpriseInfoTest extends AbstractTestCases{

    @Test(testName = "queryUserEnterpriseInfo", description = "all_scenario", groups = "dubbo")
    public void queryUserEnterpriseInfoTest() throws Exception{
//        // 企业用户
//        String uid = "000000000020170622141729350711";

//        // 个人用户
//        String uid = "000000000020170620104600990493";

        // 空
        String uid = "";


        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<UserEnterpriseInfoResDto> result = api.queryUserEnterpriseInfo(uid);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
