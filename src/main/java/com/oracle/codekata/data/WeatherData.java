package com.oracle.codekata.data;

public class WeatherData extends Data {
    public final static int DAY_FIELD = 0;
    public final static int MAX_TEMP_FIELD = 1;
    public final static int MIN_TEMP_FIELD = 2;
    private String _day;
    private int _variance;

    public String GetDay() {
        return _day;
    }

    public void SetDay(String _day) {
        this._day = _day;
    }

    public int GetVariance() {
        return _variance;
    }

    public void SetVariance(int _variance) {
        this._variance = _variance;
    }
}
