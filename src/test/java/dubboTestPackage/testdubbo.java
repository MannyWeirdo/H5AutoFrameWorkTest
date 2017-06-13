package dubboTestPackage;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.prod.api.dto.request.CurrentProductDto;
import com.miaoqian.prod.api.dto.request.ProductDto;
import com.miaoqian.prod.api.service.ProductApiService;
import com.miaoqian.proj.api.dto.request.ContractDto;
import com.miaoqian.proj.api.dto.request.ProjectDto;
import com.miaoqian.proj.api.dto.request.ProjectGuaranteeDto;
import com.miaoqian.proj.api.dto.request.PublisherDto;
import com.miaoqian.proj.api.service.ProjectApiService;
import dataBean.dubbo.productSys.MyProductDto;
import dataBean.dubbo.projectSys.MyContractDto;
import dataBean.dubbo.projectSys.MyProjectDto;
import dataBean.dubbo.projectSys.MyProjectGuaranteeDto;
import dataBean.dubbo.projectSys.MyPublisherDto;
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

    }
}
