package Jan7.Level1;

/*Level 1 Practice Programs
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint =>
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
*/

import java.util.*;

public class Ques1 {
    public static double calculateSimpleInterest(double principal,double rate,double time){
        double simpleInterest=(principal*rate*time)/100.00;
        return simpleInterest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double principal=sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();
        double simpleInterest=calculateSimpleInterest(principal,rate,time);
        System.out.print("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
    }
}
