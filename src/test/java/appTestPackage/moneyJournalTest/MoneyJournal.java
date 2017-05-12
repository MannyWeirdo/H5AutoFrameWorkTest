
package appTestPackage.moneyJournalTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import abstractTestCase.AbstractTestCases;
import basicTool.appLoginTool;
import page.app.discover.DiscoverPage;
import page.app.navigation.NavigationPage;

public class MoneyJournal extends AbstractTestCases {

    @Test(testName = "MoneyJournal1", description = "进投资有道", groups = "phone")
    public void IntoBankCentralBankCredit() throws Exception {
        NavigationPage navigationPage = appLoginTool.appDefaultAccountLogin();
        DiscoverPage discoverPage = navigationPage.navigationToDiscover();
        discoverPage.clickMoneyJournalButton();
        WebReporter.log(appiumDirver, true, true, true);
    }

}
