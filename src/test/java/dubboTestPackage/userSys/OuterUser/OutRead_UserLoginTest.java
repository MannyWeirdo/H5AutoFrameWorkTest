package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userregister.UserRegisterReqDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userregister.UserRegisterResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserWrite;
import dataBean.dubbo.userSys.MyUserRegisterReqDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_UserLoginTest extends AbstractTestCases{

    @Test(testName = "userLogin", description = "all_scenario", groups = "dubbo")
    public void userLoginTest() throws Exception{

        // regular
        String mobile = "17600312345";
        String password = "qwertyuioplkjhgfdsazxcvbnm123456";

//        // wrong mobile
//        String mobile = "170312345";
//        String password = "qwertyuioplkjhgfdsazxcvbnm123456";

//        // wrong password
//        String mobile = "17600312345";
//        String password = "hadshg";

//        // no mobile
//        String mobile = "";
//        String password = "qwertyuioplkjhgfdsazxcvbnm123456";

//        // no password
//        String mobile = "17600312345";
//        String password = "";

        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<UserRegisterResDto> result = api.userLogin(mobile, password);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
