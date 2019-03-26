package temporaryTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TemporaryTests extends CommonAPI {
    @Test
    public void locatorTests(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        //driver.findElement(By.id("rememberMe"));
        driver.findElement(By.className("site-search__close-button\n" +
                "              \n" +
                "            "));



      //driver.findElement(By.cssSelector("#sset-link.setUpAccess"));
        // driver.findElement(By.xpath("//*[@lazy-load-src='/assets/compass/contentful/1h6lncjoeq27/Q9ZhrJhcaYUQAQOiACigA/f146f5f47085d29a03081ef84f4cd60e/icon-360-money-market.png']"));

    }
}
