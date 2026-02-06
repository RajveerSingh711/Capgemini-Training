package Feb6.JUnit;

/*Create a TemperatureConverter class with:
celsiusToFahrenheit(double celsius): Converts Celsius to Fahrenheit.
fahrenheitToCelsius(double fahrenheit): Converts Fahrenheit to Celsius.
✅ Write JUnit tests to validate conversions.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius){
        return (celsius*9/5)+32;
    }
    public double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }
}
class TemperatureConverterTest{
    TemperatureConverter converter;
    @BeforeEach
    void setUp(){
        converter=new TemperatureConverter();
    }
    @Test
    void testCelsiusToFahrenheit(){
        assertEquals(32.0,converter.celsiusToFahrenheit(0),0.001);
        assertEquals(212.0,converter.celsiusToFahrenheit(100),0.001);
    }
    @Test
    void testFahrenheitToCelsius(){
        assertEquals(0.0,converter.fahrenheitToCelsius(32),0.001);
        assertEquals(100.0,converter.fahrenheitToCelsius(212),0.001);
    }
}