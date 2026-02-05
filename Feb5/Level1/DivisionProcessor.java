package Feb5.Level1;

/*Create a method that processes a division operation. Implement the following:
1. Define a method performDivision(int numerator, int denominator) that
performs division and throws an ArithmeticException if the denominator is zero.
2. Define another method calculate(int numerator, int denominator) that
calls performDivision and rethrows the ArithmeticException with additional
context.
3. In the main method, handle the rethrown exception and provide a meaningful error
message to the user.
*/

import java.util.*;
import java.io.*;

public class DivisionProcessor {
    public static int performDivision(int numerator,int denominator){
        if(denominator==0){
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return numerator/denominator;
    }
    public static int calculate(int numerator,int denominator){
        try{
            return performDivision(numerator,denominator);
        }catch(ArithmeticException e){
            throw new ArithmeticException("Error occurred while calculating "+numerator+" / "+denominator+": "+e.getMessage());
        }
    }
    public static void main(String[] args){
        int numerator=10;
        int denominator=0;
        try{
            int result=calculate(numerator,denominator);
            System.out.println("Result: "+result);
        }catch(ArithmeticException e){
            System.err.println("Calculation failed!");
            System.err.println(e.getMessage());
        }
    }
}
