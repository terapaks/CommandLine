package com.oracle.codekata;
import com.oracle.codekata.data.Data;
import com.oracle.codekata.utils.NumberUtils;
import java.util.ArrayList;

public class Driver{
    static public void main(String[] args) {

        FileConsumer fc = new FileConsumer();
        ArrayList<Data> dList = new ArrayList<>();
        String val = new String("");

        if(args.length == 0){
            System.out.println(Data.COMMAND_LINE_ERROR);
            System.exit(0);
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
                System.out.println(Data.COMMAND_LINE_ERROR);
                System.exit(0);
            }

        }

        if(dList.size() == 0){
            System.out.println("File read failed.");
            System.exit(0);
        }

        if(val.equals(Data.WEATHER_COMMAND_LINE) ){
            NumberUtils.PrintSmallestDayVariance(dList);
        }
        else if(val.equals(Data.FOOTBALL_COMMAND_LINE)){
            NumberUtils.PrintSmallestDayVariance(dList);
        }
        else {
            System.out.println(Data.COMMAND_LINE_ERROR);
            System.exit(0);
        }


    }

}
