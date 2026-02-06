package Feb6.JUnit;

/*Create a DateFormatter class with:
formatDate(String inputDate): Converts yyyy-MM-dd format to dd-MM-yyyy.
✅ Write JUnit test cases for valid and invalid dates.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.LocalDate;
import java.time.format.*;

public class DateFormatter {
    public String formatDate(String inputDate){
        try{
            DateTimeFormatter inputFormat=DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter outputFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date=LocalDate.parse(inputDate,inputFormat);
            return date.format(outputFormat);
        }catch(DateTimeParseException e){
            throw new IllegalArgumentException("Invalid date format");
        }
    }
}
class DateFormatterTest{
    DateFormatter formatter;
    @BeforeEach
    void setUp(){
        formatter=new DateFormatter();
    }
    @Test
    void testValidDate(){
        assertEquals("06-02-2026",formatter.formatDate("2026-02-06"));
    }
    @Test
    void testInvalidDateFormat(){
        Exception exception=assertThrows(IllegalArgumentException.class,()->formatter.formatDate("06/02/2026"));
        assertEquals("Invalid date format",exception.getMessage());
    }
    @Test
    void testInvalidDateValue(){
        assertThrows(IllegalArgumentException.class,()->formatter.formatDate("2026-13-40"));
    }
}