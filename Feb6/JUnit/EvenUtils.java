package Feb6.JUnit;

/*Create a method isEven(int number) that returns true if a number is even. Use @ParameterizedTest to test this method with multiple values like 2, 4, 6, 7, 9.
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenUtils{
    public boolean isEven(int number){
        return number%2==0;
    }
}
class EvenUtilsTest{
    EvenUtils utils;
    @BeforeEach
    void setUp(){
        utils=new EvenUtils();
    }
    @ParameterizedTest
    @ValueSource(ints={2,4,6})
    void testEvenNumbers(int number){
        assertTrue(utils.isEven(number));
    }
    @ParameterizedTest
    @ValueSource(ints={7,9})
    void testOddNumbers(int number){
        assertFalse(utils.isEven(number));
    }
}