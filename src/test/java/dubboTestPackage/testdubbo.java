package dubboTestPackage;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.prod.api.dto.request.CurrentProductDto;
import com.miaoqian.prod.api.dto.request.ProductDto;
import com.miaoqian.prod.api.service.ProductApiService;
import com.miaoqian.proj.api.dto.request.ProjectDto;
import com.miaoqian.proj.api.service.ProjectApiService;
import dataBean.dubbo.productSys.MyProductDto;
import dataTool.DataFactory;
import dataTool.InitYamlFileUtil;
import org.joda.time.DateTime;
import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testdubbo extends AbstractTestCases {


    @Test(testName = "1010", description = "", groups = "dubbo")
    public void dubbo() throws Exception {

//        ProjectApiService projectApiService = (ProjectApiService)context.getBean("projectApiService");
        MyProductDto myProductDto = DataFactory.getObject(MyProductDto.class,"noBidAmount");
        ProductDto productDto = DataFactory.tansferData(myProductDto,ProductDto.class);
        System.out.println(productDto.toString());
//        System.out.println(productDto.toString());
//        ProjectDto projectDto = new ProjectDto();
//        projectDto.setProjectName("haha");
//        projectDto.setProjectCode("hehe");
        //Result<String> result = projectApiService.createProject(projectDto);
//        System.out.println("111111" + result);

    }

}
