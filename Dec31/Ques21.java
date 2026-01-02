package Dec31;

/* Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
Hint =>
Create a fahrenheit variable and take the user's input
User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
I/P => fahrenheit
O/P => The ____ fahrenheit is _____ celsius
*/

import java.util.*;

public class Ques21 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int fahrenheit=sc.nextInt();
        int celsius=((fahrenheit-32)*5)/9;
        System.out.print("The "+fahrenheit+" fahrenheit is "+celsius+" celsius");
    }
}
