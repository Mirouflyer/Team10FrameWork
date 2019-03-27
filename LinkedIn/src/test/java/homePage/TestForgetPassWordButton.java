package homePage;

import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestForgetPassWordButton extends CommonAPI {

    @Test
    public void forgetPassWordButton(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnXpath("//a[@class='link-forgot-password']");
    }
}
