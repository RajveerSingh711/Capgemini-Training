package Jan9;

/*Find missing number in an array*/

import java.util.*;

public class Ques22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int min=arr[0],max=arr[0];
        int sum1=0;
        for(int num:arr){
            min=Math.min(num,min);
            max=Math.max(num,max);
            sum1+=num;
        }
        int sum2=0;
        while(min<=max){
            sum2+=min;
            min++;
        }
        System.out.print("Missing element: "+(sum2-sum1));
    }
}
