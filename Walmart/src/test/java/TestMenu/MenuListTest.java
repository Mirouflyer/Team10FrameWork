package TestMenu;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.MenuPage;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class MenuListTest extends CommonAPI {

    @Test
    public void menuListSearch() throws Exception{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MenuPage menuPage = new MenuPage();
        clickOnCss(".a1qUqR.a26mvd");
        menuPage.readMenuText(driver);
    }
}
