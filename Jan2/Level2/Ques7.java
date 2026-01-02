package Jan2.Level2;

/*Create a program to find the factors of a number taken as user input.
Hint =>
Get the input value for a variable named number and check if it is a positive integer.
Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i.
*/

import java.util.*;

public class Ques7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
            System.out.println("Please enter a positive integer");
        }else{
            for(int i=1;i<=n;i++){
                if(n%i==0) System.out.println(i);
            }
        }
    }
}
