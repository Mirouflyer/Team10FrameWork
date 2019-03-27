package homePage;

import base.CommonAPI;
import homePageLinks.BrowseLinkedInLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import sun.jvm.hotspot.debugger.Page;

public class TestBrowseLinkedInLinks extends CommonAPI {

    @Test
    public void browseLinkedInLinks() throws Exception{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BrowseLinkedInLinks browseLinkedInLinks = PageFactory.initElements(driver,BrowseLinkedInLinks.class);
        browseLinkedInLinks.clickOnBrowseLinkedInButton();
    }
}
