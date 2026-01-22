package Jan8.Level2;

/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint =>
Create a method to define the random 2-digit age of several students provided as method parameters and return a 1D array of ages of n students
Create a method that takes an array of age as a parameter and returns a 2D String array of age and a boolean true or false to indicate can and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to set true to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

import java.util.*;

public class Ques8 {
    public static int[] generateAges(int n){
        Random rand=new Random();
        int[] ages=new int[n];
        for(int i=0;i<n;i++){
            ages[i]=rand.nextInt(90)+10;
        }
        return ages;
    }
    public static String[][] checkVotingEligibility(int[] ages){
        int n=ages.length;
        String[][] result=new String[n][2];
        for(int i=0;i<n;i++){
            result[i][0]=String.valueOf(ages[i]);
            if(ages[i]<0) result[i][1]="false";
            else if(ages[i]>=18) result[i][1]="true";
            else result[i][1]="false";
        }
        return result;
    }
    public static void displayResult(String[][] data){
        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");
        for (String[] row:data){
            System.out.println(row[0]+"\t"+row[1]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ages=generateAges(n);
        String[][] votingResult=checkVotingEligibility(ages);
        displayResult(votingResult);
    }
}
