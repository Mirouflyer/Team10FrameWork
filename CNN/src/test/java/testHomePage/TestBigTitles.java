package testHomePage;

import base.CommonAPI;
import homePage.BigTitles;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestBigTitles extends CommonAPI {
    @Test
    public void testBigTitles(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BigTitles bigTitles = new BigTitles();
        bigTitles.findWebElements();

    }
}
