package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryallauth.QueryAllAuthRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryallauth.QueryAllAuthResponseDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryallrole.QueryAllRoleRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryallrole.QueryAllRoleResponseDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserRead;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerRead_QueryAllAuthTest extends AbstractTestCases{

    @Test(testName = "queryAllAuth", description = "all_scenario", groups = "dubbo")
    public void queryAllAuthTest() throws Exception{


        QueryAllAuthRequestDto item = new QueryAllAuthRequestDto();

        item.setPageNum(1);
        item.setCount(10);
//        item.setAuthNameEn("");
        item.setAuthNameZh("财务系统项目删除");
//        item.setParentId("");

        InterUserRead api = (InterUserRead) context.getBean("interUserApiReadService");
        Result<QueryAllAuthResponseDto> result = api.queryAllAuth(item);

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