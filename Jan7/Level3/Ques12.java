package Jan7.Level3;

/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and the percentage score

Hint =>
Take input for the number of students
Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using the Math.round() method.
Finally, write a Method to display the scorecard of all students with their scores, total, average, and percentage in a tabular format using "\t".
 */

import java.util.*;

public class Ques12 {
    static int[][] generatePCMScores(int studentCount){
        int[][] pcmScores=new int[studentCount][3];
        for(int i=0;i<studentCount;i++){
            pcmScores[i][0]=(int)(Math.random()*90)+10;
            pcmScores[i][1]=(int)(Math.random()*90)+10;
            pcmScores[i][2]=(int)(Math.random()*90)+10;
        }
        return pcmScores;
    }
    static double[][] calculateResults(int[][] pcmScores) {
        double[][] results=new double[pcmScores.length][3];
        for(int i=0;i<pcmScores.length;i++){
            int total=pcmScores[i][0]+pcmScores[i][1]+pcmScores[i][2];
            double average=total/3.0;
            double percentage=(total/300.0)*100;
            results[i][0]=total;
            results[i][1]=Math.round(average*100.0)/100.0;
            results[i][2]=Math.round(percentage*100.0)/100.0;
        }
        return results;
    }
    static void displayScoreCard(int[][] pcmScores,double[][] results){
        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\t%\t");
        for(int i=0;i<pcmScores.length;i++){
            System.out.println((i+1)+"\t"+pcmScores[i][0]+"\t"+pcmScores[i][1]+"\t"+pcmScores[i][2]+"\t"+(int)results[i][0]+"\t"+results[i][1]+"\t"+results[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int studentCount=sc.nextInt();
        int[][] pcmScores=generatePCMScores(studentCount);
        double[][] results=calculateResults(pcmScores);
        displayScoreCard(pcmScores,results);
    }
}
