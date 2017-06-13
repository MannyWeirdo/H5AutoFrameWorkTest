package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.roleauthmap.RoleAuthMapRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.roleauthmap.RoleAuthMapResponseDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserWrite;
import dataBean.dubbo.userSys.MyRoleAuthMapRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerWrite_RoleAuthMapTest extends AbstractTestCases{

    @Test(testName = "roleAuthMap", description = "all_scenario", groups = "dubbo")
    public void roleAuthMapTest() throws Exception{
        MyRoleAuthMapRequestDto myRoleAuthMapRequestDto = DataFactory.getObject(MyRoleAuthMapRequestDto.class, "unband");
        RoleAuthMapRequestDto roleAuthMapRequestDto = DataFactory.transferData(myRoleAuthMapRequestDto,RoleAuthMapRequestDto.class);

        InterUserWrite api = (InterUserWrite) context.getBean("interUserApiWriteService");
        Result<RoleAuthMapResponseDto> result = api.roleAuthMap(roleAuthMapRequestDto);

        System.out.println("=============params============");
        System.out.println(roleAuthMapRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
