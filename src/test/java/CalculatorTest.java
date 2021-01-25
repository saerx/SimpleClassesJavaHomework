import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        int sum = calculator.add(3, 4);
        assertEquals(7, sum);
    }

    @Test
    public void canSubtract(){
        int difference = calculator.subtract(3, 4);
        assertEquals(-1, difference);
    }

    @Test
    public void canMultiply(){
        int product = calculator.multiply(3, 4);
        assertEquals(12, product);
    }

    @Test
    public void canDivide(){
        double quotient = calculator.divide(3, 4);
        assertEquals(0.75, quotient, 0.0);
    }

}
