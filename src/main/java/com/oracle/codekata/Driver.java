package com.oracle.codekata;
import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.Operations;
import com.oracle.codekata.utils.NumberUtils;
import java.util.ArrayList;

public class Driver{
    static public void main(String[] args) {

        Operations oper = Operations.UNKNOWNN;

        FileConsumer fc = new FileConsumer();
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
            }
            else if(val.equals(Data.FOOTBALL_COMMAND_LINE)){
                oper=Operations.FOOTBALL;
            }
            else {
                System.out.println(Data.COMMAND_LINE_ERROR);
                System.exit(0);
            }

        }

        dList = fc.ReadFile(oper);

        NumberUtils.PrintResult(dList, oper);

    }

}
