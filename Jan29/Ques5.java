package Jan29;

/*5. Problem Statement: Recursive vs Iterative Fibonacci Computation
Objective:
Compare Recursive (O(2ⁿ)) vs Iterative (O(N)) Fibonacci solutions.
Approach:
Recursive:
public static int fibonacciRecursive(int n) {
    if (n <= 1) return n;
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
}

Iterative:
public static int fibonacciIterative(int n) {
    int a = 0, b = 1, sum;
    for (int i = 2; i <= n; i++) {
        sum = a + b;
        a = b;
        b = sum;
    }
    return b;
}
Comparative Analysis:
Fibonacci (N)
Recursive (O(2ⁿ))
Iterative (O(N))
10
1ms
0.01ms
30
5s
0.05ms
50
Unfeasible (>1hr)
0.1ms

Expected Result:
Recursive approach is infeasible for large values of N due to exponential growth.
The iterative approach is significantly faster and memory-efficient.
*/

import java.util.*;

public class Ques5 {
    public static long fibonacciRecursive(int n){
        if(n<=1) return n;
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }
    public static long fibonacciIterative(int n){
        if(n<=1) return n;
        long a=0,b=1,sum=0;
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
    public static void runTest(int n){
        System.out.println("\nFibonacci Number: "+n);
        if(n<=40){
            long start=System.nanoTime();
            long result=fibonacciRecursive(n);
            long end=System.nanoTime();
            System.out.println("Recursive Result: "+result);
            System.out.println("Recursive Time: "+(end-start)/1_000_000.0+" ms");
        }else System.out.println("Recursive: Skipped (Too Slow)");
        long start=System.nanoTime();
        long result=fibonacciIterative(n);
        long end=System.nanoTime();
        System.out.println("Iterative Result: "+result);
        System.out.println("Iterative Time: "+(end-start)/1_000_000.0+" ms");
        System.out.println("--------------------------------");
    }
    public static void main(String[] args){
        int[] testValues={10,30,50};
        for(int n:testValues) runTest(n);
    }
}
