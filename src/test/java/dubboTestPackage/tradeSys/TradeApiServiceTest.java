package dubboTestPackage.tradeSys;

import org.testng.annotations.Test;

import abstractTestCase.AbstractTestCases;
import dataBean.dubbo.tradeSys.MyRechargeReqDto;
import dataTool.InitYamlFileUtil;

/**
 * Created by guchenglong on 2017/6/2.
 */
public class TradeApiServiceTest extends AbstractTestCases {

    @Test(testName = "initYaml", description = "init yaml", groups = "dubbo")
    public void initYamlDataFileTest(){
        MyRechargeReqDto myRechargeReqDto = new MyRechargeReqDto();
        myRechargeReqDto.setId("regular");
        myRechargeReqDto.setSeqNo("test");
        myRechargeReqDto.setUid("manny");
        myRechargeReqDto.setChannel("001");
        myRechargeReqDto.setAmount(10.22);
        myRechargeReqDto.setReturnUrl("www.shicaidai.com");
        myRechargeReqDto.setSvrAuthCode("what's this ?");
        myRechargeReqDto.setSmsCode("what's this ?");
        InitYamlFileUtil util = new InitYamlFileUtil();
        util.initYamlFile(myRechargeReqDto);
    }
}
