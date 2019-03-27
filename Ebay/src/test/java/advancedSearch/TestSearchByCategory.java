package advancedSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import advancedSearchItem.SearchByCategory;

public class TestSearchByCategory extends CommonAPI {

    @Test
    public void SearchItemBySelectCategory() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchByCategory searchByCategory  = PageFactory.initElements(driver, SearchByCategory.class);
        searchByCategory.selectAllCategories();
    }
}