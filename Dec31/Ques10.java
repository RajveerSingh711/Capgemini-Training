package Dec31;

/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.*;

public class Ques10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int height_in_cm=sc.nextInt();
        double height_in_inches=height_in_cm/2.54;
        int height_in_foot=(int)height_in_inches/12;
        int remainingInches=(int)height_in_inches%12;
        System.out.print("Your Height in cm is "+height_in_cm+" while in feet is "+height_in_foot+" and inches is "+remainingInches);
    }
}
