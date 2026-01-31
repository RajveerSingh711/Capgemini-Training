package Jan31;

/*A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.
Hint:
Divide the array into two halves recursively.
Sort both halves individually.
Merge the sorted halves by comparing elements.
*/

import java.util.*;

public class Ques3 {
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
        for(int i=0;i<n1;i++) L[i]=arr[i+left];
        for(int i=0;i<n2;i++) R[i]=arr[mid+1+i];
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]) arr[k++]=L[i++];
            else arr[k++]=R[j++];
        }
        while(i<n1) arr[k++]=L[i++];
        while(j<n2) arr[k++]=R[j++];
    }
    public static void main(String[] args){
        int[] bookPrices={450,299,799,150,620,410};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bookPrices));
        mergeSort(bookPrices,0,bookPrices.length-1);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bookPrices));
    }
}
