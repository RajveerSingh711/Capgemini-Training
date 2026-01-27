package Jan28;

/*Longest Consecutive Sequence
Problem: Given an unsorted array, find the length of the longest consecutive elements sequence.
Hint: Use a hash map to store elements and check for consecutive elements efficiently.
*/

import java.util.*;

public class Ques8 {
    static int longestConsecutive(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr) set.add(num);
        int longest=0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int curr=num;
                int count=1;
                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void main(String[] args){
        int[] arr={100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
