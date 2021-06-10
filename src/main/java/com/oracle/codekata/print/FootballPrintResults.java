package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.FootballData;

import java.util.ArrayList;

public class FootballPrintResults extends PrintResults {
    @Override
    public void PrintDetails(ArrayList<Data> inList) {

        FootballData fd = (FootballData) inList.get(0);
        int variance = fd.getVariance();
        String teamName = "";

        for (Data curData : inList) {

            FootballData curFD = (FootballData) curData;
            int curVariance = curFD.getVariance();
            if (curVariance >= 0 && curVariance < variance) {
                variance = curVariance;
                teamName = curFD.getTeamName();
            }
        }

        System.out.printf("The team with the least goal variance was %s and the value was %s..", teamName, variance);
    }
}
