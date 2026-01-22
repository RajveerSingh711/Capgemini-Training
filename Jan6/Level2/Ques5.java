package Jan6.Level2;

/*Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint =>
Take user input for a number.
Find the count of digits in the number.
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order
*/

import java.util.*;

public class Ques5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        int temp=n;
        while(temp>0){
            cnt++;
            temp/=10;
        }
        int arr[]=new int[cnt];
        temp=n;
        int i=0;
        while(temp>0){
            arr[i++]=temp%10;
            temp/=10;
        }
        System.out.print("Original digit: ");
        for(int num:arr) System.out.print(num);
        System.out.println();
        System.out.print("Reversed digit: ");
        for(i=cnt-1;i>=0;i--) System.out.print(arr[i]);
    }
}
