package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.files.WeatherFileConsumer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WeatherPrintResultsTest {
    @Test
    void WeatherPrintResults_Positive() {
        WeatherFileConsumer fc = new WeatherFileConsumer();
        ArrayList<Data> dList = fc.ReadFile();

        WeatherPrintResults wp = new WeatherPrintResults();
        wp.GetDetails(dList);

        assertNotSame("", wp.getDay());
        Assertions.assertTrue(wp.getVariance()!=0);

    }

}