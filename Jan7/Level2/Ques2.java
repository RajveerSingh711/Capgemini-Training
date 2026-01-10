package Jan7.Level2;

/*Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
Hint =>
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
Compare the two results and print the result
*/

import java.util.*;

public class Ques2 {
    public static int sumUsingRecursion(int n){
        if(n==1) return 1;
        return n+sumUsingRecursion(n-1);
    }
    public static int sumUsingFormula(int n){
        return n*(n-1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int recursiveSum=sumUsingRecursion(n);
        int formulaSum=sumUsingFormula(n);
        if(recursiveSum==formulaSum) System.out.println("Both results are correct and equal. "+recursiveSum);
        else System.out.println("Results do not match."+recursiveSum+" and "+formulaSum);
    }
}
