package advancedSearchItem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class SearchItemByPrice {
    @FindBy(how = How.XPATH, using = "//a[@id='gh-as-a']")
    public static WebElement advancedSearchButton;

    @FindBy(how = How.ID, using = "_mPrRngCbx")
    public static WebElement clickOnPriceBox;

    @FindBy(how = How.XPATH, using = "//input[@title='Enter minimum price range value']")
    public static WebElement priceFromMin;

    @FindBy(how = How.XPATH, using = "//input[@title='Enter maximum price range value']")
    public static WebElement priceToMax;

    public static WebElement getAdvancedSearchButton() {
        return advancedSearchButton;
    }

    public static WebElement getClickOnPriceBox() {
        return clickOnPriceBox;
    }

    public static WebElement getPriceFromMin() {
        return priceFromMin;
    }

    public static WebElement getPriceToMax() {
        return priceToMax;
    }

    public void selectAdvancedSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAdvancedSearchButton().click();
    }

    public void checkOutPriceButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getClickOnPriceBox().click();
    }

    public void enterMinPriceRange(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getPriceFromMin().sendKeys(value);
    }

    public void enterMaxPriceRange(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getPriceToMax().sendKeys(value);

    }
    public void findItemByPrice() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        selectAdvancedSearchButton();
        checkOutPriceButton();
        enterMinPriceRange("200");
        enterMaxPriceRange("800");
        Thread.sleep(2000);
    }
}