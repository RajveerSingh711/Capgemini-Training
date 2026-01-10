package Jan7.Level2;

/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertKmToMiles(double km) =>
Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;
*/

import java.util.*;

public class Ques4 {
    public static double convertKmToMiles(double km){
        return km*0.621371;
    }
    public static double convertMilesToKm(double miles){
        return miles*1.60934;
    }
    public static double convertMetersToFeet(double meters){
        return meters*3.28084;
    }
    public static double convertFeetToMeters(double feet){
        return feet*0.3048;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double km= sc.nextDouble(),miles= sc.nextDouble(),meters=sc.nextDouble(),feet=sc.nextDouble();
        System.out.println("Kilometers to Miles: "+convertKmToMiles(km));
        System.out.println("Miles to Kilometers: "+convertMilesToKm(miles));
        System.out.println("Meters to Feet: "+convertMetersToFeet(meters));
        System.out.println("Feet to Meters: "+convertFeetToMeters(feet));
    }
}
