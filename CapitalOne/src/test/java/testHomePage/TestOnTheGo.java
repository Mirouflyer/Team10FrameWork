package testHomePage;

import base.CommonAPI;
import homePage.OnTheGo;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class TestOnTheGo extends CommonAPI {
    @Test
    public void clickOnTheGo(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        OnTheGo onTheGo = PageFactory.initElements(driver, OnTheGo.class);
        onTheGo.useClickOnTheGo();
    }
}
