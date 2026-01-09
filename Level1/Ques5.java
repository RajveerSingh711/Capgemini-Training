package Level1;

/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
 */

import java.util.*;

public class Ques5 {
    public static int check(int n){
        if(n==0) return 0;
        if(n<0) return -1;
        return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=check(n);
        if(n==0) System.out.print("Number is zero");
        else if(n<0) System.out.print("Number is negative");
        else System.out.print("Number is positive");
    }
}
