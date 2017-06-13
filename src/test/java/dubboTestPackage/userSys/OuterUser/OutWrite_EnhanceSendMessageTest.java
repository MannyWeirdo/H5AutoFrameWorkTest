package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.personaccount.PersonAccountRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.sendmessage.SendMessageReqDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserWrite;
import com.miaoqian.usersvc.model.enums.ChannelEnum;
import dataBean.dubbo.userSys.MySendMessageReqDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */
public class OutWrite_EnhanceSendMessageTest extends AbstractTestCases{

    @Test(testName = "enhanceSendMessage", description = "all_scenario", groups = "dubbo")
    public void enhanceSendMessageTest() throws Exception {
        MySendMessageReqDto mySendMessageReqDto = DataFactory.getObject(MySendMessageReqDto.class,"regular");
        SendMessageReqDto sendMessageReqDto = DataFactory.transferData(mySendMessageReqDto, SendMessageReqDto.class);
        sendMessageReqDto.setChannel(ChannelEnum.MOBILE);

        OutUserWrite api = (OutUserWrite) context.getBean("outUserApiWriteService");
        Result<String> result = api.enhanceSendMessage(sendMessageReqDto);


        System.out.println("=============params============");
        System.out.println(sendMessageReqDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);
    }
}
