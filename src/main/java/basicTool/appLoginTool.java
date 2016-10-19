package basicTool;

import org.DriverFactory.Factory.DriverFactory;

import dataBean.app.login.UserBean;
import dataTool.DataFactory;
import page.app.navigation.NavigationPage;
import page.app.setup.FristSwipePage;
import page.app.setup.LoginPage;

public class appLoginTool {

    /**
     * User any account login is ok
     * 
     * @return
     * @throws Exception
     */
    public static NavigationPage appDefaultAccountLogin() throws Exception {
        UserBean userBean = DataFactory.getObject(UserBean.class, "default");
        FristSwipePage fristSwipePage = new FristSwipePage(DriverFactory.createAppiumDriver());
        LoginPage loginPage = fristSwipePage.finishSwipe();
        return loginPage.login(userBean);
    }

    /**
     * 
     * Need use special account to login
     * 
     * @param userBean
     *            you want to login user
     * @return
     * @throws Exception
     */
    public static NavigationPage appSpecialAccountLogin(UserBean userBean) throws Exception {
        FristSwipePage fristSwipePage = new FristSwipePage(DriverFactory.createAppiumDriver());
        LoginPage loginPage = fristSwipePage.finishSwipe();
        return loginPage.login(userBean);
    }

}
