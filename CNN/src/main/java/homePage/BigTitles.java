package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class BigTitles extends CommonAPI {

    public void findWebElements(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> usWebElement = driver.findElements(By.xpath("//div[@class='nav-menu-links']//a"));
        List<String> us = new ArrayList<>();
        for (WebElement element:usWebElement) {
            String titles = element.getText();
            us.add(titles);
        }
        System.out.println(us.size());
        for (int i=0;i<us.size();i++) {
            System.out.println(us.get(i));

        }
    }
}
