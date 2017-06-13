package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryinneruserinfo.QueryInnerUserInfoRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryinneruserinfo.QueryInnerUserInfoResponseDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserRead;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerRead_QueryInnerUserInfoTest extends AbstractTestCases{

    @Test(testName = "queryInnerUserInfo", description = "all_scenario", groups = "dubbo")
    public void queryInnerUserInfoTest() throws Exception{


        QueryInnerUserInfoRequestDto queryInnerUserInfoRequestDto = new QueryInnerUserInfoRequestDto();
        queryInnerUserInfoRequestDto.setCount(10);
//        queryInnerUserInfoRequestDto.setName("");
        queryInnerUserInfoRequestDto.setPageNum(1);

        InterUserRead api = (InterUserRead) context.getBean("interUserApiReadService");
        Result<QueryInnerUserInfoResponseDto> result = api.queryInnerUserInfo(queryInnerUserInfoRequestDto);

        System.out.println("=============params============");
        System.out.println(queryInnerUserInfoRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
