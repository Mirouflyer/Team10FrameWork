package homePage;

import base.CommonAPI;
import homePageLinks.LinkedInC2109Links;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestLinkedInC2109Links extends CommonAPI {

    @Test
    public void linkedInC2019Links() throws Exception{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LinkedInC2109Links linkedInC2109Links = PageFactory.initElements(driver,LinkedInC2109Links.class);
        linkedInC2109Links.clickOnLinkedInC2019Button();
    }
}
