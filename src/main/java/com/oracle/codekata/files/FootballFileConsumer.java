package com.oracle.codekata.files;

import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.FootballData;
import com.oracle.codekata.utils.NumberUtils;

import static com.oracle.codekata.data.Operations.FOOTBALL;

public class FootballFileConsumer extends FileConsumer {
    public FootballFileConsumer() {
        _operation= FOOTBALL;
    }

    @Override
    public Data ParseLine(String inStr){
        FootballData fd = new FootballData();

        String[] splitStr = inStr.trim().split("\\s+");

        if (!NumberUtils.IsNumber(NumberUtils.CleanData(splitStr[0])))
            return null;

        fd.setTeamName(splitStr[1]);
        int goalsFor = Integer.parseInt(NumberUtils.CleanData(splitStr[6]));
        int goalsAgainst = Integer.parseInt(NumberUtils.CleanData(splitStr[8]));
        fd.setVariance(goalsFor - goalsAgainst);

        return fd;
    }
}
