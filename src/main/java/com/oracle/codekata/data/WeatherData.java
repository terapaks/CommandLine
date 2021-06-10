package com.oracle.codekata.data;

public class WeatherData extends Data {
    public String getDay() {
        return _day;
    }

    public void setDay(String _day) {
        this._day = _day;
    }

    private String _day;

    public int getVariance() {
        return _variance;
    }

    public void setVariance(int _variance) {
        this._variance = _variance;
    }

    private int _variance;

    public final static int DAY_FIELD = 0;
    public final static int MAX_TEMP_FIELD = 1;
    public final static int MIN_TEMP_FIELD = 2;
}
