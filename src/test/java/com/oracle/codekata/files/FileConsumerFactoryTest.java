package com.oracle.codekata.files;

import com.oracle.codekata.Driver;
import com.oracle.codekata.data.Data;
import com.oracle.codekata.print.FootballPrintResults;
import com.oracle.codekata.print.PrintResults;
import com.oracle.codekata.print.WeatherPrintResults;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileConsumerFactoryTest {

    @Test
    void FileConsumerFactory_Positive() {
        try{
            FileConsumer fc;
            FileConsumerFactory fcFact = new FileConsumerFactory();

            fc = fcFact.createFileConsumer(Driver.eOperation.FOOTBALL);

            Assertions.assertTrue(fc instanceof FootballFileConsumer);

            fc = fcFact.createFileConsumer(Driver.eOperation.WEATHER);

            Assertions.assertTrue(fc instanceof WeatherFileConsumer);


        }
        catch(Exception e){
            Assertions.fail();
        }
    }
}