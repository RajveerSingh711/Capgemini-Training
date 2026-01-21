package Jan21.AssistedProblems;

/*Problem 3: Company and Departments (Composition)
Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
Tasks:
Define a Company class that contains multiple Department objects.
Define an Employee class within each Department.
Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.
 */

import java.util.*;

class Department{
    private String deptName;
    ArrayList<Employee> employees=new ArrayList<>();
    Department(String deptName){
        this.deptName=deptName;
    }
    void addEmployee(String name){
        employees.add(new Employee(name));
    }
    void displayDepartment(){
        System.out.println("Department: "+deptName);
        for (Employee emp:employees){
            emp.displayEmployee();
        }
    }
    class Employee{
        private String name;
        Employee(String name){
            this.name=name;
        }
        void displayEmployee(){
            System.out.println("  Employee: "+name);
        }
    }
}
public class Company{
    private String companyName;
    ArrayList<Department> departments=new ArrayList<>();
    Company(String companyName){
        this.companyName=companyName;
    }
    void addDepartment(Department department){
        departments.add(department);
    }
    void displayCompany(){
        System.out.println("Company: "+companyName);
        for(Department dept:departments){
            dept.displayDepartment();
        }
    }
    public static void main(String[] args){
        Company company=new Company("Tech Solutions");
        Department dev=new Department("Development");
        Department hr=new Department("HR");
        dev.addEmployee("Alice");
        dev.addEmployee("Bob");
        hr.addEmployee("Charlie");
        company.addDepartment(dev);
        company.addDepartment(hr);
        company.displayCompany();
        company=null;
    }
}
