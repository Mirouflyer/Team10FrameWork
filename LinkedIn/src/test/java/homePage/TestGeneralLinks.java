package homePage;

import base.CommonAPI;
import homePageLinks.GeneralLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestGeneralLinks extends CommonAPI {

    @Test
    public void generalHomePageLinks() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GeneralLinks generalHomePageLinks = PageFactory.initElements(driver, GeneralLinks.class);
        generalHomePageLinks.clickGeneralButton();
    }

}