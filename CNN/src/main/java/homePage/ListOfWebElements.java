package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class ListOfWebElements extends CommonAPI {
    public void getWebElements(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> usWebElement = driver.findElements(By.xpath("//ol[@class='m-footer__bucket m-footer__bucket__tech'] //li//a"));
        List<String> cnnTech = new ArrayList<>();
        for (WebElement element:usWebElement) {
            String tech = element.getText();
            cnnTech.add(tech);
        }
        System.out.println(cnnTech.size());
        for (int i=0;i<cnnTech.size();i++) {
            System.out.println(cnnTech.get(i));

        }

    }
}
