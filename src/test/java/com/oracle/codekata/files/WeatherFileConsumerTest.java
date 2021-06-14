package com.oracle.codekata.files;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.print.PrintResults;
import com.oracle.codekata.print.WeatherPrintResults;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WeatherFileConsumerTest {

    @Test
    void readWeatherFile_Pass() {
        try{
            FileConsumer fc = new WeatherFileConsumer();
            ArrayList<Data> dList = fc.ReadFile();
            Assertions.assertTrue(dList.size()>0);

            PrintResults pc = new WeatherPrintResults();
            pc.GetDetails(dList);
            pc.PrintResult();
        }
        catch(Exception e){
            Assertions.fail();
        }

    }

}