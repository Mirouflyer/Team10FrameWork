package advancedSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import advancedSearchItem.SearchItemByPrice;

public class TestSearchItemByPrice extends CommonAPI {

    @Test
    public void FindItemUsingPriceOption() throws InterruptedException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchItemByPrice searchItemByPrice = PageFactory.initElements(driver, SearchItemByPrice.class);
        searchItemByPrice.findItemByPrice();
    }
}
