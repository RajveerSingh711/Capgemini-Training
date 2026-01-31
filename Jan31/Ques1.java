package Jan31;

/*Problem Statement:
A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.
Hint:
Traverse through the array multiple times.
Compare adjacent elements and swap if needed.
Repeat the process until no swaps are required.
*/

import java.util.*;

public class Ques1 {
    static void bubbleSort(int arr[]){
        boolean flag;
        for(int i=0;i<arr.length;i++){
            flag=true;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag) break;
        }
    }
    public static void main(String[] args){
        int[] marks={78,45,90,32,67,88};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(marks));
        bubbleSort(marks);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(marks));
    }
}
