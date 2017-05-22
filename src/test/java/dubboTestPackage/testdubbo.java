package dubboTestPackage;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.prod.api.dto.request.ProductQueryDto;
import com.miaoqian.prod.api.service.ProductApiService;
import dataBean.dubbo.productSys.MyOrderQueryDto;
import dataBean.dubbo.productSys.mytestBean;
import dataTool.DataFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class testdubbo extends AbstractTestCases {

    @Test(testName = "1010", description = "", groups = "dubbo")
    public void dubbo() throws Exception {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        //new String[] { "applicationConsumer.xml" });
        //context.start();
        //ProductApiService ProductApiService = (ProductApiService)context.getBean("productApiService");
        //MyOrderQueryDto myOrderQueryDto = DataFactory.getObject(MyOrderQueryDto.class,"mytest");
        //MyOrderQueryDto mytestBean1 = DataFactory.getObject(MyOrderQueryDto.class, "test456");
        //MyOrderQueryDto myOrderQueryDto2 = DataFactory.tansferData(mytestBean1,MyOrderQueryDto.class);


        mytestBean mytestBean1 = DataFactory.getObject(mytestBean.class, "test456");
        mytestBean mytestBean2 = DataFactory.tansferData(mytestBean1, mytestBean.class);
        System.out.println("age : " + mytestBean2.getAge());
        System.out.println("name : " + mytestBean2.getName());
        System.out.println("id : " + mytestBean2.getId());
        System.out.println("Brithday : " + mytestBean2.getBrithday());


        //MyOrderQueryDto myOrderQueryDto = new MyOrderQueryDto();
        //ProductQueryDto productQueryDto = new ProductQueryDto();
        //ProductApiService.getProductPage(productQueryDto);


        //PCHomePage pchomePage = new PCHomePage(driver);
//        LoginPage loginPage = pchomePage.gotoLoginPage();
//        pchomePage = loginPage.login("13295422111", "xiaoyang00x");
//        NavigationPage navigationPage = new NavigationPage(driver);      
//        LivePage livePage = navigationPage.navigationLivePage();
        //      WebReporter.log(driver, driver.getTitle(), true, true);
        //System.out.println("测试dubbo的");
        //testReflect(MyOrderQueryDto.class,MyOrderQueryDto.class);

    }

}
