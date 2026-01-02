package Jan2.Level1;

/*Write a program to check for the natural number and write the sum of n natural numbers
Hint =>
A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
A sum of n natural numbers is n * (n+1) / 2
I/P => number
O/P => If the number is a positive integer then the output is
The sum of ___ natural numbers is ___
Otherwise
The number ___ is not a natural number
*/

import java.util.*;

public class Ques4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1) System.out.print("The number "+n+" is not a natural number");
        else{
            int sum=0;
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            System.out.print("The sum of "+n+" natural numbers is "+sum);
        }
    }
}
