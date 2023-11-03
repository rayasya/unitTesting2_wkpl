import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 5);
        assertEquals(10, result);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int result = calculator.substract(10, 5);
        assertEquals(5, result);
    }
}
