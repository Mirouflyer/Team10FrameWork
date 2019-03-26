package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ClickOnwebElement  {

    //findLocators methods
        @FindBy(how = How.ID, using = "navtest-b-l1-search")
        public static WebElement SearchButton;

        @FindBy(how = How.ID, using = "navtest-b-l1-support")
        public static WebElement SupportButton;

        @FindBy(how = How.ID, using = "navtest-b-l1-support")
        public static WebElement locationButton;

        @FindBy(how=How.ID, using = "navtest-b-l1-signin")
        public  static WebElement signInButton;

        @FindBy(how = How.ID, using = "no-acct-uid")
        public static WebElement userName;

        @FindBy(how = How.ID, using = "no-acct-pw")
        public static WebElement passWord;

        @FindBy(how = How.ID, using = "site-footer__link")
        public static WebElement creditCard;

        @FindBy(how = How.XPATH, using = "site-footer__link")
        public static WebElement creditWise;

        @FindBy(how = How.XPATH, using = "@FindBy(how = How.XPATH, using = \"site-footer__link\")\n" +
               "        public static WebElement creditWise;")
        public static WebElement moneyMarket;

        @FindBy(how = How.XPATH, using = "//*[@lazy-load-src='/assets/compass/contentful/1h6lncjoeq27/4Jkliv52xGKauGO8MCUgSg/4a23bd34881321f66bc968a9b9d25486/tablet-icon.png']")
         public static WebElement preQualified;

        @FindBy(how = How.XPATH, using = "//*[@lazy-load-src='/assets/compass/contentful/1h6lncjoeq27/5GH9ONeOn6S8O044Yw4sa2/d9f393ab2cbf0fb6bb7a38cb0762ffe0/icon-card-venture-new.png']")
        public static WebElement backRewards;

        @FindBy(how = How.XPATH, using = "//*[@lazy-load-src='/assets/compass/contentful/1h6lncjoeq27/68Lol33mh2mMS06I0kwIg6/5771d2837f54597d26a86e59b121ab58/icon-card-credit-tracker.png']")
        public static WebElement creditScore;




    //******************************************************************//
    //getLocators methods
    public WebElement getSearchButton() {
        return SearchButton;
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
    public WebElement getCreditCard(){
        return creditCard;
    }
    public WebElement getCreditWise() {
        return creditWise;
    }
    public WebElement getMoneyMarket() {
        return moneyMarket;
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

    //****************************************************************//
    //run methods
    public void clickOnSearchButton(){
        getSearchButton().click();
    }
    public void clockOnSupportButton(){
        getSupportButton().click();
    }
    public void clickOnLocationButton(){
        getLocationButton().click();
    }
    public void clickOnSignInButton(){
        getSignInButton().click();
    }
    public void clickOnUserName(){
        getUserName().click();
    }
    public void clickOnPassWord(){
        getPassWord().click();
    }
    public void clickOnCreditCard(){
        getCreditCard().click();
    }
    public void clickCreditWise(){
        getCreditWise().click();
    }

    public void clickOnMoneyMarket(){
        getMoneyMarket().click();
    }
    public void clickOnPreQualified(){
        getPreQualified().click();
    }
    public void clickOnBackRewards(){
        getBackRewards().click();
    }
    public void clickOnCreditScore(){
        getCreditScore().click();
    }



}