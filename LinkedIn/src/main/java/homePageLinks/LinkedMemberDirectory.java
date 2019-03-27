package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;


public class LinkedMemberDirectory extends CommonAPI {

    @FindBy(xpath="//div[@class='directory']//li")
    public List<WebElement> linkedMemberDirectoryButtons;

    public List<WebElement> getLinkedMemberDirectoryButtons() {
        return linkedMemberDirectoryButtons;
    }

    public void clickOnLinkedMemberDirectoryWebElement()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> list = linkedMemberDirectoryButtons;
        for(WebElement element:list){
           try {
               element.click();

           }catch(org.openqa.selenium.StaleElementReferenceException ex){
              driver.navigate().back();

           }

        }
    }
}
