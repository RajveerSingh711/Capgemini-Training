package Feb1;

/*Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].
*/

import java.util.*;

public class Ques3 {
    static void rotateLeft(List<Integer> arr,int k){
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<k;i++) temp.add(arr.get(i));
        for(int i=k;i<arr.size();i++) arr.set(i-k,arr.get(i));
        for(int i=0;i<temp.size();i++) arr.set(arr.size()-k+i,temp.get(i));
    }
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        rotateLeft(list,2);
        System.out.println(list);
    }
}
