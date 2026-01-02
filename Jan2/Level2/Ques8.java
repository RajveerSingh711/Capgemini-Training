package Jan2.Level2;

/*Rewrite the above program 7 to find the factors of a number using the while loop
Hint =>
Get the input value for a variable named number and check if it is a positive integer.
Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.
*/

import java.util.*;

public class Ques8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
            System.out.println("Please enter a positive integer");
        }else{
            int i=1;
            while(i<=n){
                if(n%i==0) System.out.println(i);
                i++;
            }
        }
    }
}
