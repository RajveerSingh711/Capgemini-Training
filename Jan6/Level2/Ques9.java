package Jan6.Level2;

/*Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint =>
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students
*/

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] marks=new int[n][3];
        double[] percentage=new double[n];
        char[] grade=new char[n];
        for(int i=0;i<n;i++){
            int p=sc.nextInt();
            int c=sc.nextInt();
            int m=sc.nextInt();
            marks[i][0]=p;
            marks[i][1]=c;
            marks[i][2]=m;
        }
        for(int i=0;i<n;i++) {
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            percentage[i]=total/3.0;
            if (percentage[i]>=80) grade[i]='A';
            else if(percentage[i]>=70) grade[i]='B';
            else if(percentage[i]>=60) grade[i]='C';
            else if(percentage[i]>=50) grade[i]='D';
            else if(percentage[i]>=40) grade[i]='E';
            else grade[i]='R';
        }
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1)+" | Physics: "+marks[i][0]+" | Chemistry: "+marks[i][1]+" | Maths: "+marks[i][2]+" | Percentage: "+String.format("%.2f",percentage[i])+"% | Grade: "+grade[i]);
        }
    }
}
