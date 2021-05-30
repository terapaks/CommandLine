import com.oracle.codekata.files.FileConsumer;
import com.oracle.codekata.data.Data;
import com.oracle.codekata.files.FootballFileConsumer;
import com.oracle.codekata.files.WeatherFileConsumer;
import com.oracle.codekata.print.FootballPrintResults;
import com.oracle.codekata.print.PrintResults;
import com.oracle.codekata.print.WeatherPrintResults;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;

class CodeKataTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void readWeatherFile() {
        try{
            FileConsumer fc = new WeatherFileConsumer();
            ArrayList<Data> dList = fc.ReadFile();
            Assertions.assertTrue(dList.size()>0);

            PrintResults pc = new WeatherPrintResults();
            pc.PrintDetails(dList);
        }
        catch(Exception e){
            Assertions.fail();
        }

    }

    @Test
    void readFootballFile() {
        try{
            FileConsumer fc = new FootballFileConsumer();
            ArrayList<Data> dList = fc.ReadFile();
            Assertions.assertTrue(dList.size()>0);

            PrintResults pc = new FootballPrintResults();
            pc.PrintDetails(dList);
        }
        catch(Exception e){
            Assertions.fail();
        }

    }

}