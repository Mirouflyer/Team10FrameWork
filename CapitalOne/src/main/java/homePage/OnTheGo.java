package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class OnTheGo extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Locations & ATMs')]")
    public static WebElement locationsATMs;
    @FindBy(xpath = "//div[@id='footer-on the go-section']//li[2]")
    public static WebElement app;
    @FindBy(xpath = "//div[@id='footer-on the go-section']//li[3]")
    public static WebElement eno;
    @FindBy(xpath = "//div[@id='footer-on the go-section']//li[4]")
    public static WebElement alexa;

    //getters
    public static WebElement getLocationsATMs() {
        return locationsATMs;
    }
    public static WebElement getApp() {
        return app;
    }
    public static WebElement getEno() {
        return eno;
    }
    public static WebElement getAlexa() {
        return alexa;
    }

    //runMethods
    public void clickOnCorporateInformation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLocationsATMs().click();
        driver.navigate().back();
    }
    public void clickOnCareersJobs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      getApp().click();
        driver.navigate().back();
    }
    public void clickOnDiversityInclusion(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getEno().click();
        driver.navigate().back();
    }
    public void clickOnSustainability() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAlexa().click();
        driver.navigate().back();
    }
    public void useClickOnTheGo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickOnCorporateInformation();
        clickOnCareersJobs();
        clickOnSustainability();
        clickOnDiversityInclusion();
    }


}
