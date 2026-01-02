package Jan2.Level1;

/*Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
*/

import java.util.*;

public class Ques1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s;
        if(n%5==0) s="Yes";
        else s="No";
        System.out.print("Is the number "+n+" divisible by 5? "+s);
    }
}
