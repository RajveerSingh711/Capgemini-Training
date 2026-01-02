package Dec31;

/* Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.*;

public class Ques14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int distance_in_foot=sc.nextInt();
        int distance_in_yard=distance_in_foot/3;
        int distance_in_miles=distance_in_foot/(3*1760);
        System.out.print("The distance of "+distance_in_foot+" feet is "+distance_in_yard+" in yard and in miles is "+distance_in_miles);
    }
}
