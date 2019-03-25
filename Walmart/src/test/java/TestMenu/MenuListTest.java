package TestMenu;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.MenuPage;
import reporting.TestLogger;

public class MenuListTest extends CommonAPI {

    @Test
    public void menuList() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCss(".a1qUqR.a26mvd");
        MenuPage.readMenuText(driver);
    }
}
