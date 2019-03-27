package testHomePage;

import base.CommonAPI;
import homePage.ProductLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;
import static base.CommonAPI.driver;

public class TestProductLinks extends CommonAPI {
    @Test
    public void clickOnProductLinks(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ProductLinks productLinks = PageFactory.initElements(driver,ProductLinks.class);
        productLinks.useClickOnProducts();
    }
}
