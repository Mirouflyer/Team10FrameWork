package keyword;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class StepsTestCases extends CommonAPI {


    public static   String[] getStepsTestExcelFile () throws IOException {
        DataReader dr = new DataReader();
        String path = System.getProperty("/Users/mirouflyer/Desktop/teamframework/Team10FrameWorkTest/Walamrt/data/testSteps.xls");
        String[] data = dr.fileReader2(path, 0);
        return data;
    }


    public static void main(String[] args) throws IOException {
        String[] stepsTest = getStepsTestExcelFile();
        for (int i = 0; i < stepsTest.length; i++) {
            System.out.println(stepsTest[i]);
        }
    }
}


