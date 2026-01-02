package Jan2.Level1;

/*Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct.
Hint =>
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result
*/

import java.util.*;

public class Ques12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.print(n+" is not a natural number.");
        }else{
            int sum1=0;
            int i=1;
            int sum2=(n*(n+1))/2;
            if(sum1==sum2) System.out.print("Both results"+sum1+" and "+sum2+" are correct and equal.");
            else System.out.print("Results"+sum1+" and"+sum2+" are NOT equal.");
        }
    }
}
