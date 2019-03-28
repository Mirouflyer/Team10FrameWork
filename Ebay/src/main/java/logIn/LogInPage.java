package logIn;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class LogInPage extends CommonAPI   {

    @FindBy(how = How.ID, using = "gh-ug") // SignInButton
    public static WebElement signButton;

    @FindBy(how = How.ID, using = "userid")
    public static WebElement enterUserNameOrEmail;

    @FindBy(how = How.ID, using = "pass")
    public static WebElement enterPassWord;

    @FindBy(how = How.ID, using = "sgnBt")
    public static WebElement submitButtonWebElement;

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

    public void signIn(WebDriver driver) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        submitSignButton();
        submitUserName("hargasyoucef@gmail.com");
        submitPassWord("17031991you");
        Thread.sleep(2000);
        submitSignButtonWebElement();
        Thread.sleep(2000);
    }
}