package menu;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.MenuPage;

public class MenuTest extends CommonAPI {
    @Test
    public void testMenu() throws Exception {
        MenuPage.readMenuText(driver);
    }

}
