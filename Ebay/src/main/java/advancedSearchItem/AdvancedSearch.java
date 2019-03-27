package advancedSearchItem;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class AdvancedSearch extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//a[@id='gh-as-a']")
    public static WebElement advancedSearchButton;

    @FindBy(how = How.ID,using = "_nkw")
    public static WebElement searchInputWebElementByKeyword;

    @FindBy(how = How.ID , using = "_ex_kw")
    public static WebElement includeWords;

    @FindBy(how = How.XPATH , using = "//select[@class='block']//option[@value='58058']")
    public static WebElement categoyOption;

    @FindBy(how = How.ID , using = "e1-1")
    public static WebElement submitButtonWebElement;

    public static WebElement getAdvancedSearchButton() {
        return advancedSearchButton;
    }

    public static WebElement getSearchInputWebElementByKeyword() {
        return searchInputWebElementByKeyword;
    }

    public static WebElement getIncludeWords() {
        return includeWords;
    }

    public static WebElement getCategoyOption() {
        return categoyOption;
    }

    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void selectAdvancedSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAdvancedSearchButton().click();
    }

    public void searchForItemUsingKeywors(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElementByKeyword().sendKeys(value);
    }

    public void searchForItemIcncludWords(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getIncludeWords().sendKeys(value);
    }

    public void selectCategoryOption (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCategoyOption().click();
    }
    public void submitSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click();
    }

    public void advancedSearchItemByKeywords(WebDriver driver) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        selectAdvancedSearchButton();
        searchForItemUsingKeywors("Computer");
        searchForItemIcncludWords("Toshiba");
        selectCategoryOption();
        submitSearchButton();
        Thread.sleep(2000);
    }
}