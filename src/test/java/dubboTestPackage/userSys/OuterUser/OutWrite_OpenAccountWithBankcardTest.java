package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.personaccount.PersonAccountRequestDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserWrite;
import com.miaoqian.usersvc.model.enums.ChannelEnum;
import dataBean.dubbo.userSys.MyPersonAccountRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */
public class OutWrite_OpenAccountWithBankcardTest extends AbstractTestCases {

    @Test(testName = "openAccountWithBankCard", description = "all_scenario", groups = "dubbo")
    public void openAccountWithBankCardTest() throws Exception {

        MyPersonAccountRequestDto myPersonAccountRequestDto = DataFactory.getObject(MyPersonAccountRequestDto.class,"regular");
        PersonAccountRequestDto personAccountRequestDto = DataFactory.transferData(myPersonAccountRequestDto, PersonAccountRequestDto.class);
        personAccountRequestDto.setChannel(ChannelEnum.MOBILE);

        OutUserWrite api = (OutUserWrite) context.getBean("outUserApiWriteService");

        System.out.println("=============request in.=============");
        Result<Boolean> result = api.openAccountWithBankcard(personAccountRequestDto);

        System.out.println("=============params============");
        System.out.println(personAccountRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);
    }

}
