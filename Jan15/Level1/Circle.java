package Jan15.Level1;

/*Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.
 */

import java.util.*;

public class Circle {
    int radius;
    void CalculateArea(){
        double area=Math.PI*radius*radius;
        System.out.println("Area of Circle: "+area);
    }
    void CalculateCircumference(){
        double circumference=Math.PI*2*radius;
        System.out.println("Circumference of Circle: "+circumference);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        c.radius=sc.nextInt();
        c.CalculateArea();
        c.CalculateCircumference();
    }
}
