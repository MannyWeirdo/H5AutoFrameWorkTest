
package appTestPackage.moneyJournalTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import basicTool.appLoginTool;
import page.app.discover.DiscoverPage;
import page.app.navigation.NavigationPage;
import testCases.AbstractTestCases;

public class MoneyJournal extends AbstractTestCases {

    @Test(testName = "MoneyJournal1", description = "进入央行征信", groups = "phone")
    public void IntoBankCentralBankCredit() throws Exception {
        NavigationPage navigationPage = appLoginTool.appDefaultAccountLogin();
        DiscoverPage discoverPage = navigationPage.navigationToDiscover();
        discoverPage.clickMoneyJournalButton();
        WebReporter.log(appiumDirver, true, true, true);
    }

}
