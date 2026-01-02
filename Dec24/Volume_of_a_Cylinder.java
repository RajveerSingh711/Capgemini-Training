package Dec24;/* Write a program to calculate the volume of a cylinder. Take the radius and
height as inputs and use the formula:
Volume = π * radius^2 * height. */

import java.util.*;
public class Volume_of_a_Cylinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        int height=sc.nextInt();
        double volume_of_cylinder=Math.PI*Math.pow(radius,2)*height;
        System.out.printf("%.2f",volume_of_cylinder);
    }
}
