package Jan15.Level1;

/*Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
*/

import java.util.*;

public class Employee {
    String name;
    int id;
    double salary;
    void display(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employee ep=new Employee();
        ep.name=sc.nextLine();
        ep.id=sc.nextInt();
        ep.salary=sc.nextDouble();
        ep.display();
    }
}
