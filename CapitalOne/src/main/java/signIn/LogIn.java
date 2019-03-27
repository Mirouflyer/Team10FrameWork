package signIn;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LogIn extends CommonAPI {
    @FindBy(xpath = "//input[@id='no-acct-uid']")
    public static WebElement id;
    @FindBy(xpath = "//input[@id='no-acct-pw']")
    public static WebElement passeWord;
    @FindBy(xpath = "//button[@id='no-acct-submit']")
    public static WebElement signIn;

    //getters
    public static WebElement getId() {
        return id;
    }

    public static WebElement getPasseWord() {
        return passeWord;
    }

    public static WebElement getSignIn() {
        return signIn;
    }

    //runMethods
    public void userName(String username) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getId().sendKeys(username,Keys.ENTER);

    }
    public void passeWord(String passWord) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPasseWord().sendKeys(passWord);

    }
    public void signIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignIn().click();

    }
    public void useSignInMethods(String userName, String passWord) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        userName(userName);
        passeWord(passWord);
        signIn();
    }
}
