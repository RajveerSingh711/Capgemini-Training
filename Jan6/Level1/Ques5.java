package Jan6.Level1;

/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint =>
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___
*/

import java.util.*;

public class Ques5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=(i+6)*n;
        }
        for(int i=0;i<4;i++){
            System.out.println(n+" X "+(i+6)+" = "+arr[i]);
        }
    }
}
