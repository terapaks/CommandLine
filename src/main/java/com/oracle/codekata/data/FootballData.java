package com.oracle.codekata.data;

public class FootballData extends Data {
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    private String teamName;

    public int getVariance() {
        return variance;
    }

    public void setVariance(int variance) {
        this.variance = variance;
    }

    private int variance;

    public final static int TEAM_NAME_FIELD=1;
    public final static int GOALS_FOR_FIELD=6;
    public final static int GOALS_AGAINST_FIELD=8;
}
