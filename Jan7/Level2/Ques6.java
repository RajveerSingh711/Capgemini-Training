package Jan7.Level2;

/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertFarhenheitToCelsius(double farhenheit) =>
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462;
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541;
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172;
*/

import java.util.*;

public class Ques6 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32)*5/9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius*9/5)+32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds*0.453592;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms*2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons*3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters*0.264172;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit=sc.nextDouble(),celsius=sc.nextDouble(),pounds=sc.nextDouble(),kilograms=sc.nextDouble(),gallons=sc.nextDouble(),liters=sc.nextDouble();
        System.out.println(convertFahrenheitToCelsius(fahrenheit));
        System.out.println(convertCelsiusToFahrenheit(celsius));
        System.out.println(convertPoundsToKilograms(pounds));
        System.out.println(convertKilogramsToPounds(kilograms));
        System.out.println(convertGallonsToLiters(gallons));
        System.out.println(convertLitersToGallons(liters));
    }
}