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
}
