package title;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EbayHome extends CommonAPI {

    @Test
    public void test() {
        String tittle = driver.getTitle();
        System.out.println(tittle);
        Assert.assertEquals(tittle, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
    }
}