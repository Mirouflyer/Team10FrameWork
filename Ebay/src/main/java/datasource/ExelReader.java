package datasource;

import utility.DataReader;

import java.io.IOException;

public class ExelReader {
DataReader dataReader = new DataReader();
    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        String path = System.getProperty("user.dir")+"\\data\\Categories.xls";
        String [] data = dataReader.fileReader2(path,0);
        return data;
    }
}