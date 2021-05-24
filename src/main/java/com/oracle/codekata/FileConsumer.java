package com.oracle.codekata;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import com.oracle.codekata.data.WeatherData;
import com.oracle.codekata.utils.NumberUtils;


public class FileConsumer {
    public void ReadFileAndOutput(String inVal) {
        try {
            ArrayList<WeatherData> wdLIst = new ArrayList<>();

            // pass the path to the file as a parameter
            File file =
                    new File("/Users/stephenterapak/IdeaProjects/CommandLine/Data/weather.dat");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                WeatherData wd = new WeatherData();
                String curStr = sc.nextLine();
                String[] splitStr = curStr.trim().split("\\s+");

                if (!NumberUtils.IsNumber(splitStr[0]))
                    continue;

                wd.setDay(splitStr[0]) ;
                int max = Integer.parseInt(NumberUtils.CleanString(splitStr[1]));
                int min = Integer.parseInt(NumberUtils.CleanString(splitStr[2]));
                wd.setVariance(max - min);

                //System.out.printf("The day with the least temperature variance was %s and the value was %s..\n", wd.day, wd.variance);

                wdLIst.add(wd);
            }

            NumberUtils.PrintSmallestDayVariance(wdLIst);
        } catch (Exception e) {
            System.out.println("!!!!!!!!!!EXCEPTION:" + e.getMessage());

        }

    }
}
