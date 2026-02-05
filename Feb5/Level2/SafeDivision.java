package Feb5.Level2;

/*Write a Java program that asks the user to enter two numbers and divides them. Handle possible exceptions such as:
ArithmeticException if division by zero occurs.
InputMismatchException if the user enters a non-numeric value.
Expected Behavior:
If the user enters valid numbers, print the result of the division.
If the user enters 0 as the denominator, catch and handle ArithmeticException.
If the user enters a non-numeric value, catch and handle InputMismatchException.
*/

import java.util.*;

public class SafeDivision {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter numerator: ");
            int numerator=sc.nextInt();
            System.out.print("Enter denominator: ");
            int denominator=sc.nextInt();
            int result=numerator/denominator;
            System.out.println("Result: "+result);
        }catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero.");
        }catch(InputMismatchException e){
            System.out.println("Error: Please enter valid numeric values.");
        }finally{
            sc.close();
        }
    }
}
