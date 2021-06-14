package com.oracle.codekata.data;

import java.util.Date;

public abstract class Data {

    public final static String WEATHER_COMMAND_LINE = "weather";
    public final static String FOOTBALL_COMMAND_LINE = "football";
    public final static String WEATHER_FILE = "data/weather.dat";
    public final static String FOOTBALL_FILE = "data/football.dat";
    public final static String COMMAND_LINE_ERROR = "Please specify the operation we are executing.  Current values would include weather or football.";
    public final static String READ_FILE_FAILED = "FILE read failed.";
    private Date _creationDate;
    private Date _updateDate;

    public Date GetCreationDate() {
        return _creationDate;
    }

    public void SetCreationDate(Date _creationDate) {
        this._creationDate = _creationDate;
    }

    public Date GetUpdateDate() {
        return _updateDate;
    }

    public void SetUpdateDate(Date _updateDate) {
        this._updateDate = _updateDate;
    }

}
