package Jan31;

/*A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
Hint:
Divide the array into sorted and unsorted parts.
Pick an element from the unsorted part and insert it into its correct position in the sorted part.
Repeat for all elements.
*/

import java.util.*;

public class Ques2 {
    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args){
        int[] employeeIDs={104,101,109,102,105};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(employeeIDs));
        insertionSort(employeeIDs);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(employeeIDs));
    }
}
