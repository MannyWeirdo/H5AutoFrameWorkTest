package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Platform;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.passwordchange.PasswordChangeRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userregister.UserRegisterReqDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userregister.UserRegisterResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserWrite;
import dataBean.dubbo.userSys.MyPasswordChangeRequestDto;
import dataBean.dubbo.userSys.MyUserRegisterReqDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutWrite_UserLoginPasswordChangeTest extends AbstractTestCases{

    @Test(testName = "UserLoginPasswordChange", description = "all_scenario", groups = "dubbo")
    public void UserLoginPasswordChangeTest() throws Exception{
        MyPasswordChangeRequestDto myPasswordChangeRequestDto = DataFactory.getObject(MyPasswordChangeRequestDto.class, "regular");
        PasswordChangeRequestDto passwordChangeRequestDto = DataFactory.transferData(myPasswordChangeRequestDto, PasswordChangeRequestDto.class);
        passwordChangeRequestDto.setPlatform(Platform.APP);

        OutUserWrite api = (OutUserWrite) context.getBean("outUserApiWriteService");
        Result<Boolean> result = api.userLoginPasswordChange(passwordChangeRequestDto);

        System.out.println("=============params============");
        System.out.println(passwordChangeRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);



    }

}
