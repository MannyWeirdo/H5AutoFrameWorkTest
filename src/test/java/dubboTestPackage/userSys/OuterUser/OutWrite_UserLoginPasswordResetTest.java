package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.passwordchange.PasswordChangeRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.passwordreset.PasswordResetRequestDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserWrite;
import dataBean.dubbo.userSys.MyPasswordChangeRequestDto;
import dataBean.dubbo.userSys.MyPasswordResetRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutWrite_UserLoginPasswordResetTest extends AbstractTestCases{

    @Test(testName = "userLoginPasswordReset", description = "all_scenario", groups = "dubbo")
    public void userLoginPasswordResetTest() throws Exception{
        MyPasswordResetRequestDto myPasswordChangeResetDto = DataFactory.getObject(MyPasswordResetRequestDto.class, "wrong_NewPassword");
        PasswordResetRequestDto passwordResetRequestDto = DataFactory.transferData(myPasswordChangeResetDto, PasswordResetRequestDto.class);

        OutUserWrite api = (OutUserWrite) context.getBean("outUserApiWriteService");
        Result<Boolean> result = api.userLoginPasswordReset(passwordResetRequestDto);

        System.out.println("=============params============");
        System.out.println(passwordResetRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);



    }

}
