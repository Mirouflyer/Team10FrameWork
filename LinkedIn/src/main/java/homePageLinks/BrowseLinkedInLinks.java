package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BrowseLinkedInLinks extends CommonAPI {

    @FindBy(xpath= "//div[@class='links links-browse ghp-footer__section']//a[@class='ghp-footer__link'][contains(text(),'Learning')]")
    public static WebElement learningButtonWebElement;

    @FindBy(xpath = "//a[contains(text(),'Jobs')]")
    public static WebElement jobsButtonWebElement;

    @FindBy(xpath = "//a[contains(text(),'Salary')]")
    public static WebElement salaryButtonWebElement;

    @FindBy(xpath = "//a[contains(text(),'Mobile')]")
    public static WebElement mobileButtonWebElement;

    @FindBy(xpath = "//a[contains(text(),'ProFinder')]")
    public static WebElement proFinderButtonWebElement;

    public static WebElement getLearningButtonWebElement() {
        return learningButtonWebElement;
    }

    public static WebElement getJobsButtonWebElement() {
        return jobsButtonWebElement;
    }

    public static WebElement getSalaryButtonWebElement() {
        return salaryButtonWebElement;
    }

    public static WebElement getMobileButtonWebElement() {
        return mobileButtonWebElement;
    }

    public static WebElement getProFinderButtonWebElement() {
        return proFinderButtonWebElement;
    }

    public void clickOnLearningButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLearningButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnJobsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getJobsButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnSalaryButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSalaryButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnMobileButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
       getMobileButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnProFinderButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
       getProFinderButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnBrowseLinkedInButton() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnLearningButton();
        clickOnJobsButton();
        clickOnSalaryButton();
        clickOnMobileButton();
        clickOnProFinderButton();
    }
}
