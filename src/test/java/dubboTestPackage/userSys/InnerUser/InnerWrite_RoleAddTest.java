package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.roleadd.RoleAddRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.roleadd.RoleInfoDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserWrite;
import dataBean.dubbo.userSys.MyRoleAddRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerWrite_RoleAddTest extends AbstractTestCases{

    @Test(testName = "roleAdd", description = "all_scenario", groups = "dubbo")
    public void roleAddTest() throws Exception{
        MyRoleAddRequestDto myRoleAddRequestDto = DataFactory.getObject(MyRoleAddRequestDto.class, "regular");
        RoleAddRequestDto roleAddRequestDto = DataFactory.transferData(myRoleAddRequestDto,RoleAddRequestDto.class);

        InterUserWrite api = (InterUserWrite) context.getBean("interUserApiWriteService");
        Result<RoleInfoDto> result = api.roleAdd(roleAddRequestDto);

        System.out.println("=============params============");
        System.out.println(roleAddRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
