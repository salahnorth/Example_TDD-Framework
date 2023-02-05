import org.junit.*;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator stringCalc = new StringCalculator();

    @Test
    public void StringCalcEmptyString(){
        int expected = 0;
        int actual = stringCalc.Add("");

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void StringCalcFor1Digit(){
        int expected = 1;
        int actual = stringCalc.Add("1");

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void StringCalcFor2Digits(){
        int expected = 3;
        int actual = stringCalc.Add("12");

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void StringCalcForUnknownDigits(){
    }
}
