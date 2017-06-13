package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.bankcardinfo.BankcardDetailInfoReqDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserWrite;
import com.miaoqian.usersvc.model.enums.AccountTypeEnum;
import dataBean.dubbo.userSys.MyBankcardDetailInfoReqDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutWrite_SetUserBankCardInfoTest extends AbstractTestCases{

    @Test(testName = "setUserBankCardInfo", description = "all_scenario", groups = "dubbo")
    public void setBankCardInfoTest() throws Exception{
        MyBankcardDetailInfoReqDto myBankcardDetailInfoReqDto = DataFactory.getObject(MyBankcardDetailInfoReqDto.class, "mismatch_cardNoAndUid");
        BankcardDetailInfoReqDto bankcardDetailInfoReqDto = DataFactory.transferData(myBankcardDetailInfoReqDto,BankcardDetailInfoReqDto.class);
        bankcardDetailInfoReqDto.setAccountType(AccountTypeEnum.PERSONAL);

        OutUserWrite api = (OutUserWrite) context.getBean("outUserApiWriteService");
        Result<Boolean> result = api.setUserBankCardInfo(bankcardDetailInfoReqDto);

        System.out.println("=============params============");
        System.out.println(bankcardDetailInfoReqDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);
        
    }

}
