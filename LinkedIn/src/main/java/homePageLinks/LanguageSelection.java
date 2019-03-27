package homePageLinks;

import base.CommonAPI;
import keyword.ExcelReader1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class LanguageSelection extends CommonAPI {

    @FindBy(xpath = "//label[@class='lang-selector-state-label']")
    public WebElement languageButton;

    @FindBy(xpath="//ul[@class='lang-selector']//li")
    public List<WebElement> languageSelection;

    public WebElement getLanguageButton() {
        return languageButton;
    }

    public List<WebElement> getLanguageSelection() {
        return languageSelection;
    }

    public void clickOnLanguageButton(){
        getLanguageButton().click();
    }

    public void displayLanguageOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnLanguageButton();
        List<WebElement> list = getLanguageSelection();
        for(WebElement element: list){
            System.out.println(element.getText());
        }
    }

    public void languageSelectionFromExcelFile()throws Exception, IOException,ClassNotFoundException  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ExcelReader1 excelReader1 = new ExcelReader1();
        String [] list = excelReader1.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<list.length; i++) {
            System.out.println(list[i]);
        }
    }
    ;
}
