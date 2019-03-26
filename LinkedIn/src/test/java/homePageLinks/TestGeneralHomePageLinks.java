package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestGeneralHomePageLinks extends CommonAPI {

    @Test
    public void generalHomePageLinks() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GeneralLinks generalHomePageLinks = PageFactory.initElements(driver, GeneralLinks.class);
        generalHomePageLinks.clickGeneralButton();
    }

}