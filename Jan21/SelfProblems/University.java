package Jan21.SelfProblems;

/*Problem 2: University with Faculties and Departments (Composition and Aggregation)
Description: Create a University with multiple Faculty members and Department objects. Model it so that the University and its Departments are in a composition relationship (deleting a university deletes all departments), and the Faculty members are in an aggregation relationship (faculty can exist outside of any specific department).
Tasks:
Define a University class with Department and Faculty classes.
Demonstrate how deleting a University also deletes its Departments.
Show that Faculty members can exist independently of a Department.
Goal: Understand the differences between composition and aggregation in modeling complex hierarchical relationships.
*/

import java.util.*;

class Faculty{
    private String name;
    Faculty(String name){
        this.name=name;
    }
    void displayFaculty(){
        System.out.println("Faculty: "+name);
    }
}
class Department{
    private String deptName;
    Department(String deptName){
        this.deptName=deptName;
    }
    void displayDepartment(){
        System.out.println("Department: "+deptName);
    }
}
public class University {
    private String universityName;
    ArrayList<Department> departments=new ArrayList<>();
    ArrayList<Faculty> faculties=new ArrayList<>();
    University(String universityName){
        this.universityName=universityName;
    }
    void addDepartment(String deptName){
        departments.add(new Department(deptName));
    }
    void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }
    void displayUniversity(){
        System.out.println("University: "+universityName);
        System.out.println("Departments:");
        for (Department d:departments){
            d.displayDepartment();
        }
        System.out.println("Faculties:");
        for (Faculty f:faculties){
            f.displayFaculty();
        }
    }
    public static void main(String[] args){
        Faculty f1=new Faculty("Vishnu");
        Faculty f2=new Faculty("Ashish");
        University uni=new University("Chitkara University");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.displayUniversity();
        uni=null;
        System.out.println("\nFaculty exists even after University deletion:");
        f1.displayFaculty();
        f2.displayFaculty();
    }
}