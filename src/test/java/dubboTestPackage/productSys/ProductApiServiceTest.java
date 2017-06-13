package dubboTestPackage.productSys;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.prod.api.dto.request.ProductDto;
import com.miaoqian.prod.api.dto.request.ProductProjectRelationQueryDto;
import com.miaoqian.prod.api.dto.request.ProductRelateProjectParamDto;
import com.miaoqian.prod.api.dto.request.SupplyProjectParamDto;
import com.miaoqian.prod.api.service.ProductApiService;
import dataBean.dubbo.productSys.MyProductDto;
import dataBean.dubbo.productSys.MyProductProjectRelationQueryDto;
import dataBean.dubbo.productSys.MyProductRelateProjectParamDto;
import dataBean.dubbo.productSys.MySupplyProjectParamDto;
import dataTool.DataFactory;
import org.testng.annotations.Test;

/**
 * Created by alex on 2017/6/1.
 */
public class ProductApiServiceTest extends AbstractTestCases {

    @Test(testName = "mytest", description = "创建默认产品", groups = "dubbo")
    public void testData() throws Exception {
        MySupplyProjectParamDto mySupplyProjectParamDto = DataFactory.getObject(MySupplyProjectParamDto.class,"noSupplyProjectSubParamDtoList");
        SupplyProjectParamDto supplyProjectParamDto =  DataFactory.transferData(mySupplyProjectParamDto,SupplyProjectParamDto.class);
        System.out.println(supplyProjectParamDto.getIpAddress());
        System.out.println(supplyProjectParamDto.getSupplyProjectSubParamDtoList());

    }




    @Test(testName = "createProduct", description = "创建默认产品", groups = "dubbo")
    public void createProduct() throws Exception {
        ProductApiService productApiService = (ProductApiService)context.getBean("productApiService");
        MyProductDto myProductDto = DataFactory.getObject(MyProductDto.class,"default");
        ProductDto productDto =  DataFactory.transferData(myProductDto,ProductDto.class);
        Result result = productApiService.createProduct(productDto);
        System.out.println(result);
    }


    @Test(testName = "updateProduct", description = "更新产品", groups = "dubbo")
    public void updateProduct() throws Exception {
        ProductApiService productApiService = (ProductApiService)context.getBean("productApiService");
        MyProductDto myProductDto = DataFactory.getObject(MyProductDto.class,"default");
        ProductDto productDto =  DataFactory.transferData(myProductDto,ProductDto.class);
        //Result createResult = productApiService.createProduct(productDto);
        //System.out.println(createResult);
        productDto.setDescription("haveupdateproduct!!!");
        productDto.setProductCode("MQBPTB17060116400001");
        Result updateResult =  productApiService.updateProduct(productDto);
        System.out.println(updateResult);
    }



    @Test(testName = "getProductSimpleInfo", description = "产品基本信息查询", groups = "dubbo")
    public void getProductSimpleInfo() throws Exception {
        ProductApiService productApiService = (ProductApiService)context.getBean("productApiService");
        //Result result = productApiService.getProductSimpleInfo(null);
        Result result = productApiService.getProductSimpleInfo("已经存在的产品");
        System.out.println(result);
    }



    @Test(testName = "getProduct", description = "查询产品详情", groups = "dubbo")
    public void getProduct() throws Exception {
        ProductApiService productApiService = (ProductApiService)context.getBean("productApiService");
        //Result result = productApiService.getProduct(null);
        Result result = productApiService.getProduct("已经存在的产品");
        System.out.println(result);
    }










}
