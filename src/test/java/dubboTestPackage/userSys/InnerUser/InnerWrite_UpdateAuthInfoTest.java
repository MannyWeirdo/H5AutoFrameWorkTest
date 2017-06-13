package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.updateauthinfo.UpdateAuthInfoRequestDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserWrite;
import dataBean.dubbo.userSys.MyUpdateAuthInfoRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerWrite_UpdateAuthInfoTest extends AbstractTestCases{

    @Test(testName = "updateAuthInfo", description = "all_scenario", groups = "dubbo")
    public void updateAuthInfoTest() throws Exception{
        MyUpdateAuthInfoRequestDto myUpdateAuthInfoRequestDto = DataFactory.getObject(MyUpdateAuthInfoRequestDto.class, "regular");
        UpdateAuthInfoRequestDto updateAuthInfoRequestDto = DataFactory.transferData(myUpdateAuthInfoRequestDto,UpdateAuthInfoRequestDto.class);

        InterUserWrite api = (InterUserWrite) context.getBean("interUserApiWriteService");
        Result result = api.updateAuthInfo(updateAuthInfoRequestDto);

        System.out.println("=============params============");
        System.out.println(updateAuthInfoRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
