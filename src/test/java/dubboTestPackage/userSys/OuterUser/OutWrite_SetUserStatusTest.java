package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userstatus.SetUserStatusReqDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserWrite;
import dataBean.dubbo.userSys.MySetUserStatusReqDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutWrite_SetUserStatusTest extends AbstractTestCases{

    @Test(testName = "setUserStatus", description = "all_scenario", groups = "dubbo")
    public void setUserStatusTest() throws Exception{
        MySetUserStatusReqDto mySetUserStatusReqDto = DataFactory.getObject(MySetUserStatusReqDto.class, "wrong_userStatus");
        SetUserStatusReqDto setUserStatusReqDto = DataFactory.transferData(mySetUserStatusReqDto,SetUserStatusReqDto.class);

        OutUserWrite api = (OutUserWrite) context.getBean("outUserApiWriteService");
        Result<Boolean> result = api.setUserStatus(setUserStatusReqDto);

        System.out.println("=============params============");
        System.out.println(setUserStatusReqDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
