package Feb6.JUnit;

/*Create a StringUtils class with the following methods:
reverse(String str): Returns the reverse of a given string.
isPalindrome(String str): Returns true if the string is a palindrome.
toUpperCase(String str): Converts a string to uppercase.
Write JUnit test cases to verify that these methods work correctly.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtils {
    public String reverse(String str){
        if(str==null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str){
        if(str==null) return false;
        String reversed=reverse(str);
        return str.equals(reversed);
    }
    public String toUpperCase(String str){
        if(str==null) return null;
        return str.toUpperCase();
    }
}
class StringUtilsTest{
    StringUtils utils=new StringUtils();
    @Test
    void testReverse(){
        assertEquals("olleh",utils.reverse("hello"));
        assertEquals("",utils.reverse(""));
    }
    @Test
    void testIsPalindrome(){
        assertTrue(utils.isPalindrome("madam"));
        assertFalse(utils.isPalindrome("hello"));
    }
    @Test
    void testToUpperCase(){
        assertEquals("HELLO",utils.toUpperCase("hello"));
        assertEquals("JAVA",utils.toUpperCase("java"));
    }
}
