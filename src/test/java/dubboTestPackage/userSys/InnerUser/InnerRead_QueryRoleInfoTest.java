package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.roleadd.RoleInfoDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserRead;
import org.testng.Assert;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryuserauthinfo.Platform;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerRead_QueryRoleInfoTest extends AbstractTestCases{

    @Test(testName = "queryRoleInfo", description = "all_scenario", groups = "dubbo")
    public void queryRoleInfoTest() throws Exception{
        String enName = "entryPosition";
        Platform platform = Platform.PROJECT;

//        String enName = "enName";
//        Platform platform = Platform.USER;
//
//        String enName = "enName";
//        Platform platform = Platform.PROJECT;
//
//        String enName = "enName";
//        Platform platform = Platform.PROMOTION;



        InterUserRead api = (InterUserRead) context.getBean("interUserApiReadService");
        Result<RoleInfoDto> result = api.queryRoleInfo(enName,platform);

//        System.out.println("=============params============");
//        System.out.println(queryUserAuthInfoResquestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
