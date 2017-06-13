package dubboTestPackage.basic_file;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.email.api.dubbo.MailAPI;
import com.miaoqian.email.api.dubbo.request.MailAttachFile;
import com.miaoqian.email.api.dubbo.request.MailInfo;
import com.miaoqian.email.api.dubbo.request.MailMode;
import com.miaoqian.email.api.dubbo.request.MailSendRequest;
import com.miaoqian.email.api.dubbo.response.MailSendResult;
import com.miaoqian.file.api.dubbo.FileAPI;
import com.miaoqian.file.api.dubbo.request.FileUploadInfo;
import com.miaoqian.file.api.dubbo.request.HTTPType;
import com.miaoqian.file.api.dubbo.response.FileUploadResult;
import com.miaoqian.framework.domain.Platform;
import com.miaoqian.framework.domain.Request;
import com.miaoqian.framework.domain.Result;
import javafx.collections.transformation.FilteredList;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guchenglong on 2017/6/8.
 */
public class BasicFileUploadTest extends AbstractTestCases {

    @Test(testName = "uploadFile_test", description = "file_upload", groups = "dubbo")
    public void testFileUpload() throws Exception {
        // 正常文件
//        File file = new File("/Users/guchenglong/workspace/auto_test/H5AutoFrameWorkTest/src/test/java/dubboTestPackage/basic_email/111.txt");
        // 文件大于30m
        File file = new File("/Users/guchenglong/workspace/auto_test/H5AutoFrameWorkTest/src/test/java/dubboTestPackage/basic_email/111.txt");
        InputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);

        FileUploadInfo fu = new FileUploadInfo();
        fu.setFileContent(bytes);
        fu.setFileName("111.txt");
        fu.setDescription("xxxooo");
        fu.setHttpType(HTTPType.HTTP);

        ArrayList<FileUploadInfo> items = new ArrayList<>();
        items.add(fu);

        Request<ArrayList<FileUploadInfo>> request = new Request<ArrayList<FileUploadInfo>>();
        request.setParam(items);
        request.setPlatform(Platform.PC);



        FileAPI fileAPI = (FileAPI) context.getBean("fileServices") ;
        Result<ArrayList<FileUploadResult>> results = fileAPI.uploadFiles(request);

        System.out.println("=============================");
        System.out.println(results.getCode());
        System.out.println("=============================");
        System.out.println(results.getMessage());
        System.out.println("=============================");
        System.out.println(results.getData());

        fileInputStream.close();
    }
}
