package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;

import java.util.ArrayList;

public abstract class PrintResults {
    public void PrintResult() {
        PrintDetails();
    }

    abstract public void PrintDetails();

    abstract public void GetDetails(ArrayList<Data> inList);
}