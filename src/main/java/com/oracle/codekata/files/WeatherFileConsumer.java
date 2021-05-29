package com.oracle.codekata.files;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.Operations;
import com.oracle.codekata.data.WeatherData;
import com.oracle.codekata.utils.NumberUtils;

import java.util.ArrayList;

public class WeatherFileConsumer extends FileConsumer {
    public WeatherFileConsumer() {
        _operation=Operations.WEATHER;
    }

    @Override
    public Data ParseLine(String inStr){
        WeatherData wd = new WeatherData();

        String[] splitStr = inStr.trim().split("\\s+");

        if (!NumberUtils.IsNumber(splitStr[0]))
            return null;

        wd.setDay(splitStr[0]) ;
        int max = Integer.parseInt(NumberUtils.CleanString(splitStr[1]));
        int min = Integer.parseInt(NumberUtils.CleanString(splitStr[2]));
        wd.setVariance(max - min);

        return wd;
    }
}
