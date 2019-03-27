package testHomePage;

import base.CommonAPI;
import homePage.ClickOnWebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestClickOnWebElement extends CommonAPI {
    @Test
    public void clickOnElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ClickOnWebElement clickOnWebElement = PageFactory.initElements(driver,ClickOnWebElement.class);
        clickOnWebElement.useClickMethods();
    }
}
