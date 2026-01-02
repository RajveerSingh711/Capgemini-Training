package Jan2.Level2;

/*Rewrite the above program to find the power of a number using a while loop.
Hint =>
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
Finally, print the result
*/

import java.util.*;

public class Ques14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),power=sc.nextInt();
        int result=1;
        int i=1;
        while(i<=power){
            result*=num;
            i++;
        }
        System.out.println(num+" raised to the power "+power+" is: "+result);
    }
}
