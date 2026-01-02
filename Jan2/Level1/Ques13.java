package Jan2.Level1;

/*Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers.
Hint =>
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
*/

import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.print(n+" is not a natural number.");
        }else{
            int sum1=0;
            for(int i=1;i<=n;i++) sum1+=i;
            int sum2=(n*(n+1))/2;
            if(sum1==sum2) System.out.print("Both results"+sum1+" and "+sum2+" are correct and equal.");
            else System.out.print("Results"+sum1+" and"+sum2+" are NOT equal.");
        }
    }
}
