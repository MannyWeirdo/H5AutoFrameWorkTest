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
        MyOrderQueryDto mytestBean1 = DataFactory.getObject(MyOrderQueryDto.class, "test456");
        MyOrderQueryDto myOrderQueryDto2 = testReflect(mytestBean1,MyOrderQueryDto.class);



        mytestBean mytestBean2 = testReflect(mytestBean1, mytestBean.class);
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

    public static <T> T testReflect(Object model, Class<T> dto) throws Exception {
        Field[] field = model.getClass().getDeclaredFields();        //获取实体类的所有属性，返回Field数组
        Object dtoBean = dto.newInstance();
        for (int j = 0; j < field.length; j++) {     //遍历所有属性
            String name = field[j].getName();    //获取属性的名字
            if (name.equals("id")) {

            } else {
                System.out.println("attribute name:" + name);
                name = name.substring(0, 1).toUpperCase() + name.substring(1); //将属性的首字符大写，方便构造get，set方法
                String type = field[j].getGenericType().toString();    //获取属性的类型
                if (type.equals("class java.lang.String")) {   //如果type是类类型，则前面包含"class "，后面跟类名
                    Method m = model.getClass().getMethod("get" + name);
                    String value = (String) m.invoke(model);    //调用getter方法获取属性值
                    if (value != null) {
                        System.out.println("attribute value:" + value);
                        Method set = dto.getMethod("set" + name, String.class);
                        set.invoke(dtoBean, value);
                    }
                }
                if (type.equals("class java.lang.Integer")) {
                    Method m = model.getClass().getMethod("get" + name);
                    Integer value = (Integer) m.invoke(model);
                    if (value != null) {
                        System.out.println("attribute value:" + value);
                        Method set = dto.getMethod("set" + name, Integer.class);
                        set.invoke(dtoBean, value);
                    }
                }
                if (type.equals("class java.lang.Short")) {
                    Method m = model.getClass().getMethod("get" + name);
                    Short value = (Short) m.invoke(model);
                    if (value != null) {
                        System.out.println("attribute value:" + value);
                        Method set = dto.getMethod("set" + name, Short.class);
                        set.invoke(dtoBean, value);
                    }
                }
                if (type.equals("class java.lang.Double")) {
                    Method m = model.getClass().getMethod("get" + name);
                    Double value = (Double) m.invoke(model);
                    if (value != null) {
                        System.out.println("attribute value:" + value);
                        Method set = dto.getMethod("set" + name, Double.class);
                        set.invoke(dtoBean, value);
                    }
                }
                if (type.equals("class java.lang.Boolean")) {
                    Method m = model.getClass().getMethod("get" + name);
                    Boolean value = (Boolean) m.invoke(model);
                    if (value != null) {
                        System.out.println("attribute value:" + value);
                        Method set = dto.getMethod("set" + name, Boolean.class);
                        set.invoke(dtoBean, value);
                    }
                }
                if (type.equals("class java.util.Date")) {
                    Method m = model.getClass().getMethod("get" + name);
                    Date value = (Date) m.invoke(model);
                    if (value != null) {
                        System.out.println("attribute value:" + value.toLocaleString());
                        Method set = dto.getMethod("set" + name, Date.class);
                        set.invoke(dtoBean, value);
                    }
                }

            }

        }
        return (T) dtoBean;
    }
}
