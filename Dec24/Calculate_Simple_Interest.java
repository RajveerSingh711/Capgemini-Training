package Dec24;/* Write a program to calculate simple interest using the formula:
Simple Interest = (Principal * Rate * Time) / 100.
Take Principal, Rate, and Time as inputs from the user. */

import java.util.*;
public class Calculate_Simple_Interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        int simple_interest=(principal*rate*time)/100;
        System.out.print(simple_interest);
    }
}
