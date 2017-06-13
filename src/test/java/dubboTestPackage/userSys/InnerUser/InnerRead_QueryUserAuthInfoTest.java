package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryuserauthinfo.QueryUserAuthInfoResponseDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryuserauthinfo.QueryUserAuthInfoResquestDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserRead;
import dataBean.dubbo.userSys.MyQueryUserAuthInfoResquestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerRead_QueryUserAuthInfoTest extends AbstractTestCases{

    @Test(testName = "queryUserAuthInfo", description = "all_scenario", groups = "dubbo")
    public void queryUserAuthInfoTest() throws Exception{
        MyQueryUserAuthInfoResquestDto myQueryUserAuthInfoResquestDto = DataFactory.getObject(MyQueryUserAuthInfoResquestDto.class, "no_platform");
        QueryUserAuthInfoResquestDto queryUserAuthInfoResquestDto = DataFactory.transferData(myQueryUserAuthInfoResquestDto,QueryUserAuthInfoResquestDto.class);

        InterUserRead api = (InterUserRead) context.getBean("interUserApiReadService");
        Result<QueryUserAuthInfoResponseDto> result = api.queryUserAuthInfo(queryUserAuthInfoResquestDto);

        System.out.println("=============params============");
        System.out.println(queryUserAuthInfoResquestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
