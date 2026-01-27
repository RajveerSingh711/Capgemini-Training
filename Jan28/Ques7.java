package Jan28;

/*Check for a Pair with Given Sum in an Array
Problem: Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.
Hint: Store visited numbers in a hash map and check if target - current_number exists in the map.
*/

import java.util.*;

public class Ques7 {
    static boolean hasPairWithSum(int[] arr,int k){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(k-num)) return true;
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={8,4,1,6};
        int k=10;
        System.out.println(hasPairWithSum(arr,k));
    }
}
