package pages;

import datasource.DataBase;
import keyword.StepsTestCases;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static base.CommonAPI.convertToString;

public class SearchPage {

    DataBase dataBase = new DataBase();


    @FindBy(how = How.CSS, using ="#global-search-input" )
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using ="#global-search-submit" )
    public static WebElement submitButtonWebElement;

    public WebElement getSearchInputWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchInputWebElement;
    }

    public WebElement getSubmitButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return submitButtonWebElement;
    }

    public void searchFor(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+value);
        getSearchInputWebElement().sendKeys(value);
    }

    public void submitSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click();
    }

    public void clearInput(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }

    public void searchItemAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = dataBase.getItemListFromDB();
        for(int i = 0; i<list.size(); i++){
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }

    }
    public void itemFoundOnSearch(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+" "+ value);
        Assert.assertEquals(value,value);
    }

    public void searchItemsAndSubmitButtonFromExcelFile()throws Exception, IOException,ClassNotFoundException  {
        StepsTestCases stepsTestCases = new StepsTestCases();
        String [] list = stepsTestCases.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<list.length; i++) {
            searchFor(list[i]);
            submitSearchButton();
            clearInput();
        }
    }

}