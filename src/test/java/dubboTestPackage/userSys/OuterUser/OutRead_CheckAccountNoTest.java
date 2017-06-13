package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.enterpriseaccount.CheckEnterpriseAccountNoReqDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.enterpriseaccount.QueryEnterpriseAccountCardNoReqDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import com.miaoqian.usersvc.model.enums.ChannelEnum;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_CheckAccountNoTest extends AbstractTestCases{

    @Test(testName = "checkAccountNo", description = "all_scenario", groups = "dubbo")
    public void checkAccountNoTest() throws Exception{

        CheckEnterpriseAccountNoReqDto item = new CheckEnterpriseAccountNoReqDto();
        item.setUserJxId("6212462220000350025");
        item.setChannel(ChannelEnum.MOBILE);

        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<Boolean> result = api.checkEnterpriseAccountNo(item);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
