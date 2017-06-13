package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.openjxpageinterface.OpenPageParamsReqDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.openjxpageinterface.OpenPageParamsResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import com.miaoqian.usersvc.model.enums.ChannelEnum;
import dataBean.dubbo.userSys.MyOpenPageParamsReqDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_OpenPageApplyParamsTest extends AbstractTestCases{

    @Test(testName = "openPageApplyParams", description = "all_scenario", groups = "dubbo")
    public void openPageApplyParamsTest() throws Exception{
        MyOpenPageParamsReqDto myOpenPageParamsReqDto = DataFactory.getObject(MyOpenPageParamsReqDto.class, "auto_transfer");
        OpenPageParamsReqDto openPageParamsReqDto = DataFactory.transferData(myOpenPageParamsReqDto, OpenPageParamsReqDto.class);
        openPageParamsReqDto.setChannel(ChannelEnum.MOBILE);

//        OutUserWrite api = (OutUserWrite) context.getBean("outUserApiWriteService");
        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<OpenPageParamsResDto> result = api.openPageApplyParams(openPageParamsReqDto);

        System.out.println("============params===========");
        System.out.println(openPageParamsReqDto.toString());

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
