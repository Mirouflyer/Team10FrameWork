package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class GeneralLinks extends CommonAPI {

    @FindBy(xpath= "//a[contains(text(),'Sign Up')]")
    public static WebElement signUpButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Help Center')]")
    public static WebElement helpCenterButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'About')]")
    public static WebElement aboutButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Press')]")
    public static WebElement pressButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Blog')]")
    public static WebElement blogButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Careers')]")
    public static WebElement careersButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Developers')]")
    public static WebElement developersButtonWebElement;

    public static WebElement getSignUpButtonWebElement() {
        return signUpButtonWebElement;
    }

    public static WebElement getHelpCenterButtonWebElement() {
        return helpCenterButtonWebElement;
    }

    public static WebElement getAboutButtonWebElement() {
        return aboutButtonWebElement;
    }

    public static WebElement getPressButtonWebElement() {
        return pressButtonWebElement;
    }

    public static WebElement getBlogButtonWebElement() {
        return blogButtonWebElement;
    }

    public static WebElement getCareersButtonWebElement() {
        return careersButtonWebElement;
    }

    public static WebElement getDevelopersButtonWebElement() {
        return developersButtonWebElement;
    }

    public void clickOnSignUpButtonWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignUpButtonWebElement().click();
        driver.navigate().back();


    }
    public void clickOnHelpCenterButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHelpCenterButtonWebElement().click();
        driver.navigate().back();

    }

    public void clickOnAboutButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAboutButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnPressButtonWebElement (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPressButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnBlogButtonWebElement () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBlogButtonWebElement().click();
        driver.navigate().back();

    }

    public void clickOnCareersButtonWebElement (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCareersButtonWebElement().click();
        driver.navigate().back();

    }

    public void clickOnDevelopersButtonWebElement () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getDevelopersButtonWebElement().click();
    }

    public void clickGeneralButton () throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSignUpButtonWebElement();
        clickOnHelpCenterButtonWebElement();
        clickOnAboutButtonWebElement();
        clickOnPressButtonWebElement();
        clickOnBlogButtonWebElement();
        clickOnBlogButtonWebElement();
        clickOnCareersButtonWebElement();
        clickOnDevelopersButtonWebElement();
    }


}
