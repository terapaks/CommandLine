package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.FootballData;

import java.util.ArrayList;

public class FootballPrintResults extends PrintResults implements iPrintResults{
    @Override
    public void PrintDetails() {
        System.out.printf("The team with the least goal variance was %s and the value was %s..\n", GetTeamName(), GetVariance());
    }

    @Override
    public void GetDetails(ArrayList<Data> inList){
        FootballData fd = (FootballData) inList.get(0);
        int variance = fd.GetVariance();
        String teamName = "";

        for (Data curData : inList) {

            FootballData curFD = (FootballData) curData;
            int curVariance = curFD.GetVariance();
            if (curVariance >= 0 && curVariance < variance) {
                SetVariance(curVariance);
                SetTeamName(curFD.GetTeamName());
            }
        }

    }

    public int GetVariance() {
        return _variance;
    }

    public void SetVariance(int inVariance) {
        this._variance = inVariance;
    }

    private int _variance;

    public String GetTeamName() {
        return _teamName;
    }

    public void SetTeamName(String inTeamName) {
        this._teamName = inTeamName;
    }

    private String _teamName;

}
