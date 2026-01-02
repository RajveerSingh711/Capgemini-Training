package Jan2.Level1;

/*Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P =>
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
*/

import java.util.*;

public class Ques3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
        String largest1,largest2,largest3;
        if(num1>num2 && num1>num3){
            largest1="Yes";
        }else largest1="No";
        if(num2>num1 && num2>num3){
            largest2="Yes";
        }else largest2="No";
        if(num3>num1 && num3>num2){
            largest3="Yes";
        }else largest3="No";
        System.out.println("Is the first number the largest? "+largest1);
        System.out.println("Is the second number the largest? "+largest2);
        System.out.println("Is the third number the largest? "+largest3);
    }
}
