package homePage;

import base.CommonAPI;
import homePageLinks.DirectoriesLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestDirectoriesLinks extends CommonAPI {

    @Test
    public void diretoriesLinks() throws Exception{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DirectoriesLinks directoriesLinks = PageFactory.initElements(driver,DirectoriesLinks.class);
        directoriesLinks.clickOnDirectoriesButton();
    }

}
