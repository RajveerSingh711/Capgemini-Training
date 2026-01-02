package Jan2.Level1;

/*Write a program to check whether a number is positive, negative, or zero.
Hint =>
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero.
*/

import java.util.*;

public class Ques6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0) System.out.print("positive");
        else if(n<0) System.out.print("negative");
        else System.out.print("zero");
    }
}
