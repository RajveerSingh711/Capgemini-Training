package Feb6.JUnit;

/*Create a UserRegistration class with:
registerUser(String username, String email, String password).
Throws IllegalArgumentException for invalid inputs.
✅ Write JUnit tests to verify valid and invalid user registrations.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class UserRegistration {
    public boolean registerUser(String username,String email,String password){
        if(username==null || username.trim().isEmpty()) throw new IllegalArgumentException("Invalid username");
        if(email==null || !email.contains("@")) throw new IllegalArgumentException("Invalid email");
        if(password==null || password.length()<8) throw new IllegalArgumentException("Invalid password");
        return true;
    }
}
class UserRegistrationTest{
    UserRegistration registration;
    @BeforeEach
    void setUp(){
        registration=new UserRegistration();
    }
    @Test
    void testValidUserRegistration(){
        assertTrue(registration.registerUser("rajveer","rajveer@gmail.com","Password1"));
    }
    @Test
    void testInvalidUsername(){
        assertThrows(IllegalArgumentException.class,()->registration.registerUser("","test@gmail.com","Password1"));
    }
    @Test
    void testInvalidEmail(){
        assertThrows(IllegalArgumentException.class,()->registration.registerUser("rajveer","gmail.com","Password1"));
    }
    @Test
    void testInvalidPassword(){
        assertThrows(IllegalArgumentException.class,()->registration.registerUser("rajveer","rajveer@gmail.com","pass"));
    }
}