package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;

import java.util.ArrayList;

public abstract class PrintResults {
    public void PrintResults() {
        PrintResult();
    }

    abstract public void PrintResult();

    abstract public String PrintDetails();

    abstract public void GetDetails(ArrayList<Data> inList);
}