package Jan6.Level2;

/*Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint =>
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
*/

import java.util.*;

public class Ques10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        if(temp==0) {
            count=1;
        }else{
            while(temp!=0){
                count++;
                temp/=10;
            }
        }
        int[] digits=new int[count];
        temp=n;
        for(int i=0;i<count;i++) {
            digits[i]=temp%10;
            temp/=10;
        }
        int[] frequency=new int[10];
        for(int i=0;i<count;i++) frequency[digits[i]]++;
        for(int i=0;i<10;i++){
            if(frequency[i]>0) System.out.println("Digit "+i+" occurs "+frequency[i]+" time(s)");
        }
    }
}
