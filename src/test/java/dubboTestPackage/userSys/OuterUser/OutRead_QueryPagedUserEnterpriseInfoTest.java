package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryallauth.PagedUserEnterpriseInfoResDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.enterpriseinfo.UserEnterpriseInfoReqDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.querypersonalaccountinfo.AccountMutilDetailInfoResDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import dataBean.dubbo.userSys.MyUserEnterpriseInfoReqDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_QueryPagedUserEnterpriseInfoTest extends AbstractTestCases{

    @Test(testName = "queryPagedUserEnterpriseInfo", description = "all_scenario", groups = "dubbo")
    public void queryPagedUserEnterpriseInfoTest() throws Exception{


        MyUserEnterpriseInfoReqDto myitem = DataFactory.getObject(MyUserEnterpriseInfoReqDto.class, "noSize");
        UserEnterpriseInfoReqDto item = DataFactory.transferData(myitem, UserEnterpriseInfoReqDto.class);



        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<PagedUserEnterpriseInfoResDto> result = api.queryPagedUserEnterpriseInfo(item);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
