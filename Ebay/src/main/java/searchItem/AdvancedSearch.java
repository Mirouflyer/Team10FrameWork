package searchItem;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;


public class AdvancedSearch extends CommonAPI {
 //  String practicePageUrl = "https://www.ebay.com/sch/ebayadvsearch";
//    @FindBy(xpath = "//fieldset[2]//label")
//     List<WebElement> searchIncludingBox1;
    @FindBy(how = How.XPATH, using = "//a[@id='gh-as-a']")
    public static WebElement advancedSearchButton;

    @FindBy(how = How.ID,using = "_nkw")
    public static WebElement searchInputWebElementByKeyword;

    @FindBy(how = How.ID , using = "_ex_kw")
    public static WebElement includeWords;

    @FindBy(how = How.XPATH , using = "//select[@class='block']//option[@value='58058']")
    public static WebElement categoyOption;

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

    public void advancedSearchItemByKeywords(WebDriver driver) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        selectAdvancedSearchButton();
        searchForItemUsingKeywors("Computer");
        searchForItemIcncludWords("Toshiba");
        selectCategoryOption();
        Thread.sleep(2000);
    }



//
//    //**************************************
//
//    public void findItems() throws InterruptedException {
//       findElementByxPath("//a[@id='gh-as-a']");
//       Thread.sleep(1500);
//       findElementById("_nkw", "Laptop");
//       findElementById("_ex_kw", "hp");
//       findElemetByID("e1-1");
//       findElementByxPath("//button[@type='submit']");
//       Thread.sleep(2000);
//   }
//    public  void  AdvancedSearchingItems() throws Exception {
//
//        findElementByxPath("//a[@id='gh-as-a']");
//        List<WebElement> searchIncludingBox1 = driver.findElements(By.xpath("//fieldset[2]//label"));
//        List<String> searchIncludingBox = new ArrayList<String>();
//        Thread.sleep(2000);
//        findElementById("_nkw", "Laptop");
//        findElementById("_ex_kw", "hp");
//        for (WebElement element : searchIncludingBox1) {
//            String text2 = element.getText();
//            element.click();
//            Thread.sleep(1500);
//            element.click();
//            Thread.sleep(1500);
//            searchIncludingBox.add(text2);
//            System.out.println(text2);
//        }
//    }
//    public void searchItemByPrice() throws InterruptedException {
//        findElementByxPath("//a[@title='Advanced Search']");
//        Thread.sleep(1500);
//        findElementById("_nkw", "Laptop");
//        findElementById("_ex_kw", "hp");
//
//        findElemetByID("_mPrRngCbx");
//        findElementByxPath("//input[@title='Enter minimum price range value']","200");
//        findElementByxPath("//input[@title='Enter maximum price range value']", "900");
//        Thread.sleep(2000);
//    }

}



