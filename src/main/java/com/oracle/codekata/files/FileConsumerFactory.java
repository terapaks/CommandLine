package com.oracle.codekata.files;

import com.oracle.codekata.Driver;
import com.oracle.codekata.Driver.eOperation;
import com.oracle.codekata.data.Data;
import com.oracle.codekata.print.FootballPrintResults;
import com.oracle.codekata.print.WeatherPrintResults;

public class FileConsumerFactory {
    public iFileConsumer CreateFileConsumer(eOperation inOperation) {
        switch (inOperation) {
            case WEATHER:
                return new WeatherFileConsumer();
            case FOOTBALL:
                return new FootballFileConsumer();
            default:
                throw new IllegalStateException("Unexpected value: " + inOperation);
        }
    }
}