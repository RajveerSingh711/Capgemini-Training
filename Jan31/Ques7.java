package Jan31;

/*A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.
Hint:
Create a count array to store the frequency of each age.
Compute cumulative frequencies to determine positions.
Place elements in their correct positions in the output array.
*/

import java.util.*;

public class Ques7 {
    static void countingSort(int arr[]){
        int min=10;
        int max=18;
        int range=max-min+1;
        int[] count=new int[range];
        int[] output=new int[arr.length];
        for(int age:arr) count[age-min]++;
        for(int i=1;i<range;i++) count[i]+=count[i-1];
        for(int i=arr.length-1;i>=0;i--){
            output[count[arr[i]-min]-1]=arr[i];
            count[arr[i]-min]--;
        }
        for(int i=0;i<arr.length;i++) arr[i]=output[i];
    }
    public static void main(String[] args){
        int[] ages={14,12,15,10,18,13,12,11,16};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(ages));
        countingSort(ages);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(ages));
    }
}
