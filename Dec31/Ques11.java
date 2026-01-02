package Dec31;

/* Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint =>
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
*/

import java.util.*;

public class Ques11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int addition_of_2_num=num1+num2;
        int subtraction_of_2_num=num1-num2;
        int multiplication_of_2_num=num1*num2;
        int division_of_2_num=num1/num2;
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+addition_of_2_num+", "+subtraction_of_2_num+", "+multiplication_of_2_num+", and "+division_of_2_num);
    }
}
