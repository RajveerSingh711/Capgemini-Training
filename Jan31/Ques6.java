package Jan31;

/*A company receives job applications with different expected salary demands. Implement Heap Sort to sort these salary demands in ascending order.
Hint:
Build a Max Heap from the array.
Extract the largest element (root) and place it at the end.
Reheapify the remaining elements and repeat until sorted.
*/

import java.util.*;

public class Ques6 {
    static void heapSort(int arr[]){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    static void heapify(int arr[],int n,int i){
        int left=2*i+1,right=2*i+2,largest=i;
        if(left<n && arr[left]>arr[largest]) largest=left;
        if(right<n && arr[right]>arr[largest]) largest=right;
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }
    }
    public static void main(String[] args){
        int[] salaries={55000,72000,48000,90000,61000,53000};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(salaries));
        heapSort(salaries);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(salaries));
    }
}
