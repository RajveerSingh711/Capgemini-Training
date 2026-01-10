package Jan9;

/* Rotate an array left/right*/

import java.util.*;

public class Ques26 {
    public static void rotateLeft(int arr[]){
        if(arr.length>0){
            int temp=arr[0];
            for(int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;
        }
        for(int num:arr) System.out.print(num+" ");
    }
    public static void rotateRight(int arr[]){
        if(arr.length>0){
            int temp=arr[arr.length-1];
            for(int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
        }
        for(int num:arr) System.out.print(num+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]= sc.nextInt();
        rotateLeft(arr);
        System.out.println();
        rotateRight(arr);
    }
}
