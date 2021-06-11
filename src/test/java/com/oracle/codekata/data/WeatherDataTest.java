package com.oracle.codekata.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WeatherDataTest {

    @Test
    void Day_Positive() {
        WeatherData wd = new WeatherData();
        wd.setDay("1");

        assertEquals("1", wd.getDay());
    }

    @Test
    void Variance_Positive() {
        WeatherData wd = new WeatherData();
        wd.setVariance(6);

        assertEquals(6, wd.getVariance());

    }

    @Test
    void Dates_Positive() {

        Date curDateTime = new Date();

        WeatherData wd = new WeatherData();
        wd.setCreationDate(curDateTime);

        Assertions.assertSame(wd.getCreationDate(), curDateTime);

        wd.setUpdateDate(curDateTime);
        Assertions.assertSame(wd.getUpdateDate(), curDateTime);

    }
}