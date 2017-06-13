package dubboTestPackage.userSys.InnerUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.authadd.AuthAddRequestDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.authadd.AuthInfoDto;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.roleadd.RoleInfoDto;
import com.miaoqian.usersvc.dubbo.api.interuser.InterUserWrite;
import dataBean.dubbo.userSys.MyAuthAddRequestDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class InnerWrite_AuthAddTest extends AbstractTestCases{

    @Test(testName = "authAdd", description = "all_scenario", groups = "dubbo")
    public void authAddTest() throws Exception{
        MyAuthAddRequestDto myAuthAddRequestDto = DataFactory.getObject(MyAuthAddRequestDto.class, "regular");
        AuthAddRequestDto authAddRequestDto = DataFactory.transferData(myAuthAddRequestDto,AuthAddRequestDto.class);

        InterUserWrite api = (InterUserWrite) context.getBean("interUserApiWriteService");
        Result<AuthInfoDto> result = api.authAdd(authAddRequestDto);

        System.out.println("=============params============");
        System.out.println(myAuthAddRequestDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(), 200);
    }

}
