package com.oracle.codekata.files;

import com.oracle.codekata.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FileConsumerFactoryTest {

    @Test
    void FileConsumerFactory_Positive() {
        try{
            iFileConsumer fc;
            FileConsumerFactory fcFact = new FileConsumerFactory();

            fc = fcFact.CreateFileConsumer(Driver.eOperation.FOOTBALL);

            Assertions.assertTrue(fc instanceof FootballFileConsumer);

            fc = fcFact.CreateFileConsumer(Driver.eOperation.WEATHER);

            Assertions.assertTrue(fc instanceof WeatherFileConsumer);


        }
        catch(Exception e){
            Assertions.fail();
        }
    }
}