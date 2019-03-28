package advancedSearchItem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.convertToString;

public class LocationOptions {
    List<String> locationParameter = new ArrayList<String>();

    @FindBy(how = How.XPATH, using = "//a[@id='gh-as-a']")
    public static WebElement advancedSearchButton;

    @FindBy(how = How.XPATH, using = "//div[@id='Center']//tr//td")
    List<WebElement> selectLocationOptions;

    public static WebElement getAdvancedSearchButton() {
        return advancedSearchButton;
    }
    public List<WebElement> getselectLocationOptions() {
        return selectLocationOptions;
    }

    public void selectAdvancedSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAdvancedSearchButton().click();
    }

    public void clickAllLocationsOptions() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        selectAdvancedSearchButton();
        for (WebElement element : getselectLocationOptions()) {
            String text = element.getText();
            element.click();
            Thread.sleep(2000);

            locationParameter.add(text);
            System.out.println(text);
        }
    }
}
