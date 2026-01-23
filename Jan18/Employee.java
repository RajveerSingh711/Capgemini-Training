package Jan18;

/*Design an Employee class with the following features:
Static:
○       A static variable companyName shared by all employees.
○       A static method displayTotalEmployees() to show the total number of employees.
This:
○       Use this to initialize name, id, and designation in the constructor.
Final:
○       Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof
○       Check if a given object is an instance of the Employee class before printing the employee details.
*/

import java.util.*;

public class Employee {
    static String companyName="Tech Solutions Inc.";
    private static int totalEmployees=0;
    static void displayTotalEmployees(){
        System.out.println("Total Employees: "+totalEmployees);
    }
    private String name;
    private String designation;
    private final int id;
    Employee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployees++;
    }
    void displayDetails(Object obj){
        if(obj instanceof Employee){
            Employee emp=(Employee) obj;
            System.out.println("Company Name: "+companyName);
            System.out.println("Employee Name: "+emp.name);
            System.out.println("Employee ID: "+emp.id);
            System.out.println("Designation: "+emp.designation);
        }else{
            System.out.println("Object is not an Employee instance.");
        }
    }
    public static void main(String[] args){
        Employee e1=new Employee("Rajveer Singh",101,"Software Engineer");
        Employee e2=new Employee("John Doe",102,"QA Analyst");
        e1.displayDetails(e1);
        System.out.println();
        e2.displayDetails(e2);
        System.out.println();
        Employee.displayTotalEmployees();
    }
}
