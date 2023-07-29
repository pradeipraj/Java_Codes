import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2,3);
        assertEquals(5,result);
    }
    @Test
    public void testAdd1(){
        int param1 = 2;
        int param2 = 3;
        int expected = 5;
        Calculator calculator = new Calculator();
        int result = calculator.add(param1, param2);
        assertEquals(expected, result);
    }

}