package com.oracle.codekata;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileConsumer {
    public static void ReadFileAndOutput(String inVal) {
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

                if (!numberUtils.IsNumber(splitStr[0]))
                    continue;

                wd.day = splitStr[0];
                int max = Integer.parseInt(numberUtils.CleanString(splitStr[1]));
                int min = Integer.parseInt(numberUtils.CleanString(splitStr[2]));
                wd.variance = max - min;

                //System.out.printf("The day with the least temperature variance was %s and the value was %s..\n", wd.day, wd.variance);

                wdLIst.add(wd);
            }

            numberUtils.PrintSmallestDayVariance(wdLIst);
        } catch (Exception e) {
            System.out.println("!!!!!!!!!!EXCEPTION:" + e.getMessage());

        }

    }
}
