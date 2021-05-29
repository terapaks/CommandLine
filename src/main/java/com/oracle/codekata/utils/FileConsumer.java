package com.oracle.codekata.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import com.oracle.codekata.data.Operations;
import com.oracle.codekata.data.WeatherData;
import com.oracle.codekata.data.Data;


public abstract class FileConsumer {
    public ArrayList<Data> ReadFile(Operations inOper) {
        ArrayList<Data> dataLIst = new ArrayList<>();
        String path = "";

        if(inOper==Operations.WEATHER){
            path=Data.WEATHER_FILE;
        }
        else if(inOper==Operations.FOOTBALL){
            path=Data.FOOTBALL_FILE;
        }

        try {
            // pass the path to the file as a parameter
            File file =
                    new File(path);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String curStr = sc.nextLine();

                Data data = ParseLine(curStr);

                if(data!=null)
                    dataLIst.add(data);

                //System.out.printf("The day with the least temperature variance was %s and the value was %s..\n", wd.day, wd.variance);


            }



        } catch (Exception e) {
            System.out.println("FILE READ EXCEPTION: " + e.getMessage());
        }

        if(dataLIst.isEmpty()){
            System.out.println(Data.READ_FILE_FAILED);
            System.exit(0);
        }

        return dataLIst;
    }

    public Data ParseLine(String inStr){
        return null;
    }
}