package testSignIn;

import base.CommonAPI;
import org.testng.annotations.Test;
import signIn.LogIn;
import org.openqa.selenium.support.PageFactory;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestLogIn extends CommonAPI {
    @Test
    public void signInToCapitalOne(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LogIn logIn = PageFactory.initElements(driver, LogIn.class);
        logIn.useSignInMethods("sdgsdgsg","dfgsgsgr");
    }
}
