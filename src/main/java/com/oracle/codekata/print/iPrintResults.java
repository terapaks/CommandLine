package com.oracle.codekata.print;

import com.oracle.codekata.data.Data;

import java.util.ArrayList;

public interface iPrintResults {
    void PrintResult();

    String PrintDetails();

    void GetDetails(ArrayList<Data> inList);

}
