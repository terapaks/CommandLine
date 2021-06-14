package com.oracle.codekata.print;

import com.oracle.codekata.Driver.eOperation;


public class PrintResultsFactory {

    public PrintResults CreatePrintResults(eOperation inOperation)
    {
        if (inOperation.equals(eOperation.WEATHER)) {
            return new WeatherPrintResults();
        } else if (inOperation.equals(eOperation.FOOTBALL)) {
            return new FootballPrintResults();
        } else {
            return null;
        }
    }
}
