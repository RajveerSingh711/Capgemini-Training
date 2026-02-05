package Feb5.Level2;

/*Create a custom exception called InvalidAgeException.
Write a method validateAge(int age) that throws InvalidAgeException if the age is below 18.
In main(), take user input and call validateAge().
If an exception occurs, display "Age must be 18 or above".
Expected Behavior:
If the age is >=18, print "Access granted!".
If age <18, throw InvalidAgeException and display the message.
*/

import java.util.*;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter your age: ");
            int age=sc.nextInt();
            validateAge(age);
            System.out.println("Access granted!");
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }
}
