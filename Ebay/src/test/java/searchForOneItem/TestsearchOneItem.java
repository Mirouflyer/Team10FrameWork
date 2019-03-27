package searchForOneItem;

import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestsearchOneItem extends CommonAPI {

    @Test
    public void searchForAnItem(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnCssAndEnter("#global-search-input","Bicycle");
    }
}
