package Jan2.Level2;

/*Create a program to find all the multiples of a number taken as user input below 100.
Hint =>
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Run a for loop backward: from i = 100 to i = 1.
Inside the loop, check if i perfectly divide the number. If true, print the number and continue the loop.
 */

import java.util.*;

public class Ques11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
            System.out.println("Please enter a positive integer");
        }else{
            System.out.println("The multiples of "+n+" are :");
            for(int i=100;i>=1;i--){
                if(i%n==0){
                    System.out.println(i);
                }
            }
        }
    }
}
