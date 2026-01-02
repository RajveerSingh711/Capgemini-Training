package Dec24;// Write a program that takes two numbers as input from the user and prints
//their sum.
import java.util.*;
public class Add_Two_Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.print("Sum of 2 numbers is "+sum);
    }
}
