package Jan7.Level3;

/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
*/

import java.util.*;

public class Ques3 {
    public static int countDigits(int n){
        int cnt=0;
        int temp=n;
        while(temp>0){
            cnt++;
            temp/=10;
        }
        return cnt;
    }
    public static int[] storeDigits(int n,int cnt){
        int[] digits=new int[cnt];
        int i=cnt-1;
        while(n>0){
            digits[i--]=n%10;
            n/=10;
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits){
        int sum=0;
        for(int d:digits) sum+=d;
        return sum;
    }

    public static int sumOfSquares(int[] digits){
        int sum=0;
        for(int d:digits){
            sum+=Math.pow(d,2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int n,int[] digits){
        int sum=sumOfDigits(digits);
        return n%sum==0;
    }
    public static int[][] digitFrequency(int[] digits){
        int[][] freq=new int[10][2];
        for(int i=0;i<10;i++){
            freq[i][0]=i;
            freq[i][1]=0;
        }
        for(int d:digits){
            freq[d][1]++;
        }
        return freq;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=countDigits(n);
        int[] digits=storeDigits(n,cnt);
        System.out.println("Digit Count: "+cnt);
        System.out.print("Digits: ");
        for(int d:digits) System.out.print(d+" ");
        System.out.println();
        System.out.println("Sum of Digits: "+sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: "+sumOfSquares(digits));
        System.out.println("Harshad Number: "+isHarshadNumber(n,digits));
        int[][] freq=digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for(int i=0;i<10;i++){
            if(freq[i][1]>0)
                System.out.println(freq[i][0]+" -> "+freq[i][1]);
        }
    }
}
