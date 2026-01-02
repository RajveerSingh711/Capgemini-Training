package Jan2.Level1;

/*Write a Program to find the factorial of an integer entered by the user.
Hint =>
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.
*/

import java.util.*;

public class Ques14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=1;
        int i=1;
        while(i<=n){
            factorial*=i;
            i++;
        }
        System.out.println("Factorial of "+n+" is: "+factorial);
    }
}
