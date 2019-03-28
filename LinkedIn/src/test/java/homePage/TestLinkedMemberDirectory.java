package homePage;

import base.CommonAPI;
import homePageLinks.LinkedMemberDirectory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;


public class TestLinkedMemberDirectory extends CommonAPI {

    @Test
    public void linkedMemberDirectory() throws Exception{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LinkedMemberDirectory linkedMemberDirectory = PageFactory.initElements(driver,LinkedMemberDirectory.class);
        linkedMemberDirectory.clickOnLinkedMemberDirectoryWebElement();
    }
}
