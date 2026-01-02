package Dec31;

/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.*;

public class Ques12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        int areaOfTriangle=(base*height)/2;
        System.out.print("The area of Triangle where base is "+base+" and height is "+height+" is "+areaOfTriangle);
    }
}
