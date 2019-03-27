package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BusinessSolutionsLinks extends CommonAPI {

    @FindBy(xpath= "//a[contains(text(),'Talent')]")
    public static WebElement talentButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Marketing')]")
    public static WebElement marketingButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Sales')]")
    public static WebElement salesButtonWebElement;

    @FindBy(xpath= "//div[@class='links links-business ghp-footer__section']//a[@class='ghp-footer__link'][contains(text(),'Learning')]")
    public static WebElement learningButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Company Pages')]")
    public static WebElement companyPagesButtonWebElement;

    public static WebElement getTalentButtonWebElement() {
        return talentButtonWebElement;
    }

    public static WebElement getMarketingButtonWebElement() {
        return marketingButtonWebElement;
    }

    public static WebElement getSalesButtonWebElement() {
        return salesButtonWebElement;
    }

    public static WebElement getLearningButtonWebElement() {
        return learningButtonWebElement;
    }

    public static WebElement getCompanyPagesButtonWebElement() {
        return companyPagesButtonWebElement;
    }

    public void clickOnTalentButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTalentButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnMarketingButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMarketingButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnSalesButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSalesButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnLearningButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLearningButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnCompanyPagesButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCompanyPagesButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickBusinessSolutionsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnTalentButtonWebElement();
        clickOnMarketingButtonWebElement();
        clickOnSalesButtonWebElement();
        clickOnLearningButtonWebElement();
        clickOnCompanyPagesButtonWebElement();
    }

}
