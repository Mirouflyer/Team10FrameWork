package testHomePage;

import base.CommonAPI;
import homePage.AboutLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestAboutLinks extends CommonAPI {
    @Test
    public void clickOnAboutLink(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AboutLinks aboutLinks = PageFactory.initElements(driver, AboutLinks.class);
        aboutLinks.useClickOnAboutLinks();
    }
}
