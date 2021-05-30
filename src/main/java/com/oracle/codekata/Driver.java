package com.oracle.codekata;
import com.oracle.codekata.data.Data;
import com.oracle.codekata.files.FileConsumer;
import com.oracle.codekata.files.FootballFileConsumer;
import com.oracle.codekata.files.WeatherFileConsumer;
import com.oracle.codekata.print.FootballPrintResults;
import com.oracle.codekata.print.PrintResults;
import com.oracle.codekata.data.Operations;
import com.oracle.codekata.print.WeatherPrintResults;

import java.util.ArrayList;

public class Driver{
    static public void main(String[] args) {

        Operations oper = Operations.UNKNOWNN;

        FileConsumer fc = null;
        PrintResults pr = null;

        ArrayList<Data> dList = new ArrayList<>();
        String val = "";

        if(args.length == 0){
            System.out.println(Data.COMMAND_LINE_ERROR);
            System.exit(0);
        }
        else{
            val = args[0];

            if(val.equals(Data.WEATHER_COMMAND_LINE) ){
                oper=Operations.WEATHER;
                fc = new WeatherFileConsumer();
                pr = new WeatherPrintResults();
            }
            else if(val.equals(Data.FOOTBALL_COMMAND_LINE)){
                oper=Operations.FOOTBALL;
                fc = new FootballFileConsumer();
                pr = new FootballPrintResults();
            }
            else {
                System.out.println(Data.COMMAND_LINE_ERROR);
                System.exit(0);
            }

        }

        if(fc!=null){
            dList = fc.ReadFile();

            pr.PrintResult(dList);
        }


    }

}
