package Feb5.Level1;

/*Create a class UserService with methods for user registration. Implement the following:
1. Define a method registerUser(String username) that throws a
UserAlreadyExistsException if the user already exists in the system. Use the
throws keyword to declare this exception.
2. Define a method checkUserExistence(String username) that simulates
checking user existence and throws a UserNotFoundException if the user is not
found.
3. In the main method, handle these exceptions appropriately and provide feedback.
 */

import java.util.*;

class UserAlreadyExistsException extends Exception{
    public UserAlreadyExistsException(String message){
        super(message);
    }
}
class UserNotFoundException extends Exception{
    public UserNotFoundException(String message){
        super(message);
    }
}
public class UserService {
    public static void checkUserExistence(String username) throws UserNotFoundException{
        if(!"admin".equals(username)){
            throw new UserNotFoundException("User '"+username+"' not found in the system.");
        }
    }
    public static void registerUser(String username) throws UserAlreadyExistsException{
        if("admin".equals(username)){
            throw new UserAlreadyExistsException("User '"+username+"' already exists. Registration failed.");
        }
        System.out.println("User '"+username+"' registered successfully.");
    }
    public static void main(String[] args){
        String username="admin";
        try{
            checkUserExistence(username);
            registerUser(username);
        }catch(UserNotFoundException e){
            System.err.println("Error: "+e.getMessage());
        }catch(UserAlreadyExistsException e){
            System.err.println("Error: "+e.getMessage());
        }
    }
}
