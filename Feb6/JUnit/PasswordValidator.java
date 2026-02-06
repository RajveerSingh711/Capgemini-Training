package Feb6.JUnit;

/*Create a PasswordValidator class with:
Password must have at least 8 characters, one uppercase letter, and one digit.
✅ Write JUnit tests for valid and invalid passwords.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PasswordValidator {
    public boolean isValid(String password){
        if(password==null || password.length()<8) return false;
        boolean hasUpperCase=false;
        boolean hasDigit=false;
        for(char ch:password.toCharArray()){
            if(Character.isUpperCase(ch)) hasUpperCase=true;
            if(Character.isDigit(ch)) hasDigit=true;
        }
        return hasUpperCase&&hasDigit;
    }
}
class PasswordValidatorTest{
    PasswordValidator validator;
    @BeforeEach
    void setUp(){
        validator=new PasswordValidator();
    }
    @Test
    void testValidPassword(){
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("Secure9A"));
    }
    @Test
    void testInvalidPasswordTooShort(){
        assertFalse(validator.isValid("Pass1"));
    }
    @Test
    void testInvalidPasswordNoUppercase(){
        assertFalse(validator.isValid("password1"));
    }
    @Test
    void testInvalidPasswordNoDigit(){
        assertFalse(validator.isValid("Password"));
    }
}