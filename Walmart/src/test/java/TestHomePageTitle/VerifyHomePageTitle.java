package TestHomePageTitle;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class VerifyHomePageTitle extends CommonAPI {

    @Test
    public void titleTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String title = driver.getTitle();
        Assert.assertEquals(title,"Walmart.com | Save Money. Live Better.");
    }
}
