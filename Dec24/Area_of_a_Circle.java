package Dec24;/* Write a program to calculate the area of a circle. Take the radius as input
and use the formula:
Area = π * radius^2. */

import java.util.*;
public class Area_of_a_Circle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double area= Math.PI * Math.pow(radius,2);
        System.out.printf("%.2f",area);
    }
}
