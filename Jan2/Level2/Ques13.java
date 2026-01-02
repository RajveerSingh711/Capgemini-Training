package Jan2.Level2;

/*Rewrite the program to find all the multiples of a number below 100 using while loop.
Hint =>
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Create a counter variable and assign counter = number - 1; Use a while till the counter is > 1
Inside the loop, check if the counter perfectly divides the number. If true, print the number and continue the loop.
 */

import java.util.*;

public class Ques13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
            System.out.println("Please enter a positive integer");
        }else{
            System.out.println("The multiples of "+n+" are :");
            int i=100;
            while(i>0){
                if(i%n==0){
                    System.out.println(i);
                }
                i--;
            }
        }
    }
}
