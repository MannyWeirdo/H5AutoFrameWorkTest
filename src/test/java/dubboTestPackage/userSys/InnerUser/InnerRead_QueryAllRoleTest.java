package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryallrole.QueryAllRoleRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryallrole.QueryAllRoleResponseDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryinneruserinfo.QueryInnerUserInfoRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryinneruserinfo.QueryInnerUserInfoResponseDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserRead;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerRead_QueryAllRoleTest extends AbstractTestCases{

    @Test(testName = "queryAllRole", description = "all_scenario", groups = "dubbo")
    public void queryAllRoleTest() throws Exception{


        QueryAllRoleRequestDto queryAllRoleRequestDto = new QueryAllRoleRequestDto();

        queryAllRoleRequestDto.setCount(10);
        queryAllRoleRequestDto.setPageNum(1);
//        queryAllRoleRequestDto.setPlatform("");
//        queryAllRoleRequestDto.setRoleNameEn("test2");
//        queryAllRoleRequestDto.setRoleNameZh("");

        InterUserRead api = (InterUserRead) context.getBean("interUserApiReadService");
        Result<QueryAllRoleResponseDto> result = api.queryAllRole(queryAllRoleRequestDto);

        System.out.println("=============params============");
        System.out.println(queryAllRoleRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}