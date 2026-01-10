package Jan7.Level3;

/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.
*/

import java.util.*;

public class Ques2 {
    public static int countDigits(int n){
        int cnt=0;
        int temp=n;
        while(temp>0){
            cnt++;
            temp/=10;
        }
        return cnt;
    }
    public static int[] storeDigits(int n, int cnt) {
        int[] digits=new int[cnt];
        int i=cnt-1;
        while (n>0){
            digits[i--]=n%10;
            n/=10;
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits){
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=0) return true;
        }
        return false;
    }
    public static boolean isArmstrongNumber(int[] digits){
        int power=digits.length;
        int sum=0;
        for (int i=0;i<digits.length;i++) sum+=Math.pow(digits[i],power);
        int original=0;
        for(int i=0;i<digits.length;i++) original=original*10+digits[i];
        return sum == original;
    }
    public static int[] findLargestAndSecondLargest(int[] digits){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<digits.length;i++){
            if (digits[i]>largest) {
                secondLargest=largest;
                largest=digits[i];
            }else if(digits[i]>secondLargest && digits[i]!=largest) secondLargest = digits[i];
        }
        return new int[]{largest,secondLargest};
    }
    public static int[] findSmallestAndSecondSmallest(int[] digits){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<digits.length;i++) {
            if(digits[i]<smallest){
                secondSmallest=smallest;
                smallest=digits[i];
            }else if(digits[i]<secondSmallest && digits[i]!=smallest) secondSmallest=digits[i];
        }
        return new int[]{smallest,secondSmallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int count=countDigits(number);
        int[] digits=storeDigits(number,count);
        System.out.println("Digit Count: " +count);
        System.out.print("Digits: ");
        for(int num:digits) System.out.print(num+" ");
        System.out.println();
        System.out.println("Duck Number: "+isDuckNumber(digits));
        System.out.println("Armstrong Number: "+isArmstrongNumber(digits));
        int[] large=findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: "+large[0]);
        System.out.println("Second Largest Digit: "+large[1]);
        int[] small=findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: "+small[0]);
        System.out.println("Second Smallest Digit: "+small[1]);
    }
}
