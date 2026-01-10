package Jan7.Level1;

/*Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint =>
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor)
*/

import java.util.*;

public class Ques10 {
    public static int[] findRemainderAndQuotient(int number,int divisor){
        int eachChildGets=number/divisor;
        int remaining=number%divisor;
        return new int[]{eachChildGets,remaining};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chocolates=sc.nextInt();
        int children=sc.nextInt();
        int result[]=findRemainderAndQuotient(chocolates,children);
        System.out.println("Each children gets "+result[0]+" while remaining chocolates are "+result[1]);
    }
}
