package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SupportLinks extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Credit Card Support')]")
    public static WebElement creditCardSupport;
    @FindBy(xpath = "//a[contains(text(),'Set up Eno')]")
    public static WebElement setUpEno;
    @FindBy(xpath = "//a[contains(text(),'Resources for Military')]")
    public static WebElement resourcesForMilitary;
    @FindBy(xpath = "//a[contains(text(),'Accessibility Assistance')]")
    public static WebElement accessibilityAssistance;
    @FindBy(xpath = "//a[contains(text(),'Tweet @AskCapitalOne')]")
    public static WebElement askCapitalOne;
    @FindBy(xpath = "//a[contains(text(),'Call Us')]")
    public static WebElement callUs;

    //getters
    public static WebElement getCreditCardSupport() {
        return creditCardSupport;
    }

    public static WebElement getSetUpEno() {
        return setUpEno;
    }

    public static WebElement getResourcesForMilitary() {
        return resourcesForMilitary;
    }

    public static WebElement getAccessibilityAssistance() {
        return accessibilityAssistance;
    }

    public static WebElement getAskCapitalOne() {
        return askCapitalOne;
    }

    public static WebElement getCallUs() {
        return callUs;
    }
    // run methods
    public void clickOnCreditCardSupport() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCardSupport().click();
        driver.navigate().back();
    }
    public void clickOnSetUpEno() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSetUpEno().click();
        driver.navigate().back();
    }
    public void clickOnResourcesForMilitary() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getResourcesForMilitary().click();
        driver.navigate().back();
    }
    public void clickOnAccessibilityAssistance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAccessibilityAssistance().click();
        driver.navigate().back();
    }
    public void clickOnAskCapitalOne() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAskCapitalOne().click();
        driver.navigate().back();
    }
    public void clickOnCallU() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCallUs().click();
        driver.navigate().back();
    }
    public void useClickOnSupport () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickOnCreditCardSupport();
        clickOnAccessibilityAssistance();
        clickOnAskCapitalOne();
        clickOnCallU();
        clickOnResourcesForMilitary();
        clickOnSetUpEno();
    }
}
