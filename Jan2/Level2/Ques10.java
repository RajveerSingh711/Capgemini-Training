package Jan2.Level2;

/*Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
Hint =>
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a variable counter and assign counter = number - 1; Use the while loop till the counter is equal to 1.
Inside the loop, check if the number is perfectly divisible by the counter then assign the counter to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
*/

import java.util.*;

public class Ques10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1) System.out.println("No greatest factor exists for the given number.");
        else{
            int i=n-1;
            while(i>=2){
                if(n%i==0){
                    System.out.println(i);
                    break;
                }
                i--;
            }
        }
    }
}
