package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.Operations;
import com.oracle.codekata.data.WeatherData;

import java.util.ArrayList;

public abstract class PrintResults {
    public void PrintResult(ArrayList<Data> inList, Operations inOper){
        if(inOper==Operations.WEATHER){
            PrintDetails(inList);
        }
        else if(inOper==Operations.FOOTBALL){
            //TODO Finish the implementation
        }

    }

    public void PrintDetails(ArrayList<Data> inList){

    }
}
