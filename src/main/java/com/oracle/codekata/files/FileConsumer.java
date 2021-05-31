package com.oracle.codekata.files;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import com.oracle.codekata.data.Data;


public abstract class FileConsumer {
    protected String _path;

    public ArrayList<Data> ReadFile() {
        ArrayList<Data> dataLIst = new ArrayList<>();

        try {
            File file =
                    new File(_path);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String curStr = sc.nextLine();

                Data data = ParseLine(curStr);

                if(data!=null){
                    data.setCreationDate(Calendar.getInstance().getTime());
                    dataLIst.add(data);
                }


                //System.out.printf("The day with the least temperature variance was %s and the value was %s..\n", wd.day, wd.variance);
            }
        } catch (Exception e) {
            System.out.println("FILE READ EXCEPTION: " + e.getMessage());
        }

        if(dataLIst.isEmpty()){
            System.out.println(Data.READ_FILE_FAILED);
            System.exit(0);
        }

        return dataLIst;
    }

    abstract public Data ParseLine(String inStr);
}
