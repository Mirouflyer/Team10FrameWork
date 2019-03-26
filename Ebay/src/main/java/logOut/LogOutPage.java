package logOut;

//import logIn.LogInToAccount;
import base.CommonAPI;
import logIn.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class LogOutPage extends CommonAPI {

    @FindBy(how = How.ID, using = "gh-ug") // SignInButton
    public static WebElement signButton;

    @FindBy(how = How.ID, using = "userid")
    public static WebElement enterUserNameOrEmail;

    @FindBy(how = How.ID, using = "pass")
    public static WebElement enterPassWord;

    @FindBy(how = How.ID, using = "sgnBt")
    public static WebElement submitButtonWebElement;

    LogInPage logInPage = new LogInPage();
    @FindBy(how = How.XPATH, using = "1")
    public static WebElement accoutNameButton; // gh-uo signout

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign out')]")
    public static WebElement signOutButton;


    public WebElement getClickOnSIgnButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return signButton;
    }

    public void  submitSignButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getClickOnSIgnButton().click(); // click on the Sign Button
    }

    public WebElement getEnterUserName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return enterUserNameOrEmail;
    }

    public void  submitUserName(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEnterUserName().sendKeys(value); // enter user name or email
    }
    public WebElement getEnterPassWord(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return enterPassWord;
    }
    public void  submitPassWord(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEnterPassWord().sendKeys(value); // enter password
    }
    public WebElement getSubmitButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return submitButtonWebElement;
    }

    public void  submitSignButtonWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click(); // Submit the Signing
    }

    public WebElement getClickOnAccountNameButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return accoutNameButton;
    }
    public void  submitAccoutNameButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getClickOnAccountNameButton().click(); // click on Account Name Button
    }

    public WebElement getClickOnSIgnOutButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return accoutNameButton;
    }

    public void  submitSignOutButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getClickOnSIgnOutButton().click(); // click on  Sign Out Button
    }

    public void signOut(WebDriver driver) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        submitSignButton();
        submitUserName("hargasyoucef@gmail.com");
        submitPassWord("17031991you");
        Thread.sleep(2000);
        submitSignButtonWebElement();
        Thread.sleep(2000);
        getClickOnAccountNameButton();
        getClickOnSIgnOutButton();
        Thread.sleep(1500);
    }
}