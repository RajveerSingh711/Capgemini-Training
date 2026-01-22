package Jan8.Level2;

/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint =>
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format.
*/

import java.util.*;

public class Ques10 {
    static int[][] generateScores(int n){
        int[][] marks=new int[n][3];
        for(int i=0;i<n;i++){
            marks[i][0]=(int)(Math.random()*90)+10;
            marks[i][1]=(int)(Math.random()*90)+10;
            marks[i][2]=(int)(Math.random()*90)+10;
        }
        return marks;
    }
    static double[][] calculateResult(int[][] marks){
        int n=marks.length;
        double[][] result=new double[n][3];
        for(int i=0;i<n;i++){
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            double avg=total/3.0;
            double percent=(total/300.0)*100;
            result[i][0]=total;
            result[i][1]=Math.round(avg*100.0)/100.0;
            result[i][2]=Math.round(percent*100.0)/100.0;
        }
        return result;
    }
    static String[] calculateGrade(double[][] result){
        int n=result.length;
        String[] grade=new String[n];
        for(int i=0;i<n;i++){
            double p=result[i][2];
            if(p>=80) grade[i]="A";
            else if (p>=70) grade[i]="B";
            else if(p>=60) grade[i]="C";
            else if(p>=50) grade[i]="D";
            else if(p>=40) grade[i]="E";
            else grade[i] = "R";
        }
        return grade;
    }
    static void display(int[][] marks,double[][] result,String[] grade){
        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-----------------------------------------------------------");
        for(int i=0;i<marks.length;i++){
            System.out.println((i+1)+"\t"+marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+"\t"+(int)result[i][0]+"\t"+result[i][1]+"\t"+result[i][2]+"\t"+grade[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] marks=generateScores(n);
        double[][] result=calculateResult(marks);
        String[] grade=calculateGrade(result);
        display(marks,result,grade);
    }
}
