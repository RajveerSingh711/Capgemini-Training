package Jan30;

/*You are given a rotated sorted array. Write a program that performs Binary Search to find the index of the smallest element in the array (the rotation point).
Approach:
Initialize left as 0 and right as n - 1.
Perform a binary search:
Find the middle element mid = (left + right) / 2.
If arr[mid] > arr[right], then the smallest element is in the right half, so update left = mid + 1.
If arr[mid] < arr[right], the smallest element is in the left half, so update right = mid.
Continue until left equals right, and then return arr[left] (the rotation point).
*/

import java.util.*;

public class Ques12 {
    static int findRotationPoint(int[] arr){
        int left=0,right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[right]) left=mid+1;
            else right=mid;
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr={7,9,11,12,5};
        int index=findRotationPoint(arr);
        System.out.println("Rotation index: "+index);
        System.out.println("Smallest element: "+arr[index]);
    }
}
