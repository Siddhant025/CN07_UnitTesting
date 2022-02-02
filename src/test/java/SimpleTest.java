import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    public void MainTest() {
        boolean result=CardValidation.Mod10Check(4012888888881881L);
        assertEquals(true,result);
    }

    @Test
    public void OddSumTest(){
        int result=CardValidation.OddSum(4012888888881881L);
        assertEquals(43,result);
    }

    @Test
    public void EvenSumTest(){
        int result=CardValidation.DoubleEvenSum(4012888888881881L);
        assertEquals(47,result);
    }
}