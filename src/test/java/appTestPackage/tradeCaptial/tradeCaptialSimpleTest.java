package appTestPackage.tradeCaptial;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import abstractTestCase.AbstractTestCases;
import basicTool.appLoginTool;
import page.app.navigation.NavigationPage;
import page.app.wallet.TradeCaptialPage;
import page.app.wallet.WalletPage;

public class tradeCaptialSimpleTest extends AbstractTestCases {

    @Test(testName = "tradeCaptial1", description = "进入余额生息页面", groups = "phone")
    public void IntoTradeCaptialPage() throws Exception {
        NavigationPage navigationPage = appLoginTool.appDefaultAccountLogin();
        WalletPage walletPage = navigationPage.navigationToWallet();
        TradeCaptialPage tradeCaptialPage = walletPage.NavigationToTradeCaptialPage();
        WebReporter.log(appiumDirver, true, true, true);
    }

}
