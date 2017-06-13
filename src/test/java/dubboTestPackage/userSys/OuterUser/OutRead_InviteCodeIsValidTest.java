package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_InviteCodeIsValidTest extends AbstractTestCases{

    @Test(testName = "inviteCodeIsValid", description = "all_scenario", groups = "dubbo")
    public void inviteCodeIsValidTest() throws Exception{

//        // inviteId 存在
//        String inviteId = "gcgut0p";

//        // inviteId 不存在
//        String inviteId = "gcgut0p11";

        // inviteId 空
        String inviteId = "";

//        // inviteId 格式错
//        String inviteId = "inviteIdxxxxxxxxx";

        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<Boolean> result = api.inviteCodeIsValid(inviteId);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
