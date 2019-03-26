package testHomePage;

import base.CommonAPI;
import homePage.ProductLinks;
import homePage.SupportLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestSupportLinks extends CommonAPI {
    @Test
    public void clickOnSupportLinks(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SupportLinks supportLinks = PageFactory.initElements(driver, SupportLinks.class);
        supportLinks.useClickOnSupport();
    }
}
