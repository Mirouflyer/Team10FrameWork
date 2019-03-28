package advancedSearchItem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.convertToString;

public class ItemFormatsAndCondition {
    List<String> allBuyingFormats = new ArrayList<String>();
    List<String> allConditions = new ArrayList<String>();

    @FindBy(how = How.XPATH, using = "//a[@id='gh-as-a']")
    public static WebElement advancedSearchButton;

    @FindBy(how = How.XPATH, using = "//fieldset[4]//label")
    List<WebElement> selectBuyingFormats;

    @FindBy(how = How.XPATH, using = "//fieldset[5]//label")
    List<WebElement> selectConditions;

    public static WebElement getAdvancedSearchButton() {
        return advancedSearchButton;
    }

    public List<WebElement> getBuyingFormats() {
        return selectBuyingFormats;
    }

    public List<WebElement> getselectConditions() {
        return selectConditions;
    }

    public void selectAdvancedSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAdvancedSearchButton().click();
    }

    public void selectAllBuyingFormats() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        selectAdvancedSearchButton();
        for (WebElement element : getselectConditions()) {
            String text = element.getText();
            element.click();
            Thread.sleep(1500);
            element.click();
            Thread.sleep(1500);
            allBuyingFormats.add(text);
            System.out.println(text);
        }
        System.out.println("total of options is: "+allBuyingFormats.size());
    }

    public void selectAllConditions() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        selectAdvancedSearchButton();
        for (WebElement element : getBuyingFormats()) {
            String text = element.getText();
            element.click();
            Thread.sleep(1500);
            element.click();
            Thread.sleep(1500);
            allConditions.add(text);
            System.out.println(text);
        }
        System.out.println("total of options is: "+allConditions.size());
    }
}
