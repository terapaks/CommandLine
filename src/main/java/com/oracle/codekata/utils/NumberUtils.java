package com.oracle.codekata.utils;

import com.oracle.codekata.data.Operations;
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

    public static String CleanData(String inStr){
        String str =  inStr.replace('*', ' ');
        String cleanStr =  str.replace('.', ' ');
        return cleanStr.trim();

    }



}