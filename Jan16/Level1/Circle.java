package Jan16.Level1;

/*Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
*/

import java.util.*;

public class Circle {
    double radius;
    double area;
    Circle(){
        radius=1;
    }
    Circle(double r){
        this.radius=r;
    }
    void calculateArea(){
        area=Math.PI*radius*radius;
    }
    void display(){
        System.out.println("Radius: "+radius);
        System.out.println("Area of circle: "+area);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Circle c1=new Circle();
        c1.calculateArea();
        c1.display();
        double r=sc.nextDouble();
        Circle c2=new Circle(r);
        c2.calculateArea();
        c2.display();
    }
}
