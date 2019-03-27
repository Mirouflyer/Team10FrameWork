package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ProductLinks extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Credit Cards')]")
    public static WebElement creditCard;
    @FindBy(xpath = "//a[contains(text(),'Checking & Savings')]")
    public static WebElement checkingAndSaving;
    @FindBy(xpath = "//a[contains(text(),'Auto Loans')]")
    public static WebElement autoLoans;
    @FindBy(xpath = "//a[contains(text(),'Business')]")
    public static WebElement business;
    @FindBy(xpath = "//a[contains(text(),'Commercial')]")
    public static WebElement commercial;

    public static WebElement getCreditCard() {
        return creditCard;
    }

    public static WebElement getCheckingAndSaving() {
        return checkingAndSaving;
    }

    public static WebElement getAutoLoans() {
        return autoLoans;
    }

    public static WebElement getBusiness() {
        return business;
    }

    public static WebElement getCommercial() {
        return commercial;
    }

    // run methods
    public void clickOnCreditCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCard().click();
        driver.navigate().back();
    }
    public void clickOnCheckingAndSaving() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCheckingAndSaving().click();
        driver.navigate().back();
    }
    public void clickOnAutoLoans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAutoLoans().click();
        driver.navigate().back();
    }
    public void clickOnBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBusiness().click();
        driver.navigate().back();
    }
    public void clickOnCommercial(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCommercial().click();
        driver.navigate().back();
    }
    public void useClickOnProducts (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCreditCard();
        clickOnCheckingAndSaving();
        clickOnAutoLoans();
        clickOnBusiness();
        clickOnCommercial();
    }

}
