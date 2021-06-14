package com.oracle.codekata;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.files.FileConsumer;
import com.oracle.codekata.files.FileConsumerFactory;
import com.oracle.codekata.print.PrintResults;
import com.oracle.codekata.print.PrintResultsFactory;
import java.lang.IllegalArgumentException;
import java.lang.Exception;

import java.util.ArrayList;

public class Driver {
    static public void main(String[] args)  {

        try{
            ExecuteCommandline(args);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }

    public static void ExecuteCommandline(String[] args) throws Exception{
        FileConsumer fc;
        PrintResults pr;

        ArrayList<Data> dList;
        String val;

        if (args.length == 0) {
            throw new IllegalArgumentException(Data.COMMAND_LINE_ERROR);
        }
        else {
            val = args[0];
            eOperation operation = ValidateCmdLine(val);

            FileConsumerFactory fcFactory = new FileConsumerFactory();
            PrintResultsFactory prFactory = new PrintResultsFactory();

            fc = fcFactory.CreateFileConsumer(operation);
            pr = prFactory.CreatePrintResults(operation);

            if (fc == null || pr == null) {
                throw new Exception("Unknown error occurred for operation processing");
            }
        }

        dList = fc.ReadFile();
        pr.GetDetails(dList);
        pr.PrintResult();
    }

    public static eOperation ValidateCmdLine(String inCmdLine){
        if (inCmdLine.equals(Data.WEATHER_COMMAND_LINE)) {
            return eOperation.WEATHER;
        } else if (inCmdLine.equals(Data.FOOTBALL_COMMAND_LINE)) {
            return eOperation.FOOTBALL;
        } else {
            throw new IllegalArgumentException(Data.COMMAND_LINE_ERROR);
        }
    }

    public enum eOperation{
        WEATHER,
        FOOTBALL
    }

}
