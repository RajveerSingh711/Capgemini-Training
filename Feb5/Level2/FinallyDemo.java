package Feb5.Level2;

/*Write a program that performs integer division and demonstrates the finally block execution.
The program should:
Take two integers from the user.
Perform division.
Handle ArithmeticException (if dividing by zero).
Ensure "Operation completed" is always printed using finally.
Expected Behavior:
If valid, print the result.
If an exception occurs, handle it and still print "Operation completed".
*/

import java.util.*;

public class FinallyDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter first integer: ");
            int a=sc.nextInt();
            System.out.print("Enter second integer: ");
            int b=sc.nextInt();
            int result=a/b;
            System.out.println("Result: "+result);
        }catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero.");
        }finally{
            System.out.println("Operation completed");
            sc.close();
        }
    }
}
