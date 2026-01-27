package Jan28;

/*Sliding Window Maximum
Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
Hint: Use a deque (double-ended queue) to maintain indices of useful elements in each window.
*/

import java.util.*;

public class Ques4 {
    static void slidingWindowMax(int arr[],int k){
        int n=arr.length;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.pollFirst();
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]) dq.pollLast();
            dq.offerLast(i);
            if(i>=k-1) System.out.print(arr[dq.peekFirst()]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        slidingWindowMax(arr,k);
    }
}
