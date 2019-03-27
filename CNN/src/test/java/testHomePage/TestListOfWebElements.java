package testHomePage;

import base.CommonAPI;
import homePage.ListOfWebElements;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestListOfWebElements extends CommonAPI {
    @Test
    public void testBigTitles() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        ListOfWebElements listOfWebElements=new ListOfWebElements();
        listOfWebElements.getWebElements();
    }
}
