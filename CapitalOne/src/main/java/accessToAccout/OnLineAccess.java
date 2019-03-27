package accessToAccout;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static homePage.AboutLinks.getCorporateInformation;

public class OnLineAccess extends CommonAPI {
    @FindBy(xpath = "//a[@class='asset-link setUpAccess']")
    public static WebElement accessOnLine;
    @FindBy(xpath = "//input[@name='lastName']")
    public static WebElement lastName;
    @FindBy(xpath = "//input[@id='fullSSN1']")
    public static WebElement code1;
    @FindBy(xpath = "//input[@id='fullSSN2']")
    public static WebElement code2;
    @FindBy(xpath = "//input[@id='fullSSN3']")
    public static WebElement code3;
    @FindBy(xpath = "//select[@id='form_dob_month']//option[@value='3']")
    public static WebElement march;
    @FindBy(xpath = "//select[@id='form_dob_day']//option[@value='10']")
    public static WebElement marchTenth;
    @FindBy(xpath = "//select[@id='form_dob_year']//option[@value='2018']")
    public static WebElement year;
    @FindBy(xpath = "//button[@id='form_find_me_button']")
    public static WebElement findMe;

    //getters

    public static WebElement getAccessOnLine() {
        return accessOnLine;
    }

    public static WebElement getLastName() { return lastName; }

    public static WebElement getCode1() { return code1; }

    public static WebElement getCode2() { return code2; }

    public static WebElement getCode3() {
        return code3;
    }

    public static WebElement getMarch() {
        return march;
    }

    public static WebElement getMarchTenth() {
        return marchTenth;
    }

    public static WebElement getYear() {
        return year;
    }

    public static WebElement getFindMe() {
        return findMe;
    }
    //runMethods
    public void clickOnLineAccess() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAccessOnLine().click();
    }
    public void lastName(String lstName1) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getLastName().sendKeys(lstName1, Keys.TAB);
    }
    public void socialSecurity1(String code1) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCode1().sendKeys(code1,Keys.TAB);
    }
    public void socialSecurity2(String code2) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCode2().sendKeys(code2,Keys.TAB);
    }
    public void socialSecurity3(String code3) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCode3().sendKeys(code3,Keys.TAB);
    }
    public void clickOnMonth() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMarch().click();
    }
    public void clickOnDay() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMarchTenth().click();
    }
    public void clickOnYear() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getYear().click();
    }
    public void clickOnFindMe() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getFindMe().click();
    }

    //useMethods
    public void useFindMeMethods(String lastName, String codeA, String codeB,String codeC ) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickOnLineAccess();
        lastName(lastName);
        socialSecurity1(codeA);
        socialSecurity2(codeB);
        socialSecurity3(codeC);
        clickOnMonth();
        clickOnDay();
        clickOnYear();
        clickOnFindMe();

    }
}
