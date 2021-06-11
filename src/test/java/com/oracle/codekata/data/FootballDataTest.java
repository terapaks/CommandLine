package com.oracle.codekata.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FootballDataTest {

    @Test
    void TeamName_Positive() {
        FootballData fd = new FootballData();
        fd.setTeamName("TEST");

        assertSame("TEST", fd.getTeamName());
    }

    @Test
    void Variance_Positive() {
        FootballData fd = new FootballData();
        fd.setVariance(6);

        assertEquals(6, fd.getVariance());

    }

    @Test
    void Dates_Positive() {

        Date curDateTime = new Date();

        FootballData fd = new FootballData();
        fd.setCreationDate(curDateTime);

        assertSame(fd.getCreationDate(), curDateTime);

        fd.setUpdateDate(curDateTime);
        assertSame(fd.getUpdateDate(), curDateTime);

    }
}