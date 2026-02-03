package Feb2;

/*Design a Java program that allows a user to store a list of employees in a file using Object Serialization and later retrieve the data from the file.
Requirements:
Create an Employee class with fields: id, name, department, salary.
Serialize the list of employees into a file (ObjectOutputStream).
Deserialize and display the employees from the file (ObjectInputStream).
Handle ClassNotFoundException and IOException.
*/

import java.util.*;
import java.io.*;

public class EmployeeSerialization {
    static class Employee implements Serializable{
        private static final long serialVersionUID=1L;
        int id;
        String name;
        String department;
        double salary;
        Employee(int id,String name,String department,double salary){
            this.id=id;
            this.name=name;
            this.department=department;
            this.salary=salary;
        }
        @Override
        public String toString(){
            return "ID: "+id+", Name: "+name+", Department: "+department+", Salary: "+salary;
        }
    }
    public static void main(String[] args){
        String fileName="employees.dat";
        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(new Employee(1,"Raj","IT",60000));
        empList.add(new Employee(2,"Anita","HR",50000));
        empList.add(new Employee(3,"Karan","Finance",65000));
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(empList);
            System.out.println("Employees serialized successfully.");
        }catch(IOException e){
            System.out.println("Serialization error.");
            e.printStackTrace();
        }
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName))){
            ArrayList<Employee> list=(ArrayList<Employee>)ois.readObject();
            System.out.println("\nEmployees retrieved from file:");
            for(Employee emp:list) System.out.println(emp);
        }catch(IOException e){
            System.out.println("Deserialization error.");
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            System.out.println("Class not found.");
            e.printStackTrace();
        }
    }
}
