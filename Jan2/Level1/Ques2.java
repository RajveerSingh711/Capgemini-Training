package Jan2.Level1;

/*Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
*/

import java.util.*;

public class Ques2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
        String s;
        if(num1<num2 && num1<num3){
            s="Yes";
        }else{
            s="No";
        }
        System.out.print("Is the first number the smallest? "+s);
    }
}
