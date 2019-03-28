package testAccessToAccount;

import accessToAccout.OnLineAccess;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import signIn.LogIn;

public class TestOnLineAccess extends CommonAPI {

    @Test
    public void testAccess(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        OnLineAccess onLineAccess = PageFactory.initElements(driver, OnLineAccess.class);
        onLineAccess.useFindMeMethods("aaaa","111","11","1111");
    }
}
