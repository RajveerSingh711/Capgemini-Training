package Jan7.Level3;

/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed.
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
*/

import java.util.*;

public class Ques4 {
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
    public static int[] reverseDigits(int[] digits){
        int[] rev = new int[digits.length];
        for(int i=0;i<digits.length;i++) rev[i]=digits[digits.length-1-i];
        return rev;
    }
    public static boolean compareArrays(int[] a,int[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) {
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int[] digits){
        int[] reversed=reverseDigits(digits);
        return compareArrays(digits,reversed);
    }
    public static boolean isDuckNumber(int[] digits){
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=countDigits(number);
        int[] digits=storeDigits(number,count);
        System.out.println("Digit Count: "+count);
        System.out.print("Digits: ");
        for(int num:digits) System.out.print(num+" ");
        System.out.println();
        int[] reversed=reverseDigits(digits);
        System.out.print("Reversed Digits: ");
        for(int num:reversed) System.out.print(num+" ");
        System.out.println();
        System.out.println("Palindrome Number: "+isPalindrome(digits));
        System.out.println("Duck Number: "+isDuckNumber(digits));
    }
}
