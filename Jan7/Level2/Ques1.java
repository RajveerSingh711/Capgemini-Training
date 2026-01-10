package Jan7.Level2;

/*Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint =>
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array.
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method*/

import java.util.*;

public class Ques1 {
    public static int[] findFactors(int num) {
        int count=0;
        for (int i=1;i<=num;i++){
            if(num%i==0) count++;
        }
        int[] factors=new int[count];
        int index=0;
        for(int i=1;i<=num;i++) {
            if(num%i==0) factors[index++]=i;
        }
        return factors;
    }
    public static int sum(int[] arr){
        int s=0;
        for(int x:arr) s+=x;
        return s;
    }
    public static long product(int[] arr) {
        long p=1;
        for (int x:arr) p*=x;
        return p;
    }
    public static double sumOfSquares(int[] arr) {
        double s=0;
        for(int x:arr) s+=Math.pow(x,2);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] factors=findFactors(num);
        System.out.println("Factors:");
        for (int f:factors) System.out.print(f+" ");
        System.out.println("\nSum = "+sum(factors));
        System.out.println("Sum of Squares = "+sumOfSquares(factors));
        System.out.println("Product = "+product(factors));
    }
}
