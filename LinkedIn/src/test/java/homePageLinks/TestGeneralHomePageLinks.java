package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.GeneralHomePageLinks;
import reporting.ApplicationLog;
import reporting.TestLogger;

import static base.CommonAPI.driver;

public class TestGeneralHomePageLinks extends CommonAPI {

    @Test
    public void generalHomePageLinks() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GeneralHomePageLinks generalHomePageLinks = PageFactory.initElements(driver,GeneralHomePageLinks.class);
        generalHomePageLinks.clickGeneralButtonTest();
    }
}
