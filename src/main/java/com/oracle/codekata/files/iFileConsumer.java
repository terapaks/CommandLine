package com.oracle.codekata.files;

import com.oracle.codekata.data.Data;

import java.util.ArrayList;

public interface iFileConsumer {
    public ArrayList<Data> ReadFile();

    public Data ParseLine(String inStr);
}
