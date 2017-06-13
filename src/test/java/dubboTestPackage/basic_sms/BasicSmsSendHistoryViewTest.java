package dubboTestPackage.basic_sms;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.*;
import com.miaoqian.framework.util.UUIDUtils;
import com.miaoqian.sms.api.dubbo.SmsAPI;
import com.miaoqian.sms.api.dubbo.request.FindSendMessageVoRequestRequest;
import com.miaoqian.sms.api.dubbo.request.SmsBizType;
import com.miaoqian.sms.api.dubbo.request.SmsInfo;
import com.miaoqian.sms.api.dubbo.response.SendHistoryView;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by guchenglong on 2017/6/8.
 */
public class BasicSmsSendHistoryViewTest extends AbstractTestCases {

    @Test(testName = "send_sms", description = "sms_send", groups = "dubbo")
    public void testSendSms() throws Exception {

        String start = "2017-06-09 00:00";
        String end = "2017-06-09 23:59";
        DateFormat format = new SimpleDateFormat("yyy-MM-dd HH:mm");
        FindSendMessageVoRequestRequest request = new FindSendMessageVoRequestRequest();
        request.setMobileNo("17600312344");
        request.setSendTimeStart(format.parse(start));
        request.setSendTimeEnd(format.parse(end));
        request.setPageQuery(new PageQuery(1,10));

        SmsAPI smsAPI = (SmsAPI)context.getBean("smsServices");

        Result<Page<SendHistoryView>> results = smsAPI.findSendMessage(request);

        System.out.println("=============================");
        System.out.println(results.getCode());
        System.out.println("=============================");
        System.out.println(results.getMessage());
        System.out.println("=============================");
        System.out.println(results.getData().getList().size());

    }
}
