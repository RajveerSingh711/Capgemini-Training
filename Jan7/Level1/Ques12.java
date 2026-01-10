package Jan7.Level1;

/*Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint =>
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/

import java.util.*;

public class Ques12 {
    public static double[] calculateTrigonometricFunctions(double angle){
        double radians=Math.toRadians(angle);
        double sin=Math.sin(radians);
        double cos=Math.cos(radians);
        double tan=Math.tan(radians);
        return new double[]{sin,cos,tan};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double angle=sc.nextDouble();
        double[] result=calculateTrigonometricFunctions(angle);
        System.out.println("Sine: "+result[0]);
        System.out.println("Cosine: "+result[1]);
        System.out.println("Tangent: "+result[2]);
    }
}
