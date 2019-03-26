package logIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogInToAccount {
    public static void getLogIn(WebDriver driver1) throws InterruptedException {
        LogInPage logInPage = PageFactory.initElements(driver1, LogInPage.class);
        logInPage.signIn(driver1);
    }
}
