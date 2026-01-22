package Jan6.Level1;

/*Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint =>
Create a String Array to save the results and
Finally, loop again to show the results of the array based on the index position
*/

import java.util.*;

public class Ques10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n+1];
        for (int i=0;i<=n;i++){
            if(i==0){
                arr[i]="0";
            }else if(i%3==0 && i%5==0){
                arr[i]="FizzBuzz";
            }else if(i%3==0){
                arr[i]="Fizz";
            }else if(i%5==0){
                arr[i]="Buzz";
            } else{
                arr[i]=String.valueOf(i);
            }
        }
        for(String s:arr){
            System.out.print(s+" ");
        }
    }
}
