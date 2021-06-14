package com.oracle.codekata.data;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FootballDataTest {

    @Test
    void TeamName_Positive() {
        FootballData fd = new FootballData();
        fd.SetTeamName("TEST");

        assertSame("TEST", fd.GetTeamName());
    }

    @Test
    void Variance_Positive() {
        FootballData fd = new FootballData();
        fd.GetVariance(6);

        assertEquals(6, fd.GetVariance());

    }

    @Test
    void Dates_Positive() {

        Date curDateTime = new Date();

        FootballData fd = new FootballData();
        fd.SetCreationDate(curDateTime);

        assertSame(fd.GetCreationDate(), curDateTime);

        fd.SetUpdateDate(curDateTime);
        assertSame(fd.GetUpdateDate(), curDateTime);

    }
}