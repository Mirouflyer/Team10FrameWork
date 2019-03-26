package logIn;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {

    @FindBy(how = How.ID, using = "gh-ug") // SignInButton
    public static WebElement signButton;

    @FindBy(how = How.ID, using = "userid")
    public static WebElement enterUserNameOrEmail;

    @FindBy(how = How.ID, using = "pass")
    public static WebElement enterPassWord;

    @FindBy(how = How.ID, using = "sgnBt")
    public static WebElement submitButtonWebElement;

    public WebElement getClickOnSIgnButton(){
        return signButton;
    }

    public void  submitSignButton(){
        getClickOnSIgnButton().click(); // click on the Sign Button
    }

    public WebElement getEnterUserName(){
        return enterUserNameOrEmail;
    }

    public void  submitUserName(String value){
        getEnterUserName().sendKeys(value); // enter user name or email
    }
    public WebElement getEnterPassWord(){
        return enterPassWord;
    }
    public void  submitPassWord(String value){
        getEnterPassWord().sendKeys(value); // enter password
    }
    public WebElement getSubmitButtonWebElement(){
        return submitButtonWebElement;
    }

    public void  submitSignButtonWebElement() {
        getSubmitButtonWebElement().click(); // Submit the Signing
    }

    public void signIn(WebDriver driver1) throws InterruptedException {
        submitSignButton();
        submitUserName("hargasyoucef@gmail.com");
        submitPassWord("17031991you");
        Thread.sleep(2000);
        submitSignButtonWebElement();
        Thread.sleep(2000);
    }
}