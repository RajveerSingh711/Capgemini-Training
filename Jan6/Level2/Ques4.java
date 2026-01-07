package Jan6.Level2;

/*Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number
Hint =>
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements.
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number
*/

import java.util.*;

public class Ques4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=10;
        int arr[]=new int[size];
        int i=0;
        while(n!=0){
            if (i==size){
                size=size+10;
                int temp[]=new int[size];
                for(int j=0;j<i;j++) temp[j]=arr[j];
                arr=temp;
            }
            arr[i++]=n%10;
            n/=10;
        }
        int largest=0,secondLargest=0;
        for (int j=0;j<i;j++){
            int num=arr[j];
            if(num>largest){
                secondLargest=largest;
                largest=num;
            } else if(num>secondLargest && num<largest) secondLargest=num;
        }
        System.out.println("Largest digit: "+largest);
        System.out.println("Second largest digit: "+secondLargest);
    }
}
