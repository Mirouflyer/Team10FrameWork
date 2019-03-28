package logOut;

import base.CommonAPI;
import logIn.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestLogOut extends CommonAPI {

    @Test
    public void getSignOutFromMyAccount() throws InterruptedException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        LogOutPage logOutPage = PageFactory.initElements(driver, LogOutPage.class);
        logOutPage.signOut(driver);
    }
}