package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userregister.UserEnterpriseRegisterReqDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userregister.UserEnterpriseRegisterResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserWrite;
import com.miaoqian.usersvc.model.enums.ChannelEnum;
import dataBean.dubbo.userSys.MyUserEnterpriseRegisterReqDto;
import dataTool.DataFactory;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutWrite_UserEnterpriseRegisterTest extends AbstractTestCases{

    @Test(testName = "userRegister", description = "all_scenario", groups = "dubbo")
    public void userRegisterTest() throws Exception{
        MyUserEnterpriseRegisterReqDto myUserEnterpriseRegisterReqDto = DataFactory.getObject(MyUserEnterpriseRegisterReqDto.class, "regular");
        UserEnterpriseRegisterReqDto userEnterpriseRegisterReqDto = DataFactory.transferData(myUserEnterpriseRegisterReqDto,UserEnterpriseRegisterReqDto.class);
        userEnterpriseRegisterReqDto.setChannel(ChannelEnum.WEB);

        OutUserWrite api = (OutUserWrite) context.getBean("outUserApiWriteService");
        Result<UserEnterpriseRegisterResDto> result = api.userEnterpriseRegister(userEnterpriseRegisterReqDto);

        System.out.println("==============params=============");
        System.out.println(userEnterpriseRegisterReqDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
    }

}
