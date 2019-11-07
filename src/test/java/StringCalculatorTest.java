import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void emptyString() throws Exception {
        assertEquals(0, StringCalculator.add(""));
    }
    @Test
    public void sumOfOneNumber() throws Exception {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void sumOfTwoNumber() throws Exception {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void sumOfThreeNumber() throws Exception {
        assertEquals(6, StringCalculator.add("1,2,3"));
    }

    @Test
    public void sumNewlineDelimiter() throws Exception {
        assertEquals(3, StringCalculator.add("1\n2"));
    }

    @Test
    public void sumNewlineAndOtherDelimiter() throws Exception {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    public void sumDifferentDelimiter() throws Exception {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    public void negativesNotAllowed(){
        try{
            assertEquals("Negatives not allowed: -1", StringCalculator.add("-1"));
        }
        catch (Exception message){
        }
    }

    @Test
    public void noValuesHigherThan1000() throws Exception {
        assertEquals(3, StringCalculator.add("1,2,1001"));
    }

    @Test
    public void anyLengthDelimiter() throws Exception {
        assertEquals(3, StringCalculator.add("//***\n1***2***3"));
    }


}