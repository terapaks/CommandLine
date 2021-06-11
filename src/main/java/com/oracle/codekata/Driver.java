package com.oracle.codekata;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.files.FileConsumer;
import com.oracle.codekata.files.FootballFileConsumer;
import com.oracle.codekata.files.WeatherFileConsumer;
import com.oracle.codekata.print.FootballPrintResults;
import com.oracle.codekata.print.PrintResults;
import com.oracle.codekata.print.WeatherPrintResults;
import java.lang.IllegalArgumentException;

import java.util.ArrayList;

public class Driver {
    static public void main(String[] args) {


        try {
            FileConsumer fc = null;
            PrintResults pr = null;

            ArrayList<Data> dList;
            String val;

            if (args.length == 0) {
                System.out.println(Data.COMMAND_LINE_ERROR);
                System.exit(0);
            } else {
                val = args[0];

                if (val.equals(Data.WEATHER_COMMAND_LINE)) {
                    fc = new WeatherFileConsumer();
                    pr = new WeatherPrintResults();
                } else if (val.equals(Data.FOOTBALL_COMMAND_LINE)) {
                    fc = new FootballFileConsumer();
                    pr = new FootballPrintResults();
                } else {
                    throw new IllegalArgumentException(Data.COMMAND_LINE_ERROR);
                }

            }

            dList = fc.ReadFile();

            pr.PrintResult(dList);
        } catch (Exception e) {
            System.out.println("DRIVER EXCEPTION: " + e.getMessage() + "\n");
            throw e;
        }


    }

}
