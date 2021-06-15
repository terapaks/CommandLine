package com.oracle.codekata.print;

import com.oracle.codekata.Driver.eOperation;


public class PrintResultsFactory {

    public iPrintResults CreatePrintResults(eOperation inOperation)
    {
        switch (inOperation) {
            case WEATHER:
                return new WeatherPrintResults();
            case FOOTBALL:
                return new FootballPrintResults();
            default:
                throw new IllegalStateException("Unexpected value: " + inOperation);
        }
    }
}
