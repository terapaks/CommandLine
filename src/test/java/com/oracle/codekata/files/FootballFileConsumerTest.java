package com.oracle.codekata.files;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.print.FootballPrintResults;
import com.oracle.codekata.print.PrintResults;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FootballFileConsumerTest {

    @Test
    void readFootballFile_Pass() {
        try{
            FileConsumer fc = new FootballFileConsumer();
            ArrayList<Data> dList = fc.ReadFile();
            Assertions.assertTrue(dList.size()>0);

            PrintResults pc = new FootballPrintResults();
            pc.GetDetails(dList);
            pc.PrintResults();
        }
        catch(Exception e){
            Assertions.fail();
        }

    }

}