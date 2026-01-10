package Jan9;

/*Find the second largest element in an array*/

import java.util.*;

public class Ques5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int largest=-1;
        int secondlargest=-1;
        for(int num:arr){
            if(num>largest){
                secondlargest=largest;
                largest=num;
            }else if(num>secondlargest && num!=largest){
                secondlargest=num;
            }
        }
        System.out.println("Second largest element in the array is "+secondlargest);
    }
}
