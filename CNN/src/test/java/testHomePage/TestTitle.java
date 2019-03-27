package testHomePage;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTitle extends CommonAPI {
    @Test
    public void title(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"CNN - Breaking News, Latest News and Videos");
       }
    }
