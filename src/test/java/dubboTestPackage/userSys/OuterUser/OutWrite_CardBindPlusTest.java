package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.personaccount.UserCardBindPlusReqDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserWrite;
import com.miaoqian.usersvc.model.enums.ChannelEnum;
import dataBean.dubbo.userSys.MyUserCardBindPlusReqDto;
import dataTool.DataFactory;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutWrite_CardBindPlusTest extends AbstractTestCases{

    @Test(testName = "cardBindPlus", description = "all_scenario", groups = "dubbo")
    public void cardBindPlusTest() throws Exception{
        MyUserCardBindPlusReqDto myUserCardBindPlusReqDto = DataFactory.getObject(MyUserCardBindPlusReqDto.class, "regular");
        UserCardBindPlusReqDto userCardBindPlusReqDto = DataFactory.transferData(myUserCardBindPlusReqDto,UserCardBindPlusReqDto.class);
        userCardBindPlusReqDto.setChannel(ChannelEnum.MOBILE);

        OutUserWrite api = (OutUserWrite) context.getBean("outUserApiWriteService");
        Result<Boolean> result = api.cardBindPlus(userCardBindPlusReqDto);

        System.out.println("==============params=============");
        System.out.println(userCardBindPlusReqDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
    }

}
