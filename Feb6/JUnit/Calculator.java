package Feb6.JUnit;

/*Create a Calculator class with methods add(int a, int b), subtract(int a, int b), multiply(int a, int b), and divide(int a, int b). Write JUnit test cases for each method.
👉 Bonus: Test for division by zero and handle exceptions properly.
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        if(b==0) throw new ArithmeticException("Division by zero is not allowed");
        return a/b;
    }
}
class CalculatorTest{
    Calculator calculator=new Calculator();
    @Test
    void testAdd(){
        assertEquals(5,calculator.add(2,3));
    }
    @Test
    void testSubtract(){
        assertEquals(1,calculator.subtract(3,2));
    }
    @Test
    void testMultiply(){
        assertEquals(6,calculator.multiply(2,3));
    }
    @Test
    void testDivide(){
        assertEquals(2,calculator.divide(4,2));
    }
    @Test
    void testDivideByZero(){
        ArithmeticException exception=assertThrows(ArithmeticException.class,()->calculator.divide(5,0));
        assertEquals("Division by zero is not allowed",exception.getMessage());
    }
}
