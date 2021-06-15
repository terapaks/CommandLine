package com.oracle.codekata.files;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.FootballData;
import com.oracle.codekata.utils.NumberUtils;

public class FootballFileConsumer extends FileConsumer implements iFileConsumer {
    public FootballFileConsumer() {
        _path = Data.FOOTBALL_FILE;
    }

    @Override
    public Data ParseLine(String inStr) {
        FootballData fd = new FootballData();

        String[] splitStr = inStr.trim().split("\\s+");

        if (!NumberUtils.IsNumber(NumberUtils.CleanData(splitStr[0])))
            return null;

        fd.SetTeamName(splitStr[FootballData.TEAM_NAME_FIELD]);
        int goalsFor = Integer.parseInt(NumberUtils.CleanData(splitStr[FootballData.GOALS_FOR_FIELD]));
        int goalsAgainst = Integer.parseInt(NumberUtils.CleanData(splitStr[FootballData.GOALS_AGAINST_FIELD]));
        fd.GetVariance(goalsFor - goalsAgainst);

        return fd;
    }
}
