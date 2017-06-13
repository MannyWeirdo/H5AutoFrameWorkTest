package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryallauth.PagedUserLogPasChaRecordResDto;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.enterpriseinfo.UserLogPasChaRecordReqDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserRead;
import dataBean.dubbo.userSys.MyUserLogPasChaRecordReqDto;
import dataTool.DataFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutRead_QueryPagedUserLogPasChaRecordTest extends AbstractTestCases{

    @Test(testName = "queryPagedUserLogPasChaRecord", description = "all_scenario", groups = "dubbo")
    public void queryPagedUserLogPasChaRecordTest() throws Exception{

        MyUserLogPasChaRecordReqDto myUserLogPasChaRecordReqDto = DataFactory.getObject(MyUserLogPasChaRecordReqDto.class,"all");
        UserLogPasChaRecordReqDto item = DataFactory.transferData(myUserLogPasChaRecordReqDto,UserLogPasChaRecordReqDto.class);



        OutUserRead api = (OutUserRead) context.getBean("outUserApiReadService");
        Result<PagedUserLogPasChaRecordResDto> result = api.queryPagedUserLogPasChaRecord(item);

        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
        Assert.assertEquals(result.getCode(),200);

    }

}
