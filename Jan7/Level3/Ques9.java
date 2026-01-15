package Jan7.Level3;

/*Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()
Hint =>
Take inputs for 2 points x1, y1, and x2, y2
Method to find the Euclidean distance between two points and return the distance
distance = (x2-x1)2 +(y2-y1)2
Write a Method to find the equation of a line given two points and return the equation which includes the slope and the y-intercept
The equation of a line is given by the equation y = m*x + b Where m is the slope and b is the y-intercept. So firstly compute the slope using the formulae
m = (y2 - y1)/(x2 - x1)
Post that compute the y-intercept b using the formulae
b = y1 - m*x1
Finally, return an array having slope m and y-intercept b
*/

import java.util.*;

public class Ques9 {
    static double calculateDistance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    static double[] findLineEquation(double x1,double y1,double x2,double y2){
        double slope=(y2-y1)/(x2-x1);
        double intercept=y1-slope*x1;
        return new double[]{slope,intercept};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y1=sc.nextDouble();
        double y2=sc.nextDouble();
        double distance=calculateDistance(x1,y1,x2,y2);
        double[] equation=findLineEquation(x1,y1,x2,y2);
        System.out.println("\nEuclidean Distance = "+distance);
        System.out.println("Equation of Line: y = "+equation[0]+"x + "+equation[1]);
    }
}
