package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.WeatherData;

import java.util.ArrayList;

public class WeatherPrintResults extends PrintResults implements iPrintResults {
    @Override
    public void PrintResult() {
        System.out.printf("The day with the least temperature variance was %s and the value was %s..\n", GetDay(), GetVariance());
    }

    @Override
    public String PrintDetails() {
        return "The team with the least goal variance was " + GetDay() + " and the value was " + GetVariance() + "..\n";
    }

    @Override
    public void GetDetails(ArrayList<Data> inList) {
        WeatherData wd = (WeatherData) inList.get(0);
        int variance = wd.GetVariance();
        String day = "";

        for (Data curData : inList) {

            WeatherData curWD = (WeatherData) curData;
            if (curWD.GetVariance() < variance) {
                SetVariance(curWD.GetVariance());
                SetDay(curWD.GetDay());
            }
        }
    }

    public String GetDay() {
        return _day;
    }

    public void SetDay(String inDay) {
        this._day = inDay;
    }

    private String _day;

    public int GetVariance() {
        return _variance;
    }

    public void SetVariance(int inVariance) {
        this._variance = inVariance;
    }

    private int _variance;
}
