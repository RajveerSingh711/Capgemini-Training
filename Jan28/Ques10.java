package Jan28;

/*Two Sum Problem
Problem: Given an array and a target sum, find two indices such that their values add up to the target.
Hint: Use a hash map to store the index of each element as you iterate. Check if target - current_element exists in the map.
*/

import java.util.*;

public class Ques10 {
    static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(map.containsKey(needed)) return new int[]{map.get(needed),i};
            map.put(nums[i],i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        int[] nums={2, 7, 11, 15};
        int target=9;
        int[] result=twoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }
}
