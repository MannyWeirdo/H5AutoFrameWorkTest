package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userregister.UserRegisterReqDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userregister.UserRegisterResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserWrite;
import dataBean.dubbo.userSys.MyUserRegisterReqDto;
import dataTool.DataFactory;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutWrite_UserRegisterTest extends AbstractTestCases{

    @Test(testName = "userRegister", description = "all_scenario", groups = "dubbo")
    public void userRegisterTest() throws Exception{
        MyUserRegisterReqDto myUserRegisterReqDto = DataFactory.getObject(MyUserRegisterReqDto.class, "regular");
        UserRegisterReqDto userRegisterReqDto = DataFactory.transferData(myUserRegisterReqDto,UserRegisterReqDto.class);

        OutUserWrite api = (OutUserWrite) context.getBean("outUserApiWriteService");
        Result<UserRegisterResDto> result = api.userRegister(userRegisterReqDto);

        System.out.println("=============params============");
        System.out.println(userRegisterReqDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
    }

}
