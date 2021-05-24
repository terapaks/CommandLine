package com.oracle.codekata;
import com.oracle.codekata.data.Data;
import com.oracle.codekata.utils.NumberUtils;
import java.util.ArrayList;

public class Driver{
    static public void main(String[] args) {
        FileConsumer fc = new FileConsumer();
        ArrayList<Data> dList = fc.ReadFile("/data/weather.dat");
        NumberUtils.PrintSmallestDayVariance(dList);
    }

}
