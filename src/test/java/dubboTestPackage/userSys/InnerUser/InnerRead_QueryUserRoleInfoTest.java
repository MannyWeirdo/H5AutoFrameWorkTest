package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
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

public class InnerRead_QueryUserRoleInfoTest extends AbstractTestCases{

    @Test(testName = "queryUserRoleInfo", description = "all_scenario", groups = "dubbo")
    public void queryUserRoleInfoTest() throws Exception{
        MyQueryUserRoleInfoRequestDto myQueryUserRoleInfoRequestDto = DataFactory.getObject(MyQueryUserRoleInfoRequestDto.class, "p_promotion");
        QueryUserRoleInfoRequestDto queryUserRoleInfoRequestDto = DataFactory.transferData(myQueryUserRoleInfoRequestDto,QueryUserRoleInfoRequestDto.class);

        InterUserRead api = (InterUserRead) context.getBean("interUserApiReadService");
        Result<QueryUserRoleInfoResponseDto> result = api.queryUserRoleInfo(queryUserRoleInfoRequestDto);

        System.out.println("=============params============");
        System.out.println(queryUserRoleInfoRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
