package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.WeatherData;

import java.util.ArrayList;

public class WeatherPrintResults extends PrintResults {
    @Override
    public void PrintDetails(ArrayList<Data> inList) {

        WeatherData wd = (WeatherData) inList.get(0);
        int variance = wd.getVariance();
        String day = "";

        for (Data curData : inList) {

            WeatherData curWD = (WeatherData) curData;
            if (curWD.getVariance() < variance) {
                variance = curWD.getVariance();
                day = curWD.getDay();
            }
        }

        System.out.printf("The day with the least temperature variance was %s and the value was %s..", day, variance);
    }
}
