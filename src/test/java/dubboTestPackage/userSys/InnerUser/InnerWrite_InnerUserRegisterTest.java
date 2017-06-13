package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.inneruserregister.InnerUserRegisterRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.inneruserregister.InnerUserRegisterResponseDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserWrite;
import dataBean.dubbo.userSys.MyInnerUserRegisterRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerWrite_InnerUserRegisterTest extends AbstractTestCases{

    @Test(testName = "innerUserRegister", description = "all_scenario", groups = "dubbo")
    public void innerUserRegisterTest() throws Exception{
        MyInnerUserRegisterRequestDto myInnerUserRegisterRequestDto = DataFactory.getObject(MyInnerUserRegisterRequestDto.class, "wrong_name");
        InnerUserRegisterRequestDto innerUserRegisterRequestDto = DataFactory.transferData(myInnerUserRegisterRequestDto,InnerUserRegisterRequestDto.class);

        InterUserWrite api = (InterUserWrite) context.getBean("interUserApiWriteService");
        Result<InnerUserRegisterResponseDto> result = api.innerUserRegister(innerUserRegisterRequestDto);

        System.out.println("=============params============");
        System.out.println(innerUserRegisterRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
