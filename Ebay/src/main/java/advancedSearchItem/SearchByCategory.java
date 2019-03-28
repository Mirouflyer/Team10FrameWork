package advancedSearchItem;

import datasource.ExelReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.convertToString;

public class SearchByCategory {

    List<String> allCategories = new ArrayList<String>();
    List<String> expetedCategories = new ArrayList<String>();

    @FindBy(how = How.XPATH, using = "//a[@id='gh-as-a']")
    public static WebElement advancedSearchButton;

    @FindBy(how = How.XPATH, using = "//select[@class='block']//option")
    List<WebElement> selectCategory;


    public static WebElement getAdvancedSearchButton() {
        return advancedSearchButton;
    }

    public List<WebElement> getSelectCategory() {
        return selectCategory;
    }

    public void selectAdvancedSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAdvancedSearchButton().click();
    }

    public void getItemsFromExcelFile() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        // ToDo
        //Read data from Excel file using Apache POI
        ExelReader exelReader = new ExelReader();
        String [] list = exelReader.getDataFromExcelFileForFeaturesChoice();
        expetedCategories.add("All Categories");
        for (int i = 1; i < list.length; i++) {
            expetedCategories.add(list[i]);
        }
        System.out.println(expetedCategories.size());
    }

    public void selectAllCategories() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        selectAdvancedSearchButton();
        for (WebElement element : getSelectCategory()) {
            String text = element.getText();
            element.click();
            Thread.sleep(1000);
            allCategories.add(text);
         //   System.out.println(text);
        }
        System.out.println("total of categories: "+allCategories.size());
        getItemsFromExcelFile();
        Assert.assertEquals(expetedCategories, allCategories);
    }
}