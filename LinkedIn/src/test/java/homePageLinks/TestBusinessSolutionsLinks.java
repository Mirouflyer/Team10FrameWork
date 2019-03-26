package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestBusinessSolutionsLinks extends CommonAPI {

    @Test
    public void BusinessSolutionsLinks() throws Exception{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BusinessSolutionsLinks businessSolutionsLinks = PageFactory.initElements(driver,BusinessSolutionsLinks.class);
        businessSolutionsLinks.clickBusinessSolutionsButton();
    }
}
