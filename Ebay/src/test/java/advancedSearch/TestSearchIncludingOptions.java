package advancedSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import advancedSearchItem.SearchIncludingOptions;

public class TestSearchIncludingOptions extends CommonAPI {
    @Test
    public void SearchItemBySelectOptions() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchIncludingOptions searchIncludingOptions = PageFactory.initElements(driver, SearchIncludingOptions.class);
        searchIncludingOptions.clickAllOptions();
    }
}
