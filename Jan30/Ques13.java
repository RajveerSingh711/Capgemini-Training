package Jan30;

/*A peak element is an element that is greater than its neighbors. Write a program that performs Binary Search to find a peak element in an array. If there are multiple peak elements, return any one of them.
Approach:
Initialize left as 0 and right as n - 1.
Perform a binary search:
Find the middle element mid = (left + right) / 2.
If arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1], arr[mid] is a peak element.
If arr[mid] < arr[mid - 1], then search the left half, updating right = mid - 1.
If arr[mid] < arr[mid + 1], then search the right half, updating left = mid + 1.
Continue until a peak element is found.
*/

import java.util.*;

public class Ques13 {
    static int findPeak(int arr[]){
        int left=0,right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<arr[mid+1]) left=mid+1;
            else right=mid;
        }
        return left;
    }
    public static void main(String[] args){
        int[] arr={1,3,20,4,1,0};
        int peakIndex=findPeak(arr);
        System.out.println("Peak element found at index: "+peakIndex);
        System.out.println("Peak value: "+arr[peakIndex]);
    }
}
