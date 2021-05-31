package com.oracle.codekata.data;

import java.util.Date;

public abstract class Data {
    public Date get_creationDate() {
        return _creationDate;
    }

    public void set_creationDate(Date _creationDate) {
        this._creationDate = _creationDate;
    }

    private Date _creationDate;

    public Date get_updateDate() {
        return _updateDate;
    }

    public void set_updateDate(Date _updateDate) {
        this._updateDate = _updateDate;
    }

    private Date _updateDate;

    public final static String WEATHER_COMMAND_LINE="weather";
    public final static String FOOTBALL_COMMAND_LINE="football";

    public final static String WEATHER_FILE="data/weather.dat";
    public final static String FOOTBALL_FILE="data/football.dat";

    public final static String COMMAND_LINE_ERROR= "Please specify the operation we are executing.  Current values would include weather or football.";
    public final static String READ_FILE_FAILED= "FILE read failed.";

}
