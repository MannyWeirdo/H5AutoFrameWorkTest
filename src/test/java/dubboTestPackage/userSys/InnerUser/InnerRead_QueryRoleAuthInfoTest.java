package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryroleauthinfo.QueryRoleAuthInfoRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryroleauthinfo.QueryRoleAuthInfoResponseDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryuserroleinfo.QueryUserRoleInfoRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryuserroleinfo.QueryUserRoleInfoResponseDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserRead;
import dataBean.dubbo.userSys.MyQueryUserRoleInfoRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerRead_QueryRoleAuthInfoTest extends AbstractTestCases{

    @Test(testName = "queryUserRoleInfo", description = "all_scenario", groups = "dubbo")
    public void queryUserRoleInfoTest() throws Exception{
        QueryRoleAuthInfoRequestDto item = new QueryRoleAuthInfoRequestDto();
        item.setPlatform("PROJECT");
        item.setRoleId("2");

        InterUserRead api = (InterUserRead) context.getBean("interUserApiReadService");
        Result<QueryRoleAuthInfoResponseDto> result = api.queryRoleAuthInfo(item);

        System.out.println("=============params============");
        System.out.println(item.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
