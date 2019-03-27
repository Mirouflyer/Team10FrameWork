package searchItems;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearchItemsFromExcel extends CommonAPI {

    @Test
    public void searchItems() throws Exception, IOException, ClassNotFoundException{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.searchItemsAndSubmitButtonFromExcelFile();

    }
}
