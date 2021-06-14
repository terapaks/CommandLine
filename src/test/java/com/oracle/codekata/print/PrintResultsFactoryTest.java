package com.oracle.codekata.print;

import com.oracle.codekata.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrintResultsFactoryTest {
    @Test
    void PrintResultsFactory_Positive() {
        try{
            PrintResults pc;
            PrintResultsFactory pcFact = new PrintResultsFactory();

            pc = pcFact.CreatePrintResults(Driver.eOperation.FOOTBALL);

            Assertions.assertTrue(pc instanceof FootballPrintResults);

            pc = pcFact.CreatePrintResults(Driver.eOperation.WEATHER);

            Assertions.assertTrue(pc instanceof WeatherPrintResults);


        }
        catch(Exception e){
            Assertions.fail();
        }
    }

}