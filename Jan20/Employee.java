package Jan20;

/*Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
*/

import java.util.*;

interface Department{
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}
public abstract class Employee{
    private int employeeId;
    private String name;
    protected double baseSalary;
    Employee(int employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+calculateSalary());
    }
}
class FullTimeEmployee extends Employee implements Department{
    private String department;
    FullTimeEmployee(int id,String name,double salary){
        super(id,name,salary);
    }
    @Override
    public double calculateSalary(){
        return baseSalary;
    }
    @Override
    public void assignDepartment(String deptName){
        this.department=deptName;
    }
    @Override
    public String getDepartmentDetails(){
        return department;
    }
}
class PartTimeEmployee extends Employee implements Department{
    private String department;
    private int hoursWorked;
    PartTimeEmployee(int id,String name,double hourlyRate,int hoursWorked){
        super(id,name,hourlyRate);
        this.hoursWorked=hoursWorked;
    }
    @Override
    public double calculateSalary(){
        return baseSalary*hoursWorked;
    }
    @Override
    public void assignDepartment(String deptName){
        this.department=deptName;
    }
    @Override
    public String getDepartmentDetails(){
        return department;
    }
    public static void main(String[] args){
        List<Employee> employees=new ArrayList<>();
        Employee e1=new FullTimeEmployee(101,"Raj",50000);
        Employee e2=new PartTimeEmployee(102,"John",500,40);
        ((Department)e1).assignDepartment("IT");
        ((Department)e2).assignDepartment("HR");
        employees.add(e1);
        employees.add(e2);
        for(Employee emp:employees){
            emp.displayDetails();
            System.out.println("Department: "+((Department) emp).getDepartmentDetails());
        }
    }
}