package com.oracle.codekata.data;

public class FootballData extends Data {
    public final static int TEAM_NAME_FIELD = 1;
    public final static int GOALS_FOR_FIELD = 6;
    public final static int GOALS_AGAINST_FIELD = 8;
    private String _teamName;
    private int _variance;

    public String GetTeamName() {
        return _teamName;
    }

    public void SetTeamName(String _teamName) {
        this._teamName = _teamName;
    }

    public int GetVariance() {
        return _variance;
    }

    public void GetVariance(int _variance) {
        this._variance = _variance;
    }
}
