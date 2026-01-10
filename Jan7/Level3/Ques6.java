package Jan7.Level3;

/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow()
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
*/

import java.util.*;

public class Ques6 {
    public static int[] findFactors(int n){
        int cnt =0;
        for(int i=1;i<=n;i++){
            if(n%i==0) cnt++;
        }
        int[] factors=new int[cnt];
        int idx=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) factors[idx++]=i;
        }
        return factors;
    }
    public static int greatestFactor(int[] factors){
        int max=factors[0];
        for(int f:factors){
            if(f>max) max=f;
        }
        return max;
    }
    public static int sumOfFactors(int[] factors){
        int sum=0;
        for(int f:factors) sum+=f;
        return sum;
    }
    public static long productOfFactors(int[] factors){
        long prod=1;
        for(int f:factors) prod*=f;
        return prod;
    }
    public static double productOfCubeOfFactors(int[] factors){
        double prod=1;
        for(int f:factors){
            prod*=Math.pow(f,3);
        }
        return prod;
    }
    public static boolean isPerfectNumber(int n,int[] factors){
        int sum=0;
        for(int f:factors){
            if(f!=n) sum+=f;
        }
        return sum==n;
    }
    public static boolean isAbundantNumber(int n,int[] factors){
        int sum=0;
        for(int f:factors){
            if(f!=n) sum+=f;
        }
        return sum>n;
    }
    public static boolean isDeficientNumber(int n,int[] factors){
        int sum=0;
        for(int f:factors){
            if(f!=n) sum+=f;
        }
        return sum<n;
    }
    public static boolean isStrongNumber(int n){
        int temp=n,sum=0;
        while(temp>0){
            int d=temp%10;
            int fact=1;
            for(int i=1;i<=d;i++) fact*=i;
            sum+=fact;
            temp/=10;
        }
        return sum==n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] factors=findFactors(n);
        System.out.print("Factors: ");
        for(int f:factors) System.out.print(f+" ");
        System.out.println();
        System.out.println("Greatest Factor: "+greatestFactor(factors));
        System.out.println("Sum of Factors: "+sumOfFactors(factors));
        System.out.println("Product of Factors: "+productOfFactors(factors));
        System.out.println("Product of Cube of Factors: "+productOfCubeOfFactors(factors));
        System.out.println("Perfect Number: "+isPerfectNumber(n,factors));
        System.out.println("Abundant Number: "+isAbundantNumber(n,factors));
        System.out.println("Deficient Number: "+isDeficientNumber(n,factors));
        System.out.println("Strong Number: "+isStrongNumber(n));
    }
}
