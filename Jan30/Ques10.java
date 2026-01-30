package Jan30;

/*You are given an integer array. Write a program that performs Linear Search to find the first negative number in the array. If a negative number is found, return its index. If no negative number is found, return -1.
Approach:
Iterate through the array from the start.
Check if the current element is negative.
If a negative number is found, return its index.
If the loop completes without finding a negative number, return -1.
*/

import java.util.*;

public class Ques10 {
    static int findFirstNegative(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] numbers={5,9,3,-2,8,-7};
        int result=findFirstNegative(numbers);
        if(result!=-1) System.out.println("First negative number found at index: "+result);
        else System.out.println("No negative numbers in the array.");
    }
}
