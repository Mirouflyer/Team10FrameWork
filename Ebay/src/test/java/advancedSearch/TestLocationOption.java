package advancedSearch;

import advancedSearchItem.LocationOptions;
import advancedSearchItem.ShowResults;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class TestLocationOption extends CommonAPI {
    @Test
    public void TestClickableLocationOption() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        LocationOptions locationOptions  = PageFactory.initElements(driver, LocationOptions.class);
        locationOptions.clickAllLocationsOptions();
    }
}
