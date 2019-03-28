package menu;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.MenuPage;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class MenuTest extends CommonAPI {
    @Test
    public void testMenu() throws Exception {
        MenuPage menuPage = new MenuPage();
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        menuPage.readMenuText(driver);
    }

}
