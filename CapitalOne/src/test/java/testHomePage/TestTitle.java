package testHomePage;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestTitle extends CommonAPI {
    @Test
    public void title(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String title = driver.getTitle();
        Assert.assertEquals(title,"Capital One Credit Cards, Bank, and Loans - Personal and Business");
    }
}
