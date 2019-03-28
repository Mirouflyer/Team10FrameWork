package keyword;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class ExcelReader extends CommonAPI {

    DataReader dr = new DataReader();

//    public String[] getStepsTestExcelFile () throws IOException {
//        String path = System.getProperty("../Walamrt/data/testSteps.xls");
//        String[] data = dr.fileReader2(path, 0);
//        return data;
//    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = System.getProperty("user.dir")+"/data/ItemList.xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }


}


