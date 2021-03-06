package com.oracle.codekata;

import com.oracle.codekata.data.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    void Main_Positive() {
        try{
            String[] cmdLine = {Data.FOOTBALL_COMMAND_LINE};
            Driver.main(cmdLine);
        }
        catch (Exception e)
        {
            Assertions.fail();
        }

    }

    @Test
    void Main_NegativeInvalid() {

        String[] cmdLine = {"BLEH"};

        try{
            Driver.ExecuteCommandline(cmdLine);
            Assertions.fail("Exception expected..."); //should not make it here
        }
        catch (IllegalStateException e){
            Assertions.assertTrue(true);
        }
        catch (Exception e){
            Assertions.fail("Wrong exception thrown.");
        }
    }

    @Test
    void Main_NegativeEmpty() {

        String[] cmdLine = {""};

        try{
            Driver.ExecuteCommandline(cmdLine);
            Assertions.fail("Exception expected..."); //should not make it here
        }
        catch (IllegalStateException e){
            Assertions.assertTrue(true);
        }
        catch (Exception e){
            Assertions.fail("Wrong exception thrown.");
        }
    }
}