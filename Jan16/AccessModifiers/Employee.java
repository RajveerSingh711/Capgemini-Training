package Jan16.AccessModifiers;

/*Problem 4: Employee Records
Develop an Employee class with:
employeeID (public).
department (protected).
salary (private).
Write methods to:
Modify salary using a public method.
Create a subclass Manager to access employeeID and department.
*/

import java.util.*;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    Employee(int employeeID,String department,double salary){
        this.employeeID=employeeID;
        this.department=department;
        this.salary=salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
}
class Manager extends Employee{
    private String role;
    Manager(int employeeID,String department,double salary,String role){
        super(employeeID,department,salary);
        this.role=role;
    }
    void displayDetails(){
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Department: "+department);
        System.out.println("Salary: ₹"+getSalary());
        System.out.println("Role: "+role);
    }
    public static void main(String[] args){
        Manager m=new Manager(201,"IT",75000.0,"Project Manager");
        m.setSalary(80000.0);
        m.displayDetails();
    }
}
