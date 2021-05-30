package com.oracle.codekata.utils;

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