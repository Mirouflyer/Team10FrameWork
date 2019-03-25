package temporaryTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TemporaryTests extends CommonAPI {
    @Test
    public void locatorTests(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        //driver.findElement(By.id("navtest-b-l1-signin"));
        driver.findElement(By.className("section.gitncallout-row"));
      //driver.findElement(By.cssSelector("c1-button blue"));
//        driver.findElement(By.xpath(""));

    }
}
