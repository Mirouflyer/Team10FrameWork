package advancedSearchItem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.convertToString;

public class ShowResults {
    List<String> showResultsElemnts = new ArrayList<String>();

    @FindBy(how = How.XPATH, using = "//a[@id='gh-as-a']")
    public static WebElement advancedSearchButton;

    @FindBy(how = How.XPATH, using = "//fieldset[6]//label")
    List<WebElement> selectOption;




    @FindBy(how = How.XPATH, using = "//select[@name='_ftrt']")
    public static WebElement ListingsControl;

    @FindBy(how = How.XPATH, using = "//option[contains(text(),'3 hours')]")
    public static WebElement duration ;

    @FindBy(how = How.XPATH, using = "//input[@id='_sabdlo']")
    public static WebElement bidsNumberMin;

    @FindBy(how = How.XPATH, using = "//input[@id='_sabdhi']")
    public static WebElement bidsNumberMax;

    @FindBy(how = How.XPATH, using = "//input[@id='_samilow']")
    public static WebElement multiplItemMin;

    @FindBy(how = How.XPATH, using = "//input[@id='_samihi']")
    public static WebElement multiplItemMax;


    public static WebElement getListingsControl() {
        return ListingsControl;
    }

    public static WebElement getDuration() {
        return duration;
    }

    public static WebElement getBidsNumberMin() {
        return bidsNumberMin;
    }

    public static WebElement getBidsNumberMax() {
        return bidsNumberMax;
    }

    public static WebElement getMultiplItemMin() {
        return multiplItemMin;
    }

    public static WebElement getMultiplItemMax() {
        return multiplItemMax;
    }

    public static WebElement getAdvancedSearchButton() {
        return advancedSearchButton;
    }

    public List<WebElement> getSelectOption() {
        return selectOption;
    }


    public void selectAdvancedSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAdvancedSearchButton().click();
    }





    public void selectListingsControl(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getListingsControl().click();
    }

    public void selectDuration(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getDuration().click();
    }

    public void enterBidsNumberMin(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getBidsNumberMin().sendKeys(value);
    }

    public void enterBidsNumberMax(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getBidsNumberMax().sendKeys(value);
    }

    public void entergetMultiplItemMin(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMultiplItemMin().sendKeys(value);
    }

    public void entergetMultiplItemMax(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMultiplItemMax().sendKeys(value);
    }



    public void checkAllResultsCheckBox() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        selectAdvancedSearchButton();
        for (WebElement element : getSelectOption()) {
            String text = element.getText();
            element.click();
            Thread.sleep(1000);
            showResultsElemnts.add(text);
            System.out.println(text);
        }
        System.out.println("total of results is : "+showResultsElemnts.size());

        selectListingsControl();
        selectDuration();
        enterBidsNumberMin("10");
        enterBidsNumberMax("15");
        entergetMultiplItemMin("3");
        entergetMultiplItemMax("6");
        Thread.sleep(2000);
    }
}