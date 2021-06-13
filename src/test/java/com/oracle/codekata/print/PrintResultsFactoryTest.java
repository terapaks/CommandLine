package com.oracle.codekata.print;

import com.oracle.codekata.Driver;
import com.oracle.codekata.files.FileConsumer;
import com.oracle.codekata.files.FileConsumerFactory;
import com.oracle.codekata.files.FootballFileConsumer;
import com.oracle.codekata.files.WeatherFileConsumer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintResultsFactoryTest {
    @Test
    void PrintResultsFactory_Positive() {
        try{
            PrintResults pc;
            PrintResultsFactory pcFact = new PrintResultsFactory();

            pc = pcFact.createPrintResults(Driver.eOperation.FOOTBALL);

            Assertions.assertTrue(pc instanceof FootballPrintResults);

            pc = pcFact.createPrintResults(Driver.eOperation.WEATHER);

            Assertions.assertTrue(pc instanceof WeatherPrintResults);


        }
        catch(Exception e){
            Assertions.fail();
        }
    }

}