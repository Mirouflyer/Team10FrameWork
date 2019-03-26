package advancedSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import searchItem.AdvancedSearch;

//import static base.CommonAPI.convertToString;
//import static base.CommonAPI.driver;

public class AdvancedSearchUsingKeywords extends CommonAPI {
   @Test
    public void findItemByKeyWords() throws InterruptedException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        AdvancedSearch advancedSearch = PageFactory.initElements(driver, AdvancedSearch.class);
        advancedSearch.advancedSearchItemByKeywords(driver);
    }
}


