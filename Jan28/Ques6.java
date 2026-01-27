package Jan28;

/*Find All Subarrays with Zero Sum
Problem: Given an array, find all subarrays whose elements sum up to zero.
Hint: Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists.
*/

import java.util.*;

public class Ques6 {
    static void findZeroSumSubarrays(int arr[]){
        Map<Integer,List<Integer>> map=new HashMap<>();
        int sum=0;
        map.put(0,new ArrayList<>(Arrays.asList(-1)));
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                for(int startIndex:map.get(sum)){
                    System.out.println("Subarray found from index "+(startIndex+1)+" to "+i);
                }
            }
            map.computeIfAbsent(sum,k->new ArrayList<>()).add(i);
        }
    }
    public static void main(String[] args){
        int[] arr={3,4,-7,3,1,3,1,-4};
        findZeroSumSubarrays(arr);
    }
}
