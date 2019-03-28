package criditCardAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class CreateAccount {
    @FindBy(how = How.XPATH, using ="//li[@class='account js-navitem']")   // "//a[@id='hf_accountMenuLink']")
    public static WebElement accountButton;

//    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-secondary btn-lg primary-button']")
//    public static WebElement applyButton;

    @FindBy(how = How.XPATH, using = "//button[@class='am-create-account__button btn btn-tertiary']")
    public static WebElement creatOneButton;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-first]Name'")
    public static WebElement firstName;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-lastName']")
    public static WebElement lastName;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-e']")
    public static WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-p1']")
    public static WebElement password;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-p2']")
    public static WebElement confirmPassword;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-phone']")
    public static WebElement phoneNumber;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    public static WebElement checkBox;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Create an Account')]")
    public static WebElement creatAccountButton;

    public static WebElement getAccountButton() {
        return accountButton;
    }

//    public static WebElement getApplyButton() {
//        return applyButton;
//    }

    public static WebElement getCreatOneButton() {
        return creatOneButton;
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

    public static WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public static WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public static WebElement getCheckBox() {
        return checkBox;
    }

    public static WebElement getCreatAccountButton() {
        return creatAccountButton;
    }



    public void submitAccountButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAccountButton().click();
    }

//    public void submitApplyButton(){
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
//        getApplyButton().click(); //
//    }

    public void submitCreatOneButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCreatOneButton().click(); //CreatOneButton
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

    public void enterConfirmPassword(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getConfirmPassword().sendKeys(value);
    }

    public void enterPhoneNumber(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getPhoneNumber().sendKeys(value);
    }

    public void checkCheckBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCheckBox().click();
    }

    public void submitCreatAccountButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCreatAccountButton().click();
    }

    public void creatAnAccount() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        submitAccountButton();
       // submitApplyButton();
        submitCreatOneButton();
        enterFirstName("billy");
        enterLastName("Emanuel");
        enterEmail("billyemanuel2019@gamil.com");
        enterPassword("root1234256");
        enterConfirmPassword("root1234256");
        enterPhoneNumber("347-879-5522");
        checkCheckBox();
        Thread.sleep(2000);
        submitCreatAccountButton();
    }
}
