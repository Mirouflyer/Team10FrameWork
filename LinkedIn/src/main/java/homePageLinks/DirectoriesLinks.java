package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class DirectoriesLinks extends CommonAPI {

    @FindBy(xpath= "//a[contains(text(),'Members')]")
    public static WebElement membersButtonWebElement;

    @FindBy(xpath= "//div[@class='links links-directories ghp-footer__section']//li[2]//a[1]")
    public static WebElement jobsButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Companies')]")
    public static WebElement companiesButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Salaries')]")
    public static WebElement salariesButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Universities')]")
    public static WebElement universitiesButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Top Jobs')]")
    public static WebElement topJobsButtonWebElement;

    public static WebElement getMembersButtonWebElement() {
        return membersButtonWebElement;
    }

    public static WebElement getJobsButtonWebElement() {
        return jobsButtonWebElement;
    }

    public static WebElement getCompaniesButtonWebElement() {
        return companiesButtonWebElement;
    }

    public static WebElement getSalariesButtonWebElement() {
        return salariesButtonWebElement;
    }

    public static WebElement getUniversitiesButtonWebElement() {
        return universitiesButtonWebElement;
    }

    public static WebElement getTopJobsButtonWebElement() {
        return topJobsButtonWebElement;
    }

    public void clickOnMembersButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMembersButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnJobsButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getJobsButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnCompaniesButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCompaniesButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnSalariesButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSalariesButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnUniversitiesButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getUniversitiesButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnTopJobsButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTopJobsButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnDirectoriesButton() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnMembersButtonWebElement();
        clickOnJobsButtonWebElement();
        clickOnCompaniesButtonWebElement();
        clickOnSalariesButtonWebElement();
        clickOnUniversitiesButtonWebElement();
        clickOnTopJobsButtonWebElement();
    }
}
