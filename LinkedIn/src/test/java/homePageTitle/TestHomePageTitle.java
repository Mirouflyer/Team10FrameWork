package homePageTitle;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestHomePageTitle extends CommonAPI {

    @Test
    public void homePageTitle(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String title = driver.getTitle();
        Assert.assertEquals(title,"LinkedIn: Log In or Sign Up");
    }
}
