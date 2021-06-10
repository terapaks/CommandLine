package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;

import java.util.ArrayList;

public abstract class PrintResults {
    public void PrintResult(ArrayList<Data> inList) {
        PrintDetails(inList);
    }

    abstract public void PrintDetails(ArrayList<Data> inList);
}