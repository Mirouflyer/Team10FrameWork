package creatAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class SignUp {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'register')]")
    public static WebElement registerButton;

    @FindBy(how = How.XPATH, using = "//input[@name='firstname']")
    public static WebElement firstName;

    @FindBy(how = How.XPATH, using = "//input[@id='lastname']")
    public static WebElement lastName;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public static WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@id='PASSWORD']")
    public static WebElement password;

    @FindBy(how = How.XPATH, using = "//button[@id='ppaFormSbtBtn']")
    public static WebElement creatAccountButton;

    public static WebElement getRegisterButton() {
        return registerButton;
    }

    public static WebElement getFirstName() {
        return firstName;
    }

    public static WebElement getLastName() {
        return lastName;
    }

    public static WebElement getEmail() {
        return email;
    }

    public static WebElement getPassword() {
        return password;
    }

    public static WebElement getCreatAccountButton() {
        return creatAccountButton;
    }

    public void submitRegisterButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getRegisterButton().click();
    }

    public void enterFirstName(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getFirstName().sendKeys(value);
    }
    public void enterLastName(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getLastName().sendKeys(value);
    }

    public void enterEmail(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEmail().sendKeys(value);
    }

    public void enterPassword(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getPassword().sendKeys(value);
    }

    public void submitCreatAccountButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCreatAccountButton().click();
    }

    public void creatAnAccount() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        submitRegisterButton();
        enterFirstName("billy");
        enterLastName("Emanuel");
        enterEmail("billyemanuel2019@gamil.com");
        enterPassword("2255kiukL");
        Thread.sleep(2000);
        submitCreatAccountButton();
    }
}