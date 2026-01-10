package Jan8.Level3;

/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint =>
Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
 */

import java.util.*;

public class Ques1 {
    public static String[] calculateBMIAndStatus(double weight,double heightCm){
        double heightM=heightCm/100;
        double bmi=weight/(heightM*heightM);
        String status;
        if(bmi<=18.4) status="Underweight";
        else if(bmi>=18.5 && bmi<=24.9) status="Normal";
        else if(bmi>=25.0 && bmi<=39.9) status="Overweight";
        else status="Obese";
        return new String[]{String.valueOf(heightCm),String.valueOf(weight),String.valueOf(bmi),status};
    }
    public static String[][] processBMI(double[][] data){
        String[][] result = new String[data.length][4];
        for(int i=0;i<data.length;i++){
            String[] temp=calculateBMIAndStatus(data[i][0],data[i][1]);
            result[i]=temp;
        }
        return result;
    }
    public static void display(String[][] result){
        System.out.println("Height\tWeight\tBMI\tStatus");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+"\t"+result[i][1]+"\t"+ result[i][2]+"\t"+ result[i][3]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] data = new double[10][2];
        for(int i=0;i<10;i++){
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
        }
        String[][] result = processBMI(data);
        display(result);
    }
}
