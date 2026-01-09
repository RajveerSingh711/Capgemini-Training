package Level1;

/*Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop
*/

import java.util.*;

public class Ques7 {
    public static int findSum(int n){
        int sum=0;
        for(int i=1;i<=sum;i++) sum+=i;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=sc.nextInt();
        System.out.print("Sum of "+n+" natural numbers is "+ans);
    }
}
