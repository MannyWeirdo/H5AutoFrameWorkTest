package dubboTestPackage.basic_file;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.file.api.dubbo.FileAPI;
import com.miaoqian.file.api.dubbo.request.FileUploadInfo;
import com.miaoqian.file.api.dubbo.request.HTTPType;
import com.miaoqian.file.api.dubbo.response.FileDownloadResult;
import com.miaoqian.file.api.dubbo.response.FileUploadResult;
import com.miaoqian.framework.domain.Platform;
import com.miaoqian.framework.domain.Request;
import com.miaoqian.framework.domain.Result;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by guchenglong on 2017/6/8.
 */
public class BasicFileDownloadTest extends AbstractTestCases {

    @Test(testName = "downloadFile_test", description = "file_download", groups = "dubbo")
    public void testFileDownload() throws Exception {

        String id = "ab7300a82e5a48e1b7c61c581cb03371";
        Request<String> request = new Request<String>();
        request.setParam(id);
        request.setPlatform(Platform.PC);

        FileAPI fileAPI = (FileAPI) context.getBean("fileServices") ;
        Result<FileDownloadResult> results = fileAPI.downloadFile(request);

        // remove file
//        Result<String> results = fileAPI.deleteFile(request);


        System.out.println("=============================");
        System.out.println(results.getCode());
        System.out.println("=============================");
        System.out.println(results.getMessage());
        System.out.println("=============================");
        System.out.println(results.getData().getFileAccessUrl() + "*****" + results.getData().getFileAccessUrl());
    }
}
