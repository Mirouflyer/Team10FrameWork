package advancedSearchItem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.convertToString;

public class SearchIncludingOptions {

    List<String> searchIncludingBox = new ArrayList<String>();

    @FindBy(how = How.XPATH, using = "//a[@id='gh-as-a']")
    public static WebElement advancedSearchButton;

    @FindBy(how = How.XPATH, using = "//fieldset[2]//label")
    List<WebElement> selectOption;

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

    public void clickAllOptions() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        selectAdvancedSearchButton();
        for (WebElement element : getSelectOption()) {
            String text = element.getText();
            element.click();
            Thread.sleep(1500);
            element.click();
            Thread.sleep(1500);
            searchIncludingBox.add(text);
            System.out.println(text);
        }
    }
}
