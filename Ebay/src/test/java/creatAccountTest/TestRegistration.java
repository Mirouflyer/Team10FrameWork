package creatAccountTest;

import base.CommonAPI;
import creatAccount.SignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestRegistration extends CommonAPI {
    @Test
    public void testSignUp() throws InterruptedException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SignUp signUp = PageFactory.initElements(driver, SignUp.class);
        signUp.creatAnAccount();
    }
}
