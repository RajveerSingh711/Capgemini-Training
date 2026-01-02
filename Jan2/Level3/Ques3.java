package Jan2.Level3;

/*Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines

Hint =>
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
*/

import java.util.*;

public class Ques3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int physics=sc.nextInt(),chemistry=sc.nextInt(),maths=sc.nextInt();
        int percentage=(physics+chemistry+maths)/3;
        char grade;
        if(percentage>=80) grade='A';
        else if(percentage>=70 && percentage<=79) grade='B';
        else if(percentage>=60 && percentage<=69) grade='C';
        else if(percentage>=50 && percentage<=59) grade='D';
        else if(percentage>=40 && percentage<=49) grade='E';
        else grade='R';
        System.out.println("The student has received grade: "+grade);
    }
}
