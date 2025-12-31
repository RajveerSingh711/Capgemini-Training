package Dec24;/* Write a program to calculate the perimeter of a rectangle. Take the length
and width as inputs and use the formula:
Perimeter = 2 * (length + width). */

import java.util.*;
public class Perimeter_of_a_Rectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int width=sc.nextInt();
        int perimeter = 2*(length+width);
        System.out.print(perimeter);
    }
}
