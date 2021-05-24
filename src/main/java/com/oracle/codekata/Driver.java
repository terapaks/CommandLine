package com.oracle.codekata;


public class Driver{
    static public void main(String[] args) {
        FileConsumer fc = new FileConsumer();
        fc.ReadFileAndOutput("/data/weather.dat");
    }

}
