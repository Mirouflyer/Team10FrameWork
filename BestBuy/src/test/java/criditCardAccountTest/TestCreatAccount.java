package criditCardAccountTest;

import base.CommonAPI;
import criditCardAccount.CreateAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestCreatAccount extends CommonAPI {
    @Test
    public void testSignUp() throws InterruptedException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//input[@id='gh-search-input']")).sendKeys("Computer", Keys.ENTER);
//        CreateAccount createAccount = PageFactory.initElements(driver, CreateAccount.class);
//        createAccount.creatAnAccount();
    }
}
