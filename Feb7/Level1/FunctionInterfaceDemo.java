package Feb7.Level1;

/*Function Interface:
Develop a program to calculate the area of a circle using the Function interface with the
radius as input.
*/

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args){
        Function<Double,Double> areaOfCircle=radius->Math.PI*radius*radius;
        double radius=7.0;
        double area=areaOfCircle.apply(radius);
        System.out.println("Radius: "+radius);
        System.out.println("Area of Circle: "+area);
    }
}