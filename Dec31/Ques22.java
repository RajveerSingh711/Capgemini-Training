package Dec31;

/*Create a program to find the total income of a person by taking salary and bonus from user
Hint =>
Create a variable named salary and take user input.
Create another variable bonus and take user input.
Compute income by adding salary and bonus and print the result
I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___
 */

import java.util.*;

public class Ques22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int bonus=sc.nextInt();
        int income=salary+bonus;
        System.out.print("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+income);
    }
}
