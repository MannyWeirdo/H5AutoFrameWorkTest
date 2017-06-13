package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.roleadd.RoleInfoDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.updateroleinfo.UpdateRoleInfoRequestDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserWrite;
import dataBean.dubbo.userSys.MyUpdateRoleInfoRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerWrite_UpdateRoleInfoTest extends AbstractTestCases{

    @Test(testName = "updateRoleInfo", description = "all_scenario", groups = "dubbo")
    public void updateRoleInfoTest() throws Exception{
        MyUpdateRoleInfoRequestDto myUpdateRoleInfoRequestDto = DataFactory.getObject(MyUpdateRoleInfoRequestDto.class, "regular");
        UpdateRoleInfoRequestDto updateRoleInfoRequestDto = DataFactory.transferData(myUpdateRoleInfoRequestDto, UpdateRoleInfoRequestDto.class);

        InterUserWrite api = (InterUserWrite) context.getBean("interUserApiWriteService");
        Result result = api.updateRoleInfo(updateRoleInfoRequestDto);

        System.out.println("=============params============");
        System.out.println(updateRoleInfoRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
