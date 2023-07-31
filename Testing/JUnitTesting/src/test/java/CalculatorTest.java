import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int add = calculator.add(2,3);
        assertEquals(5, add);
    }

    @Test
    public void testAddAll(){
        int a = 2000;
        int b = 3000;
        int expected = 5000;
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int sub = calculator.sub(2,1);
        assertEquals(1, sub);
    }

    @Test
    public  void testSubAll(){
        int a = 300;
        int b = 200;
        int expected = 100;
        Calculator calculator = new Calculator();
        int result = calculator.sub(a,b);
        assertEquals(expected, result);

    }

    @Test
    public void testMul(){
        Calculator calculator = new Calculator();
        int mul = calculator.mul(10, 20);
        assertEquals(200, mul);
    }

    @Test
    public void testMulAll(){
        int a = 10;
        int b = 20;
        int expected = 200;
        Calculator calculator = new Calculator();
        int result = calculator.mul(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testDiv(){
        Calculator calculator = new Calculator();
        double div = calculator.div(20, 2);
        assertEquals(10, div);
    }

    @Test
    public void testDivAll(){
        double a = 100;
        double b = 20;
        double expected = 5;
        Calculator calculator = new Calculator();
        double result = calculator.div(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testDivDouble(){
        double a = 10;
        double b = 3;
        double expected = 3.3333333333333335;
        Calculator calculator = new Calculator();
        double result = calculator.div(a, b);
        assertEquals(expected, result);
    }

}