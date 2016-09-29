package appTestPackage.tradeCaptial;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import basicTool.appLoginTool;
import page.app.navigation.NavigationPage;
import page.app.wallet.TradeCaptialPage;
import page.app.wallet.WalletPage;
import testCases.AbstractTestCases;

public class tradeCaptialSimpleTest extends AbstractTestCases {

    @Test(testName = "tradeCaptial1", description = "进入余额生息页面", groups = "phone")
    public void IntoTradeCaptialPage() throws Exception {
        NavigationPage navigationPage = appLoginTool.appSimpleAccountLogin();
        WalletPage walletPage = navigationPage.navigationToWallet();
        TradeCaptialPage tradeCaptialPage = walletPage.NavigationToTradeCaptialPage();
        WebReporter.log(appiumDirver, true, true, true);
    }

}
