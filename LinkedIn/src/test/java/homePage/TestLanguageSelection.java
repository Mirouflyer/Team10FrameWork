package homePage;

import base.CommonAPI;
import homePageLinks.LanguageSelection;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestLanguageSelection extends CommonAPI {

    @Test
    public void languageSelection() throws Exception{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LanguageSelection languageSelection = PageFactory.initElements(driver,LanguageSelection.class);
        languageSelection.displayLanguageOptions();
        System.out.println("******************************\n");
        languageSelection.languageSelectionFromExcelFile();

    }
}
