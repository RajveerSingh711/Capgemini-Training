package Jan7.Level3;

/*Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint =>
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
*/

import java.util.*;

public class Ques11 {
    static int[][] generateEmployeeData(int employeeCount){
        int[][] employeeData=new int[employeeCount][2];
        for(int i=0;i<employeeCount;i++) {
            employeeData[i][0]=(int)(Math.random()*90000)+10000;
            employeeData[i][1]=(int)(Math.random()*10)+1;
        }
        return employeeData;
    }
    static double[][] calculateBonusAndNewSalary(int[][] employeeData){
        double[][] salaryDetails=new double[employeeData.length][2];
        for (int i=0;i<employeeData.length;i++){
            int oldSalary=employeeData[i][0];
            int yearsOfService=employeeData[i][1];
            double bonusRate=(yearsOfService>5)?0.05:0.02;
            double bonusAmount=oldSalary*bonusRate;
            double newSalary=oldSalary+bonusAmount;
            salaryDetails[i][0]=newSalary;
            salaryDetails[i][1]=bonusAmount;
        }
        return salaryDetails;
    }
    static void displaySalaryReport(int[][] employeeData,double[][] salaryDetails){
        double totalOldSalary=0;
        double totalNewSalary=0;
        double totalBonus=0;
        System.out.println("Emp\tOldSal\tYears\tBonus\tNewSal");
        for(int i=0;i<employeeData.length;i++){
            int oldSalary=employeeData[i][0];
            int years=employeeData[i][1];
            double bonus=salaryDetails[i][1];
            double newSalary=salaryDetails[i][0];
            totalOldSalary+=oldSalary;
            totalBonus+=bonus;
            totalNewSalary+=newSalary;
            System.out.println((i+1)+"\t"+oldSalary+"\t"+years+"\t"+Math.round(bonus)+"\t"+Math.round(newSalary));
        }
        System.out.println("\n---------------------------------------");
        System.out.println("Total Old Salary  : "+Math.round(totalOldSalary));
        System.out.println("Total Bonus Paid : "+Math.round(totalBonus));
        System.out.println("Total New Salary : "+Math.round(totalNewSalary));
    }
    public static void main(String[] args) {
        final int EMPLOYEE_COUNT=10;
        int[][] employeeData=generateEmployeeData(EMPLOYEE_COUNT);
        double[][] salaryDetails=calculateBonusAndNewSalary(employeeData);
        displaySalaryReport(employeeData,salaryDetails);
    }
}
