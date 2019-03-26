package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestBrowseLinkedInLinks extends CommonAPI {

    @Test
    public void browseLinkedInLinks() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BrowseLinkedInLinks browseLinkedInLinks = PageFactory.initElements(driver,BrowseLinkedInLinks.class);
        browseLinkedInLinks.clickOnBrowseLinkedInButton();
    }
}
