package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;

import java.util.ArrayList;

public interface iPrintResults {
    public void PrintDetails();

    public void GetDetails(ArrayList<Data> inList);

    public void PrintResult();
}
