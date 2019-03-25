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




}