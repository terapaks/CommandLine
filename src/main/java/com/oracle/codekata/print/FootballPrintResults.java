package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.FootballData;

import java.util.ArrayList;

public class FootballPrintResults extends PrintResults {
    @Override
    public void PrintDetails(ArrayList<Data> inList) {

        GetDetails(inList);

        System.out.printf("The team with the least goal variance was %s and the value was %s..\n", getTeamName(), getVariance());
    }

    @Override
    public void GetDetails(ArrayList<Data> inList){
        FootballData fd = (FootballData) inList.get(0);
        int variance = fd.getVariance();
        String teamName = "";

        for (Data curData : inList) {

            FootballData curFD = (FootballData) curData;
            int curVariance = curFD.getVariance();
            if (curVariance >= 0 && curVariance < variance) {
                setVariance(curVariance);
                setTeamName(curFD.getTeamName());
            }
        }

    }

    public int getVariance() {
        return _variance;
    }

    public void setVariance(int inVariance) {
        this._variance = inVariance;
    }

    private int _variance;

    public String getTeamName() {
        return _teamName;
    }

    public void setTeamName(String inTeamName) {
        this._teamName = inTeamName;
    }

    private String _teamName;

}
