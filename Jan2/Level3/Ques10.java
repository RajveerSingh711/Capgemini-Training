package Jan2.Level3;

/*Write a program to create a calculator using switch...case.
Hint =>
Create two double variables named num1 and num2 and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between num1 and num2; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator
*/

import java.util.*;

public class Ques10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble(),num2=sc.nextDouble();
        String op=sc.next();
        switch (op) {
            case "+":
                System.out.println("Result = "+(num1+num2));
                break;
            case "-":
                System.out.println("Result = "+(num1-num2));
                break;
            case "*":
                System.out.println("Result = "+(num1*num2));
                break;
            case "/":
                if(num2 != 0) {
                    System.out.println("Result = "+(num1/num2));
                }else{
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
