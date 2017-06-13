package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.updateinneruserinfo.UpdateInnerUserInfoRequestDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserWrite;
import dataBean.dubbo.userSys.MyUpdateInnerUserInfoRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerWrite_UpdateInnerUserInfoTest extends AbstractTestCases{

    @Test(testName = "updateInnerUserInfo", description = "all_scenario", groups = "dubbo")
    public void updateInnerUserInfoTest() throws Exception{
        MyUpdateInnerUserInfoRequestDto myUpdateInnerUserInfoRequestDto = DataFactory.getObject(MyUpdateInnerUserInfoRequestDto.class, "regular");
        UpdateInnerUserInfoRequestDto updateInnerUserInfoRequestDto = DataFactory.transferData(myUpdateInnerUserInfoRequestDto,UpdateInnerUserInfoRequestDto.class);

        InterUserWrite api = (InterUserWrite) context.getBean("interUserApiWriteService");
        Result result = api.updateInnerUserInfo(updateInnerUserInfoRequestDto);

        System.out.println("=============params============");
        System.out.println(updateInnerUserInfoRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
