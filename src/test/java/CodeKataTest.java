import com.oracle.codekata.utils.FileConsumer;
import com.oracle.codekata.data.Data;
import com.oracle.codekata.data.Operations;
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
            FileConsumer fc = new FileConsumer();
            ArrayList<Data> dList = fc.ReadFile(Operations.WEATHER);
            Assertions.assertTrue(dList.size()>0);
        }
        catch(Exception e){
            Assertions.fail();
        }

    }

}