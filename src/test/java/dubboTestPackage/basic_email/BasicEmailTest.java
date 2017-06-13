package dubboTestPackage.basic_email;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.email.api.dubbo.MailAPI;
import com.miaoqian.email.api.dubbo.request.MailAttachFile;
import com.miaoqian.email.api.dubbo.request.MailInfo;
import com.miaoqian.email.api.dubbo.request.MailMode;
import com.miaoqian.email.api.dubbo.request.MailSendRequest;
import com.miaoqian.email.api.dubbo.response.MailSendResult;
import com.miaoqian.framework.domain.Platform;
import com.miaoqian.framework.domain.Request;
import com.miaoqian.framework.domain.Result;
import org.LogFactory.LogFactory;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guchenglong on 2017/6/8.
 */
public class BasicEmailTest extends AbstractTestCases {

    @Test(testName = "email_test", description = "email", groups = "dubbo")
    public void testEmail() throws Exception {

        File file = new File("/Users/guchenglong/workspace/auto_test/H5AutoFrameWorkTest/src/test/java/dubboTestPackage/basic_email/111.txt");
        InputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);

        MailAttachFile attachFile = new MailAttachFile();
        attachFile.setFileContent(bytes);
        attachFile.setFileName("111.txt");

        List<String> recivers = new ArrayList<String>();
        recivers.add("yangy@shicaidai.com");

        List<String> blinds = new ArrayList<String>();
        blinds.add("zhangxx@shicaidai.com");

        List<String> carborns = new ArrayList<String>();
        carborns.add("gucl@shicaidai.com");

        List<MailAttachFile> attachFiles = new ArrayList<>();
        attachFiles.add(attachFile);

        MailInfo mailInfo = new MailInfo();
        mailInfo.setToAddresses(recivers);
        mailInfo.setToBlindCarbonCopyAddresses(blinds);
        mailInfo.setToCarbonCopyAddresses(carborns);
        mailInfo.setSubject("text email");
        mailInfo.setContent("cc test.");
        mailInfo.setMailAttachFiles(attachFiles);
        MailSendRequest myItem = new MailSendRequest();
        myItem.setMode(MailMode.SMTP);
        myItem.setMailInfo(mailInfo);

        Request<MailSendRequest> request = new Request<MailSendRequest>();
        request.setPlatform(Platform.APP);
        request.setParam(myItem);

        MailAPI mailAPI = (MailAPI) context.getBean("emailServices") ;
        Result<MailSendResult> results = mailAPI.send(request);

        System.out.println("=============================");
        System.out.println(results.getCode());
        System.out.println("=============================");
        System.out.println(results.getMessage());
        System.out.println("=============================");
        System.out.println(results.getData());

    }
}
