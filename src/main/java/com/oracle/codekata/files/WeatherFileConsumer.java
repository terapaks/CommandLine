package com.oracle.codekata.files;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.WeatherData;
import com.oracle.codekata.utils.NumberUtils;

public class WeatherFileConsumer extends FileConsumer {
    public WeatherFileConsumer() {
        _path=Data.WEATHER_FILE;
    }

    @Override
    public Data ParseLine(String inStr){
        WeatherData wd = new WeatherData();

        String[] splitStr = inStr.trim().split("\\s+");

        if (!NumberUtils.IsNumber(splitStr[0]))
            return null;

        wd.setDay(splitStr[WeatherData.DAY_FIELD]) ;
        int max = Integer.parseInt(NumberUtils.CleanData(splitStr[WeatherData.MAX_TEMP_FIELD]));
        int min = Integer.parseInt(NumberUtils.CleanData(splitStr[WeatherData.MIN_TEMP_FIELD]));
        wd.setVariance(max - min);

        return wd;
    }
}
