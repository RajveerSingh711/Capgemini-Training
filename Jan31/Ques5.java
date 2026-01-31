package Jan31;

/*A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
Hint:
Find the minimum element in the array.
Swap it with the first unsorted element.
Repeat the process for the remaining elements.
*/

import java.util.*;

public class Ques5 {
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int x=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[x]>arr[j]){
                    x=j;
                }
            }
            if(x!=i){
                int temp=arr[i];
                arr[i]=arr[x];
                arr[x]=temp;
            }
        }
    }
    public static void main(String[] args){
        int[] scores={78,92,65,88,70,95};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(scores));
        selectionSort(scores);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(scores));
    }
}
