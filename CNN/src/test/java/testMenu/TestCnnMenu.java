package testMenu;

import base.CommonAPI;
import menu.CnnMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestCnnMenu extends CommonAPI {
    @Test
    public void clickOnCnnMenu(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CnnMenu cnnMenu= PageFactory.initElements(driver, CnnMenu.class);
        cnnMenu.useRunMethods();
    }
}
