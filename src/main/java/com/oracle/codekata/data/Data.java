package com.oracle.codekata.data;

import java.util.Date;

public abstract class Data {
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date creationDate;

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date updateDate;

    public final static String WEATHER_COMMAND_LINE="weather";
    public final static String FOOTBALL_COMMAND_LINE="football";

    public final static String WEATHER_FILE="/data/weather.dat";
    public final static String FOOTBALL_FILE="/data/football.dat";

}
