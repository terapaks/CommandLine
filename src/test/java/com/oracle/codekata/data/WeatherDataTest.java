package com.oracle.codekata.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WeatherDataTest {

    @Test
    void Day_Positive() {
        WeatherData wd = new WeatherData();
        wd.SetDay("1");

        assertEquals("1", wd.GetDay());
    }

    @Test
    void Variance_Positive() {
        WeatherData wd = new WeatherData();
        wd.SetVariance(6);

        assertEquals(6, wd.GetVariance());

    }

    @Test
    void Dates_Positive() {

        Date curDateTime = new Date();

        WeatherData wd = new WeatherData();
        wd.SetCreationDate(curDateTime);

        Assertions.assertSame(wd.GetCreationDate(), curDateTime);

        wd.SetUpdateDate(curDateTime);
        Assertions.assertSame(wd.GetUpdateDate(), curDateTime);

    }
}