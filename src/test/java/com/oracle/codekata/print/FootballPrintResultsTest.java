package com.oracle.codekata.print;

import org.junit.jupiter.api.Test;
import com.oracle.codekata.files.FootballFileConsumer;
import com.oracle.codekata.data.Data;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FootballPrintResultsTest{

        @Test
        void FootballPrintResults_Positive() {
            FootballFileConsumer fc = new FootballFileConsumer();
            ArrayList<Data> dList = fc.ReadFile();

            FootballPrintResults fp = new FootballPrintResults();
            fp.GetDetails(dList);

            assertNotSame(null, fp.GetTeamName());
            assertNotSame(0, fp.GetVariance());
        }

}