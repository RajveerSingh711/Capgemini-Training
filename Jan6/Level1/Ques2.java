package Jan6.Level1;

/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint =>
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero.
Finally compare the first and last element of the array and display if they equal, greater or less
*/

import java.util.*;

public class Ques2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++) arr[i]=sc.nextInt();
        for(int i=0;i<5;i++){
            if(arr[i]>0){
                if(arr[i]%2==0) System.out.println("Element "+arr[i]+" is a positive even number.");
                else System.out.println("Element "+arr[i]+" is a positive odd number.");
            }else if(arr[i]<0) System.out.println("Element "+arr[i]+" is a negative number.");
            else System.out.println("Element "+arr[i]+" is zero.");
        }
    }
}
