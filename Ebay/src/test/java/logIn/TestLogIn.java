package logIn;

import base.CommonAPI;
import logOut.LogOutPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestLogIn extends CommonAPI {

    @Test
    public void getSignInToMyAccount() throws InterruptedException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.signIn(driver); }
}
