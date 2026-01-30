package Jan30;

/*You are given a list of integers. Write a program that uses Linear Search to find the first missing positive integer in the list and Binary Search to find the index of a given target number.
Approach:
Linear Search for the first missing positive integer:
Iterate through the list and mark each number in the list as visited (you can use negative marking or a separate array).
Traverse the array again to find the first positive integer that is not marked.
Binary Search for the target index:
After sorting the array, perform binary search to find the index of the given target number.
Return the index if found, otherwise return -1.
*/

import java.util.*;

public class Ques16 {
    public static int firstMissingPositive(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++) {
            if(nums[i]<=0||nums[i]>n) nums[i]=n+1;
        }
        for(int i=0;i<n;i++){
            int val=Math.abs(nums[i]);
            if(val<=n) nums[val-1]=-Math.abs(nums[val-1]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0) return i+1;
        }
        return n+1;
    }
    public static int binarySearch(int[] arr,int target){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) left = mid + 1;
            else right=mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={3,4,-1,1};
        int[] copy=arr.clone();
        int missing=firstMissingPositive(copy);
        System.out.println("First Missing Positive: "+missing);
        Arrays.sort(arr);
        int target=4;
        int index=binarySearch(arr,target);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
        System.out.println("Target Index: "+index);
    }
}
