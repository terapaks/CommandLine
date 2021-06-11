package com.oracle.codekata.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void isNumber_Pass() {
        Assertions.assertTrue(NumberUtils.IsNumber("1"));
    }

    @Test
    void isNumber_Fail() {
        Assertions.assertFalse(NumberUtils.IsNumber("AA"));
    }

    @Test
    void cleanData_Pass() {
        String val = ".....******";

        val = NumberUtils.CleanData(val);

        Assertions.assertFalse(val.contains("."));
        Assertions.assertFalse(val.contains("*"));
    }

}