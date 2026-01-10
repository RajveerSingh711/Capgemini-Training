package Jan7.Level2;

/*Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint =>
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly
If the number is negative, print negative.
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
 */

import java.util.*;

public class Ques9 {
    public static boolean isPositive(int num){
        return num>=0;
    }
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static int compare(int num1,int num2){
        if(num1>num2) return 1;
        else if(num1==num2) return 0;
        else return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++) arr[i]=sc.nextInt();
        for (int i=0;i<5;i++) {
            if (isPositive(arr[i])){
                System.out.print(arr[i]+" is Positive and ");
                if(isEven(arr[i])) System.out.println("Even");
                else System.out.println("Odd");
            } else System.out.println(arr[i]+" is Negative");
        }
        int result=compare(arr[0],arr[4]);
        if(result==1) System.out.println("First element is greater than last element");
        else if(result==0) System.out.println("First and last elements are equal");
        else System.out.println("First element is less than last element");
    }
}
