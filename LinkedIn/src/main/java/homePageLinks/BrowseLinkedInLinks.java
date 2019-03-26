package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BrowseLinkedInLinks extends CommonAPI {

    @FindBy(xpath= "//div[@class='links links-browse ghp-footer__section']//a[@class='ghp-footer__link'][contains(text(),'Learning')]")
    public static WebElement learningButtonWebElement;

    public static WebElement getLearningButtonWebElement() {
        return learningButtonWebElement;
    }

    public void clickOnLearningButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLearningButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnBrowseLinkedInButton() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnLearningButton();
    }
}
