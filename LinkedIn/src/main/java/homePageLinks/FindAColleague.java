package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class FindAColleague extends CommonAPI {

    @FindBy(xpath= "//input[@placeholder='First name']")
    public WebElement firstNameInput;

    @FindBy(xpath= "//input[@name='last']")
    public WebElement lastNameInput;

    @FindBy(xpath= "//input[@value='Search']")
    public WebElement searchButton;

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLasttNameInput() {
        return lastNameInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }



    public void typeFirstName(String firstName){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getFirstNameInput().sendKeys(firstName);
    }

    public void typeLasttName(String lastName){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getLasttNameInput().sendKeys(lastName);
    }

    public void clickOnSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getSearchButton().click();
    }

    public void findAcollegue(String firstName,String lastName){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeFirstName(firstName);
        typeLasttName(lastName);
        clickOnSearchButton();
    }
}
