package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.userrolemap.UserRoleMapRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.userrolemap.UserRoleMapResponseDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserWrite;
import dataBean.dubbo.userSys.MyUserRoleMapRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerWrite_UserRoleMapTest extends AbstractTestCases{

    @Test(testName = "userRoleMap", description = "all_scenario", groups = "dubbo")
    public void userRoleMapTest() throws Exception{
        MyUserRoleMapRequestDto myUserRoleMapRequestDto = DataFactory.getObject(MyUserRoleMapRequestDto.class, "regular");
        UserRoleMapRequestDto userRoleMapRequestDto = DataFactory.transferData(myUserRoleMapRequestDto,UserRoleMapRequestDto.class);

        InterUserWrite api = (InterUserWrite) context.getBean("interUserApiWriteService");
        Result<UserRoleMapResponseDto> result = api.userRoleMap(userRoleMapRequestDto);

        System.out.println("=============params============");
        System.out.println(userRoleMapRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
