package com.oracle.codekata;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.files.iFileConsumer;
import com.oracle.codekata.files.FileConsumer;
import com.oracle.codekata.files.FileConsumerFactory;
import com.oracle.codekata.print.*;

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
        iFileConsumer fc;
        iPrintResults pr;

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
        switch (inCmdLine) {
            case Data.WEATHER_COMMAND_LINE:
                return eOperation.WEATHER;
            case Data.FOOTBALL_COMMAND_LINE:
                return eOperation.FOOTBALL;
            default:
                throw new IllegalStateException("Unexpected parameter: " + inCmdLine);
        }
    }

    public enum eOperation{
        WEATHER,
        FOOTBALL
    }

}
