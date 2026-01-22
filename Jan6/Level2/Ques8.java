package Jan6.Level2;

/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines

Hint =>
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student
*/

import java.util.*;

public class Ques8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        for(int i=0;i<n;i++){
            int p=sc.nextInt();
            int c=sc.nextInt();
            int m=sc.nextInt();
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }
        for(int i=0;i<n;i++) {
            int total=physics[i]+chemistry[i]+maths[i];
            percentage[i]=total/3.0;
            if (percentage[i]>=80) grade[i]='A';
            else if(percentage[i]>=70) grade[i]='B';
            else if(percentage[i]>=60) grade[i]='C';
            else if(percentage[i]>=50) grade[i]='D';
            else if(percentage[i]>=40) grade[i]='E';
            else grade[i]='R';
        }
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1)+" | Physics: "+physics[i]+" | Chemistry: "+chemistry[i]+" | Maths: "+maths[i]+" | Percentage: "+String.format("%.2f",percentage[i])+"% | Grade: "+grade[i]);
        }
    }
}
