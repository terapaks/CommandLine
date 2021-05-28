package com.oracle.codekata.data;

public class FootballData extends Data {
    public int getGoalsFor() {
        return GoalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.GoalsFor = goalsFor;
    }

    private int GoalsFor;

    public int getGoalsAgainst() {
        return GoalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.GoalsAgainst = goalsAgainst;
    }

    private int GoalsAgainst;
}
