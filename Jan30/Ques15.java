package Jan30;

/*Find the First and Last Occurrence of an Element in a Sorted Array
Problem:
Given a sorted array and a target element, write a program that uses Binary Search to find the first and last occurrence of the target element in the array. If the element is not found, return -1.
Approach:
Use binary search to find the first occurrence:
Perform a regular binary search, but if the target is found, continue searching on the left side (right = mid - 1) to find the first occurrence.
Use binary search to find the last occurrence:
Similar to finding the first occurrence, but once the target is found, continue searching on the right side (left = mid + 1) to find the last occurrence.
Return the indices of the first and last occurrence. If not found, return -1.
*/

import java.util.*;

public class Ques15 {
    static int findFirst(int arr[],int target){
        int left=0,right=arr.length-1,result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                result=mid;
                right=mid-1;
            }else if(arr[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return result;
    }
    static int findLast(int arr[],int target){
        int left=0,right=arr.length-1,result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                result=mid;
                left=mid+1;
            }else if(arr[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr={2,4,4,4,6,8,9};
        int target=4;
        int first=findFirst(arr,target);
        int last=findLast(arr,target);
        if(first==-1){
            System.out.println("Element not found.");
        } else{
            System.out.println("First Occurrence: "+first);
            System.out.println("Last Occurrence: "+last);
        }
    }
}
