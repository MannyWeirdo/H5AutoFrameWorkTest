package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.enterpriseaccount.QueryEnterpriseAccountCardNoReqDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.querypersonalaccountinfo.AccountMutilDetailInfoResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import com.miaoqian.usersvc.model.enums.ChannelEnum;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_QueryAccountMutilDetailInfoTest extends AbstractTestCases{

    @Test(testName = "queryAccountMutilDetailInfo", description = "all_scenario", groups = "dubbo")
    public void queryAccountMutilDetailInfoTest() throws Exception{
        // 个人用户
        String uid = "000000000020170620135848253599";



        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<AccountMutilDetailInfoResDto> result = api.queryAccountMutilDetailInfo(uid);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
