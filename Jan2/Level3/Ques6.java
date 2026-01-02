package Jan2.Level3;

/*Create a program to count the number of digits in an integer.
Hint =>
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits
*/

import java.util.*;

public class Ques6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int noOfDigit=0;
        int temp=n;
        while(temp>0){
            noOfDigit++;
            temp/=10;
        }
        System.out.println("No of digits in "+n+" is "+noOfDigit);
    }
}
