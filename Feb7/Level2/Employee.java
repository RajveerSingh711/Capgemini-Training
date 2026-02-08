package Feb7.Level2;

/*Problem Statement: You have a list of Employee objects with the following fields: id, name,
department, and salary. Write a method to perform the following operations:
1. Filter: Select employees who belong to the "Engineering" department and have a salary
greater than $80,000.
2. Sort: Sort these employees by their salary in descending order.
3. Group: Group the resulting employees by their department.
4. Aggregate: For each department, calculate the average salary of employees.
 */

import java.util.*;
import java.util.stream.*;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee(int id,String name,String department,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public String getDepartment(){
        return department;
    }
    public double getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+department+" $"+salary;
    }
    public static void main(String[] args){
        List<Employee> employees=Arrays.asList(
                new Employee(1,"Alice","Engineering",95000),
                new Employee(2,"Bob","Engineering",85000),
                new Employee(3,"Charlie","Engineering",75000),
                new Employee(4,"David","HR",70000),
                new Employee(5,"Eve","Engineering",105000),
                new Employee(6,"Frank","HR",90000)
        );
        Map<String,Double> avgSalaryByDept=employees.stream().filter(e->"Engineering".equals(e.getDepartment())).filter(e->e.getSalary()>80_000).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        avgSalaryByDept.forEach((dept,avgSalary)->System.out.println("Department: "+dept+", Average Salary: $"+avgSalary));
    }
}
