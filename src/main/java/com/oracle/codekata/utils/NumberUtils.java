package com.oracle.codekata.utils;

import com.oracle.codekata.data.WeatherData;
import com.oracle.codekata.data.Data;
import java.util.ArrayList;

public class NumberUtils {
    public static Boolean IsNumber(String inStr){
        //should turn into function
        try{
            Integer.parseInt(inStr);
        }
        catch (NumberFormatException e){
            return false;
        }

        return true;
    }

    public static String CleanString(String inStr){
        var str =  inStr.replace('*', ' ');
        return str.trim();

    }

    public static void PrintSmallestDayVariance(ArrayList<Data> inList) {

        WeatherData wd = (WeatherData)inList.get(0);
        int variance =  wd.getVariance();
        String day = "";

        for (Data curData : inList) {

            WeatherData curWD = (WeatherData) curData;
            if(curWD.getVariance() < variance) {
                variance = curWD.getVariance();
                day = curWD.getDay();
            }
        }

        System.out.printf("The day with the least temperature variance was %s and the value was %s..", day, variance);
    }

}