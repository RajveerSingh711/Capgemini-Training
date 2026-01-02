package Jan2.Level1;

/*Create a program to find the bonus of employees based on their years of service.
Hint =>
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
*/

import java.util.*;

public class Ques17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt(),years=sc.nextInt();
        int bonus=salary;
        if(years>5){
            bonus+=(salary*5)/100;
        }
        System.out.print("Salary of the employee with "+years+" years of service is "+bonus);
    }
}
