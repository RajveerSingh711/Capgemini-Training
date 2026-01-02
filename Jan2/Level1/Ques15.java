package Jan2.Level1;

/*Rewrite program 14 using for loop
Hint =>
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result.
 */

import java.util.*;

public class Ques15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++) factorial*=i;
        System.out.println("Factorial of "+n+" is: "+factorial);
    }
}
