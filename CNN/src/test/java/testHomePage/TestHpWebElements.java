package testHomePage;

import base.CommonAPI;
import homePage.BigTitles;
import homePage.HpWebElements;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class TestHpWebElements extends CommonAPI {
    @Test
    public void testBigTitles(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HpWebElements hpWebElements = new HpWebElements();
        hpWebElements.findWebElements();

    }
}
