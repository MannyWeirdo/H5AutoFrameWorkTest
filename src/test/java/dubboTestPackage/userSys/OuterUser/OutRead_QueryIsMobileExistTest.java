package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.userregister.UserRegisterResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_QueryIsMobileExistTest extends AbstractTestCases{

    @Test(testName = "queryIsMobileExist", description = "all_scenario", groups = "dubbo")
    public void queryIsMobileExistTest() throws Exception{

        // mobile 存在
        String mobile = "15011032705";

//        // mobile 不存在
//        String mobile = "1780312345";

//        // mobile 空
//        String mobile = "";

//        // mobile 格式错
//        String mobile = "17803123451123";

        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<Boolean> result = api.queryIsMobileExist(mobile);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
