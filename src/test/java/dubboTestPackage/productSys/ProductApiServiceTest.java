package dubboTestPackage.productSys;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.prod.api.dto.request.ProductDto;
import com.miaoqian.prod.api.service.ProductApiService;
import dataBean.dubbo.productSys.MyProductDto;
import dataTool.DataFactory;
import org.testng.annotations.Test;

/**
 * Created by alex on 2017/6/1.
 */
public class ProductApiServiceTest extends AbstractTestCases {

    @Test(testName = "createProduct", description = "创建默认产品", groups = "dubbo")
    public void createProduct() throws Exception {
        ProductApiService productApiService = (ProductApiService)context.getBean("productApiService");
        MyProductDto myProductDto = DataFactory.getObject(MyProductDto.class,"default");
        ProductDto productDto =  DataFactory.tansferData(myProductDto,ProductDto.class);
        Result result = productApiService.createProduct(productDto);
        System.out.println(result);
    }


    @Test(testName = "updateProduct", description = "更新产品", groups = "dubbo")
    public void updateProduct() throws Exception {
        ProductApiService productApiService = (ProductApiService)context.getBean("productApiService");
        MyProductDto myProductDto = DataFactory.getObject(MyProductDto.class,"default");
        ProductDto productDto =  DataFactory.tansferData(myProductDto,ProductDto.class);
        //Result createResult = productApiService.createProduct(productDto);
        //System.out.println(createResult);
        productDto.setDescription("haveupdateproduct!!!");
        productDto.setProductCode("MQBPTB17060116400001");
        Result updateResult =  productApiService.updateProduct(productDto);
        System.out.println(updateResult);
    }












}
