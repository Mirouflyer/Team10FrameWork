package advancedSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import searchItem.ItemFormatsAndCondition;

public class TestBuyingFormatsAndCondition extends CommonAPI {


    @Test
    public void buyingFormatsTest() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        ItemFormatsAndCondition itemFormatsAndCondition = PageFactory.initElements(driver, ItemFormatsAndCondition.class);
        itemFormatsAndCondition.selectAllBuyingFormats();
    }
    @Test
    public void conditionsTest() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        ItemFormatsAndCondition itemFormatsAndCondition = PageFactory.initElements(driver, ItemFormatsAndCondition.class);
        itemFormatsAndCondition.selectAllConditions();
    }
}