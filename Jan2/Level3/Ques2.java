package Jan2.Level3;

/*Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
 */

import java.util.*;

public class Ques2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year>=1582 && (year%400==0 || (year%4==0 && year%100!=0))){
            System.out.println(year+" is a Leap Year.");
        }else{
            System.out.println(year+" is NOT a Leap Year.");
        }
    }
}
