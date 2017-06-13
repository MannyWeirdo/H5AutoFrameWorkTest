package dubboTestPackage.userSys.OuterUser;

import abstractTestCase.AbstractTestCases;
import com.miaoqian.framework.domain.Result;
import com.miaoqian.usersvc.dubbo.api.dto.outuser.enterpriseinfo.UpdateEnterpriseInfoReqDto;
import com.miaoqian.usersvc.dubbo.api.outuser.OutUserWrite;
import dataBean.dubbo.userSys.MyUpdateEnterpriseInfoReqDto;
import dataTool.DataFactory;
import org.testng.annotations.Test;

/**
 * Created by guchenglong on 2017/6/12.
 */

public class OutWrite_UpdateEnterpriseInfoTest extends AbstractTestCases{

    @Test(testName = "updateEnterpriseInfo", description = "all_scenario", groups = "dubbo")
    public void updateEnterpriseInfoTest() throws Exception{
        MyUpdateEnterpriseInfoReqDto myUpdateEnterpriseInfoReqDto = DataFactory.getObject(MyUpdateEnterpriseInfoReqDto.class, "wrong_uid");
        UpdateEnterpriseInfoReqDto updateEnterpriseInfoReqDto = DataFactory.transferData(myUpdateEnterpriseInfoReqDto,UpdateEnterpriseInfoReqDto.class);

        OutUserWrite api = (OutUserWrite) context.getBean("outUserApiWriteService");
        Result<Boolean> result = api.updateEnterpriseInfo(updateEnterpriseInfoReqDto);

        System.out.println("==============params=============");
        System.out.println(updateEnterpriseInfoReqDto.toString());
        System.out.println("=============================");
        System.out.println(result.getCode());
        System.out.println("=============================");
        System.out.println(result.getMessage());
        System.out.println("=============================");
        System.out.println(result.getData());
    }

}
