package tests;


import base.DashboardPage;
import base.LoginPage;
import base.baseClass;
import org.testng.annotations.Test;

public class LoginTest extends baseClass {

    @Test
    public void loginTest_withCreds(){
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }
}
