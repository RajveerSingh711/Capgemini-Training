package Dec24;/* Write a program that takes three numbers as input from the user and prints
their average. */

import java.util.*;
public class Calculate_Average_of_Three_Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int average_of_3_numbers=(num1+num2+num3)/3;
        System.out.print(average_of_3_numbers);
    }
}
