package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.inneruserlogin.InnerUserInfoDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.inneruserlogin.InnerUserLoginRequestDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserRead;
import dataBean.dubbo.userSys.MyInnerUserLoginRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerRead_InnerUserLoginTest extends AbstractTestCases{

    @Test(testName = "innerUserLogin", description = "all_scenario", groups = "dubbo")
    public void innerUserLoginTest() throws Exception{
        MyInnerUserLoginRequestDto myInnerUserLoginRequestDto = DataFactory.getObject(MyInnerUserLoginRequestDto.class, "no_password");
        InnerUserLoginRequestDto innerUserLoginRequestDto = DataFactory.transferData(myInnerUserLoginRequestDto,InnerUserLoginRequestDto.class);

        InterUserRead api = (InterUserRead) context.getBean("interUserApiReadService");
        Result<InnerUserInfoDto> result = api.innerUserLogin(innerUserLoginRequestDto);

        System.out.println("=============params============");
        System.out.println(innerUserLoginRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
