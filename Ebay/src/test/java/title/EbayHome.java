package title;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class EbayHome extends CommonAPI {

    @Test
    public void test() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String tittle = driver.getTitle();
        System.out.println(tittle);
        Assert.assertEquals(tittle, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
    }
}