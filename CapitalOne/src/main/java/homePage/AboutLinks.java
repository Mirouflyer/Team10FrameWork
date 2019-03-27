package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static homePage.SupportLinks.getSetUpEno;

public class AboutLinks extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Corporate Information')]")
    public static WebElement corporateInformation;
    @FindBy(xpath = "//a[contains(text(),'Careers & Jobs')]")
    public static WebElement careersJobs;
    @FindBy(xpath = "//a[contains(text(),'Diversity & Inclusion')]")
    public static WebElement diversityInclusion;
    @FindBy(xpath = "//a[contains(text(),'Sustainability')]")
    public static WebElement sustainability;
    @FindBy(xpath = "//a[contains(text(),'Press')]")
    public static WebElement press;
    @FindBy(xpath = "//a[contains(text(),'Investors')]")
    public static WebElement investors;
    @FindBy(xpath = "//a[contains(text(),'Canada')]")
    public static WebElement canada;
    @FindBy(xpath = "//a[contains(text(),'UK')]")
    public static WebElement uk;

    //getters
    public static WebElement getCorporateInformation() {
        return corporateInformation;
    }

    public static WebElement getCareersJobs() {
        return careersJobs;
    }

    public static WebElement getDiversityInclusion() {
        return diversityInclusion;
    }

    public static WebElement getSustainability() {
        return sustainability;
    }

    public static WebElement getPress() { return press; }

    public static WebElement getInvestors() {
        return investors;
    }

    public static WebElement getCanada() {
        return canada;
    }

    public static WebElement getUk() {
        return uk;
    }

    //runMethods
    public void clickOnCorporateInformation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCorporateInformation().click();
        driver.navigate().back();
    }
    public void clickOnCareersJobs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCareersJobs().click();
        driver.navigate().back();
    }
    public void clickOnDiversityInclusion(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getDiversityInclusion().click();
        driver.navigate().back();
    }
    public void clickOnSustainability() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSustainability().click();
        driver.navigate().back();
    }
    public void clickOnPress() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getPress().click();
        driver.navigate().back();
    }
    public void clickOnInvestors(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInvestors().click();
        driver.navigate().back();
    }
    public void clickOnCanada() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCanada().click();
        driver.navigate().back();
    }
    public void clickOnUk() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getUk().click();
        driver.navigate().back();
    }
    public void useClickOnAboutLinks() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickOnCorporateInformation();
        clickOnCareersJobs();
        clickOnDiversityInclusion();
        clickOnSustainability();
        clickOnPress();
        clickOnInvestors();
        clickOnCanada();
        clickOnUk();

    }

}
