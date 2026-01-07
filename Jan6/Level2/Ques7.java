package Jan6.Level2;

/*Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint =>
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
*/

import java.util.*;

public class Ques7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[][] personData=new double[n][3];
        String[] weightStatus=new String[n];
        for (int i=0;i<n;i++) {
            double weight=sc.nextDouble();
            double height=sc.nextDouble();
            personData[i][0]=weight;
            personData[i][1]=height;
        }
        for(int i=0;i<n;i++){
            double weight=personData[i][0];
            double height=personData[i][1];
            double bmi=weight/(height*height);
            personData[i][2]=bmi;
            if (bmi<=18.4) weightStatus[i]="Underweight";
            else if(bmi>=18.5 && bmi<=24.9) weightStatus[i]="Normal";
            else if(bmi>=25.0 && bmi<=39.9) weightStatus[i]="Overweight";
            else weightStatus[i]="Obese";
        }
        for (int i=0;i<n;i++){
            System.out.println("Person "+(i+1)+" | Height: "+personData[i][1]+" m"+" | Weight: "+personData[i][0]+" kg"+" | BMI: "+String.format("%.2f",personData[i][2])+" | Status: "+weightStatus[i]);
        }
    }
}
