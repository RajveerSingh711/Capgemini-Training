package Feb6.JUnit;

/*Create a method divide(int a, int b) that throws an ArithmeticException if b is zero. Write a JUnit test to verify that the exception is thrown properly.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtils {
    public int divide(int a,int b){
        if(b==0) throw new ArithmeticException("Division by zero is not allowed");
        return a/b;
    }
}
class MathUtilsTest{
    @Test
    void testDivideByZeroThrowsException(){
        MathUtils utils=new MathUtils();
        ArithmeticException exception=assertThrows(ArithmeticException.class,()->utils.divide(10,0));
        assertEquals("Division by zero is not allowed",exception.getMessage());
    }
}