package Jan19.AssistedProblems;

/*Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
 */

import java.util.*;

class Employee{
    protected String name;
    protected int id;
    protected double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Salary: ₹"+salary);
    }
}
class Manager extends Employee{
    private int teamSize;
    Manager(String name,int id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    @Override
    void displayDetails(){
        System.out.println("Role: Manager");
        super.displayDetails();
        System.out.println("Team Size: "+teamSize);
    }
}
class Developer extends Employee{
    private String programmingLanguage;
    Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    void displayDetails(){
        System.out.println("Role: Developer");
        super.displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}
class Intern extends Employee{
    private int duration;
    Intern(String name,int id,double salary,int duration){
        super(name,id,salary);
        this.duration=duration;
    }
    @Override
    void displayDetails(){
        System.out.println("Role: Intern");
        super.displayDetails();
        System.out.println("Internship Duration: "+duration+" months");
    }
    public static void main(String[] args){
        Employee e1 = new Manager("Rajveer Singh",101,90000,8);
        Employee e2 = new Developer("John Doe", 102,70000,"Java");
        Employee e3 = new Intern("John Doe1", 103,15000,6);
        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();
        e3.displayDetails();
    }
}