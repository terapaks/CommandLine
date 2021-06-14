package com.oracle.codekata.files;

import com.oracle.codekata.Driver;
import com.oracle.codekata.data.Data;
import com.oracle.codekata.print.FootballPrintResults;
import com.oracle.codekata.print.WeatherPrintResults;

public class FileConsumerFactory {
    public FileConsumer CreateFileConsumer(Driver.eOperation inOperation)
    {
        if (inOperation.equals(Driver.eOperation.WEATHER)) {
            return new WeatherFileConsumer();
        } else if (inOperation.equals(Driver.eOperation.FOOTBALL)) {
            return new FootballFileConsumer();
        } else {
            return null;
        }
    }

}
