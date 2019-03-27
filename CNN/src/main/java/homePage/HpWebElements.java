package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class HpWebElements extends CommonAPI {

    public void findWebElements(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> usWebElements = driver.findElements(By.xpath("//div[@class='m-footer-nav edition-domestic']//ol"));
        List<String> homepageElements = new ArrayList<>();
        for (WebElement element:usWebElements) {
            String titles = element.getText();
            homepageElements.add(titles);
        }
        System.out.println(homepageElements.size());
        for (int i=0;i<homepageElements.size();i++) {
            System.out.println(homepageElements.get(i));

        }
    }
}
