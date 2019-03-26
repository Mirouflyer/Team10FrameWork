package pages;

import base.CommonAPI;
import database.ConnectToSqlDB;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.convertToString;

public class MenuPage {
    public static String filePath = "C:\\Users\\Youcef\\Desktop\\Samir Final Test\\Team10FrameWork\\Ebay\\src\\test\\resources\\secret.properties";

    public  void readMenuText(WebDriver driver1)throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        List<String> actualData = new ArrayList<>();
        List<String> listOfMenu = CommonAPI.getTextFromWebElements("#gh-cat-box");
        SearchPage searchPage = PageFactory.initElements(driver1, SearchPage.class);
        searchPage.searchItemsAndSubmitButton(driver1);

        //To Be implemented, to read from database
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(listOfMenu, "itemList1" , "items", filePath);
        actualData = connectToSqlDB.readDataBase("itemList1","items", filePath );
        for (String data:actualData){
            System.out.println(data);
        }
        List<String> menuData = new ArrayList<>();
        Assert.assertEquals(listOfMenu,actualData);
    }
}
