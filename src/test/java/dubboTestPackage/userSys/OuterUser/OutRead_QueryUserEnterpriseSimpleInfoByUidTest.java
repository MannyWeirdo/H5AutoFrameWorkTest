package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.enterpriseaccount.QueryEnterpriseAccountCardNoReqDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userregister.UserEnterpriseInfoSimpleResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import com.miaoqian.usersvc.model.enums.ChannelEnum;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_QueryUserEnterpriseSimpleInfoByUidTest extends AbstractTestCases{

    @Test(testName = "queryUserEnterpriseSimpleInfoByUid", description = "all_scenario", groups = "dubbo")
    public void queryUserEnterpriseSimpleInfoByUidTest() throws Exception{

//        String uid = "000000000020170622141729350711";

//        // wrong
//        String uid = "000000000020170622141729350722";

        // empty
        String uid = "";

        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<UserEnterpriseInfoSimpleResDto> result = api.queryUserEnterpriseSimpleInfoByUid(uid);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
