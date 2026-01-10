package Jan7.Level2;

/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertYardsToFeet(double yards) =>
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
*/

import java.util.*;

public class Ques5 {
    public static double convertYardsToFeet(double yards) {
        return yards*3;
    }
    public static double convertFeetToYards(double feet) {
        return feet*0.333333;
    }
    public static double convertMetersToInches(double meters) {
        return meters*39.3701;
    }
    public static double convertInchesToMeters(double inches) {
        return inches*0.0254;
    }
    public static double convertInchesToCentimeters(double inches) {
        return inches*2.54;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double yards=sc.nextDouble(),feet=sc.nextDouble(),meters=sc.nextDouble(),inches=sc.nextDouble();
        System.out.println("Yards to Feet: "+convertYardsToFeet(yards));
        System.out.println("Feet to Yards: "+convertFeetToYards(feet));
        System.out.println("Meters to Inches: "+convertMetersToInches(meters));
        System.out.println("Inches to Meters: "+convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters: "+convertInchesToCentimeters(inches));
    }
}
