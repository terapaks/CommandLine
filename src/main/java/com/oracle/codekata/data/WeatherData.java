package com.oracle.codekata.data;

public class WeatherData extends Data {
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    private String day;

    public int getVariance() {
        return variance;
    }

    public void setVariance(int variance) {
        this.variance = variance;
    }

    private int variance;

    public final static int DAY_FIELD=0;
    public final static int MAX_TEMP_FIELD=1;
    public final static int MIN_TEMP_FIELD=2;
}
