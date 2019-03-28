package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import javax.naming.Name;

public class ClickOnWebElement extends CommonAPI {

    //findLocators methods
        @FindBy(how = How.ID, using = "navtest-b-l1-search")
        public static WebElement SearchButton;

        @FindBy( xpath =  "//button[@type='button']")
        public static WebElement CloseSearchButton;

        @FindBy(how = How.ID, using = "navtest-b-l1-support")
        public static WebElement SupportButton;

        @FindBy(how = How.ID, using = "navtest-b-l1-locations")
        public static WebElement locationButton;

        @FindBy(how=How.ID, using = "navtest-b-l1-signin")
        public  static WebElement signInButton;

        @FindBy(how = How.ID, using = "no-acct-uid")
        public static WebElement userName;

        @FindBy(how = How.ID, using = "no-acct-pw")
        public static WebElement passWord;

        @FindBy(how = How.XPATH, using = "site-footer__link")
        public static WebElement creditWise;

        @FindBy(how = How.XPATH, using = "//*[@lazy-load-src='/assets/compass/contentful/1h6lncjoeq27/4Jkliv52xGKauGO8MCUgSg/4a23bd34881321f66bc968a9b9d25486/tablet-icon.png']")
         public static WebElement preQualified;

        @FindBy(how = How.XPATH, using = "//*[@lazy-load-src='/assets/compass/contentful/1h6lncjoeq27/5GH9ONeOn6S8O044Yw4sa2/d9f393ab2cbf0fb6bb7a38cb0762ffe0/icon-card-venture-new.png']")
        public static WebElement backRewards;

        @FindBy(how = How.XPATH, using = "//*[@lazy-load-src='/assets/compass/contentful/1h6lncjoeq27/68Lol33mh2mMS06I0kwIg6/5771d2837f54597d26a86e59b121ab58/icon-card-credit-tracker.png']")
        public static WebElement creditScore;

        @FindBy(how = How.CLASS_NAME, using = "asset-link")
        public static WebElement forgetInfo;

        @FindBy(how = How.ID, using = "rememberMe")
         public static WebElement rememberMe;


    //******************************************************************//
    //getLocators methods

    public WebElement getSearchButton() {
        return SearchButton;
    }
    public static WebElement getCloseSearchButton() {
        return CloseSearchButton;
    }
    public WebElement getSupportButton() {
        return SupportButton;
    }
    public WebElement getLocationButton(){
        return locationButton;
    }
    public WebElement getSignInButton(){
        return signInButton;
    }
    public WebElement getUserName(){
        return userName;
    }
    public WebElement getPassWord(){
        return passWord;
    }
    public WebElement getPreQualified() {
        return preQualified;
    }
    public WebElement getBackRewards() {
        return backRewards;
    }
    public WebElement getCreditScore() {
        return creditScore;
    }
    public WebElement getForgetInfo() {
        return forgetInfo;
    }
    public WebElement getRememberMe() {
        return rememberMe;
    }

    //****************************************************************//
    //run methods
    public void clickOnSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchButton().click();
        getCloseSearchButton().click();
    }
    public void clickOnSupportButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSupportButton().click();
        driver.navigate().back();
    }
    public void clickOnLocationButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLocationButton().click();
        driver.navigate().back();
    }
    public void clickOnSignInButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignInButton().click();
        driver.navigate().back();
    }
    public void clickOnUserName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getUserName().click();
        driver.navigate().back();
    }
    public void clickOnPassWord() {
        getPassWord().click();
        driver.navigate().back();
    }
    public void clickOnPreQualified(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPreQualified().click();
        driver.navigate().back();
    }
    public void clickOnBackRewards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBackRewards().click();
        driver.navigate().back();
    }
    public void clickOnCreditScore(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditScore().click();
        driver.navigate().back();
    }
    public void clickOnForgetInfo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getForgetInfo().click();
        driver.navigate().back();
    }
    public void clickOnRememberMe(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getRememberMe().click();
        driver.navigate().back();
    }

    public void useClickMethods(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSearchButton();
        clickOnSupportButton();
        clickOnLocationButton();
        clickOnSignInButton();
        clickOnUserName();
        clickOnPassWord();
        clickOnPreQualified();
        clickOnBackRewards();
        clickOnCreditScore();
        clickOnForgetInfo();
        clickOnRememberMe();

    }
}