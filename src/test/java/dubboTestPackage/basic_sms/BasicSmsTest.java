package dubboTestPackage.basic_sms;

import abstractTestCase.AbstractTestCases;

import com.miaoqian.framework.domain.Platform;
import com.miaoqian.framework.domain.Request;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.framework.util.UUIDUtils;
import com.miaoqian.msg.api.producer.rocketmq.RocketMessageDto;
import com.miaoqian.msg.api.producer.rocketmq.RocketProducerClient;
import com.miaoqian.sms.api.dubbo.SmsAPI;
import com.miaoqian.sms.api.dubbo.request.SmsBizType;
import com.miaoqian.sms.api.dubbo.request.SmsInfo;
import com.miaoqian.sms.api.dubbo.request.mq.SmsInfoMqDto;
import org.testng.annotations.Test;

import java.util.Random;


/**
 * Created by guchenglong on 2017/6/8.
 */
public class BasicSmsTest extends AbstractTestCases {

    @Test(testName = "send_sms", description = "sms_send", groups = "dubbo")
    public void testSendSms() throws Exception {

        String random = "0000" +  new Random().nextInt(50);
        String[] mobiles = new String[2];
        mobiles[0] = "17600312344";
        mobiles[1] = "18513219863";
        SmsInfo smsInfo = new SmsInfo();
        smsInfo.setRequestNumber(UUIDUtils.uuidWithoutSeparator());
        smsInfo.setMobileNumbers(mobiles);
        smsInfo.setParamList(new String[]{"123456" + random});
        smsInfo.setTemplateId(34);
        smsInfo.setSmsBizType(SmsBizType.VERIFICATION);
        smsInfo.setMessageContent("测试短信");
        smsInfo.setSmsType("验证码");
        smsInfo.setBizType("提现");

        Request<SmsInfo> request = new Request<SmsInfo>();
        request.setPlatform(Platform.APP);
        request.setParam(smsInfo);

        SmsAPI smsAPI = (SmsAPI)context.getBean("smsServices");

        Result results = smsAPI.sendMessage(request);

        System.out.println("=============================");
        System.out.println(results.getCode());
        System.out.println("=============================");
        System.out.println(results.getMessage());
        System.out.println("=============================");
        System.out.println(results.getData());


//        RocketProducerClient rocketProducerClient = (RocketProducerClient)context.getBean("smsSendProducerClient");
//        String random = "0000" +  new Random().nextInt(50);
//        SmsInfoMqDto mqDto = new SmsInfoMqDto();
//        mqDto.setMobileNumbers(new String[]{"18513219863", "17600312344"});
//        mqDto.setTemplateId(22);
//        mqDto.setRequestNumber(UUIDUtils.uuidWithoutSeparator());
//        mqDto.setSmsBizType(SmsBizType.VERIFICATION);
//        mqDto.setParamList(new String[]{"xxx" + random});
//        mqDto.setBizType("biztype");
//        mqDto.setSmsType("smsType");
//        mqDto.setMessageContent("8888这是一条测试短信." + random);
//        mqDto.setPlatform(Platform.APP);
//        RocketMessageDto rocketMessageDto = new RocketMessageDto("smsSendTopic", "888999000777554533322111", mqDto);
//        rocketProducerClient.sendMessage(rocketMessageDto);
//
//        System.out.println("=============================");
//        System.out.println(random);

    }
}
