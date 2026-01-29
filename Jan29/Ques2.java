package Jan29;

/*2. Problem Statement: Sorting Large Data Efficiently
Objective:
Compare sorting algorithms Bubble Sort (O(N²)), Merge Sort (O(N log N)), and Quick Sort (O(N log N)).
Approach:
Bubble Sort: Repeated swapping (inefficient for large data).
Merge Sort: Divide & Conquer approach (stable).
Quick Sort: Partition-based approach (fast but unstable).



Comparative Analysis:
Dataset Size (N)
Bubble Sort (O(N²))
Merge Sort (O(N log N))
Quick Sort (O(N log N))
1,000
50ms
5ms
3ms
10,000
5s
50ms
30ms
1,000,000
Unfeasible (>1hr)
3s
2s

Expected Result:
Bubble Sort is impractical for large datasets.
Merge Sort & Quick Sort perform well.
*/

import java.util.*;

public class Ques2 {
    static void bubbleSort(int arr[]){
        boolean flag;
        for(int i=0;i< arr.length;i++){
            flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag) break;
        }
    }
    static void mergeSort(int arr[],int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    static void merge(int arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] L=new int[n1];
        int[] R=new int[n2];
        System.arraycopy(arr,left,L,0,n1);
        System.arraycopy(arr,mid+1,R,0,n2);
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]) arr[k++]=L[i++];
            else arr[k++]=R[j++];
        }
        while(i<n1) arr[k++]=L[i++];
        while(j<n2) arr[k++]=R[j++];
    }
    static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void runTest(int size) {
        Random rand=new Random();
        int[] original=new int[size];
        for(int i=0;i<size;i++) original[i]=rand.nextInt(size*10);
        System.out.println("\nDataset Size: "+size);
        if (size<=10000){
            int[] bubbleArray=Arrays.copyOf(original,size);
            long start=System.nanoTime();
            bubbleSort(bubbleArray);
            long end=System.nanoTime();
            System.out.println("Bubble Sort Time: "+(end-start)/1_000_000.0+" ms");
        }else System.out.println("Bubble Sort Time: Skipped (Too Slow)");
        int[] mergeArray=Arrays.copyOf(original,size);
        long start=System.nanoTime();
        mergeSort(mergeArray,0,size-1);
        long end=System.nanoTime();
        System.out.println("Merge Sort Time: "+(end-start)/1_000_000.0+" ms");
        int[] quickArray=Arrays.copyOf(original,size);
        start=System.nanoTime();
        quickSort(quickArray,0,size-1);
        end=System.nanoTime();
        System.out.println("Quick Sort Time: "+(end-start)/1_000_000.0+" ms");
        System.out.println("--------------------------------");
    }
    public static void main(String[] args){
        int[] sizes={1000,10000,1000000};
        for(int size:sizes) runTest(size);
    }
}
