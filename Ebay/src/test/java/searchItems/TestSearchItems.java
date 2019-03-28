package searchItems;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;
import reporting.ApplicationLog;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class TestSearchItems extends CommonAPI {
    @Test
    public void testSignUp() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }

}
