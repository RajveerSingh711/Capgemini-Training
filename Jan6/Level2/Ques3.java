package Jan6.Level2;

/*Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint =>
Create a number variable and Take user input.
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number
*/

import java.util.*;

public class Ques3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=10;
        int arr[]=new int[size];
        int i=0;
        while(n!=0){
            if(i==size) break;
            arr[i++]=n%10;
            n/=10;
        }
        int largest=0,secondLargest=0;
        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num>secondLargest && num<largest) secondLargest=num;
        }
        System.out.println("Largest digit: "+largest);
        System.out.println("Second largest digit: "+secondLargest);
    }
}
