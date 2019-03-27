package homePage;

import base.CommonAPI;
import homePageLinks.FindAColleague;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestFindACollegue extends CommonAPI {

    @Test
    public void findACollegue() throws Exception{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FindAColleague findAColleague = PageFactory.initElements(driver,FindAColleague.class);
        findAColleague.findAcollegue("Eduardo","Arus");
    }
}
