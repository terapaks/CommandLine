package com.oracle.codekata;
import com.oracle.codekata.data.Data;
import com.oracle.codekata.utils.NumberUtils;
import java.util.ArrayList;

public class Driver{
    static public void main(String[] args) {

        FileConsumer fc = new FileConsumer();
        ArrayList<Data> dList;
        String val;

        if(args.length == 0){
            System.out.println("You must specify the data file we are using.  So please enter weather or football.");
            return;
        }
        else{
            val = args[0];

            if(val.equals(Data.WEATHER_COMMAND_LINE) ){
                dList = fc.ReadFile(Data.WEATHER_FILE);
            }
            else if(val.equals(Data.FOOTBALL_COMMAND_LINE)){
                dList = fc.ReadFile(Data.FOOTBALL_FILE);
            }
            else {
                System.out.println("You must specify the data file we are using.  So please enter weather or football.");
                return;
            }

        }

        if(dList == null){
            System.out.println("File read failed.");

        }
        else{
            if(val.equals(Data.WEATHER_COMMAND_LINE) ){
                NumberUtils.PrintSmallestDayVariance(dList);
            }
            else if(val.equals(Data.FOOTBALL_COMMAND_LINE)){
                NumberUtils.PrintSmallestDayVariance(dList);
            }

        }

    }

}
