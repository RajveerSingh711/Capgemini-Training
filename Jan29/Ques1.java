package Jan29;

/*1. Problem Statement: Search a Target in a Large Dataset
Objective:
Compare the performance of Linear Search (O(N)) and Binary Search (O(log N)) on different dataset sizes.
Approach:
Linear Search: Scan each element until the target is found.
Binary Search: Sort the data first (O(N log N)), then perform O(log N) search.
Comparative Analysis:
Dataset Size (N)
Linear Search (O(N))
Binary Search (O(log N))
1,000
1ms
0.01ms
10,000
10ms
0.02ms
1,000,000
1s
0.1ms

Expected Result:
Binary Search performs much better for large datasets, provided data is sorted.
*/

import java.util.*;

public class Ques1{
    static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    static int binarySearch(int arr[],int target){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
    public static void runTest(int size){
        Random rand=new Random();
        int[] data=new int[size];
        for(int i=0;i<size;i++) data[i]=rand.nextInt(size*10);
        int target=data[size/2];
        long start=System.nanoTime();
        linearSearch(data,target);
        long end=System.nanoTime();
        long linearTime=end-start;
        Arrays.sort(data);
        start=System.nanoTime();
        binarySearch(data,target);
        end=System.nanoTime();
        long binaryTime=end-start;
        System.out.println("Dataset Size: "+size);
        System.out.println("Linear Search Time: "+linearTime/1_000_000.0+" ms");
        System.out.println("Binary Search Time: "+binaryTime/1_000_000.0+" ms");
        System.out.println("-----------------------------------");
    }
    public static void main(String[] args){
        int[] sizes={1000,10000,1000000};
        for (int size:sizes) runTest(size);
    }
}
