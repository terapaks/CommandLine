package com.oracle.codekata.utils;

import com.oracle.codekata.data.Data;

import java.util.ArrayList;

class WeatherData extends Data {
    String day;
    int variance;
}

class numberUtils{
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

    public static void PrintSmallestDayVariance(ArrayList<WeatherData> inList) {

        int variance = inList.get(0).variance;
        String day = "";

        for (WeatherData curWD : inList) {

            if(curWD.variance < variance) {
                variance = curWD.variance;
                day = curWD.day;
            }
        }

        System.out.printf("The day with the least temperature variance was %s and the value was %s..", day, variance);
    }

}