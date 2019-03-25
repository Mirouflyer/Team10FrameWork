package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MenuPage {


    public static void readMenuText(WebDriver driver1) throws  Exception, IOException, SQLException, ClassNotFoundException {
        List<String> actualData = new ArrayList<String>();
        List<String> listOfMenu = CommonAPI.getTextFromWebElements("#SearchDropdown-list");
        System.out.println("List of Walmar Menu from the Website of Walmart:");
        for(String data:listOfMenu){
            System.out.println(data);
        }
        System.out.println("**************************************************\n");




//        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//        connectToSqlDB.insertDataFromArrayListToSqlTable(listOfMenu,"WalmartItemList","items");
//        actualData = connectToSqlDB.readDataBase("WalmartItemList","items");
//        System.out.println("List of Walmart Menu from Mysql Databae :");
//        for(String data : actualData){
//            System.out.println(data);
//        }
//
//
//        Assert.assertEquals(listOfMenu,actualData);


    }

}
