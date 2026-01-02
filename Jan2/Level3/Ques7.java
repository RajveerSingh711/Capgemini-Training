package Jan2.Level3;

/*Create a program to find the BMI of a person
Hint =>
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
*/

import java.util.*;

public class Ques7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double weight=sc.nextDouble();
        double heightInCM=sc.nextDouble();
        double heightInM=heightInCM/100;
        double BMI=weight/(heightInM*heightInM);
        if(BMI<=18.4) System.out.println("Underweight");
        else if(BMI>=18.5 && BMI<=24.9) System.out.println("Normal");
        else if(BMI>=25.0 && BMI<=34.9) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
