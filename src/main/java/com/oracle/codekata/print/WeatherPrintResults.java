package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.WeatherData;

import java.util.ArrayList;

public class WeatherPrintResults extends PrintResults {
    @Override
    public void PrintDetails(ArrayList<Data> inList) {



        System.out.printf("The day with the least temperature variance was %s and the value was %s..\n", getDay(), getVariance());
    }

    @Override
    public void GetDetails(ArrayList<Data> inList) {
        WeatherData wd = (WeatherData) inList.get(0);
        int variance = wd.getVariance();
        String day = "";

        for (Data curData : inList) {

            WeatherData curWD = (WeatherData) curData;
            if (curWD.getVariance() < variance) {
                setVariance(curWD.getVariance());
                setDay(curWD.getDay());
            }
        }
    }

    public String getDay() {
        return _day;
    }

    public void setDay(String inDay) {
        this._day = inDay;
    }

    private String _day;

    public int getVariance() {
        return _variance;
    }

    public void setVariance(int inVariance) {
        this._variance = inVariance;
    }

    private int _variance;
}
