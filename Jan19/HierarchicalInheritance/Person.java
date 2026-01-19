package Jan19.HierarchicalInheritance;

/*Sample Problem 2: School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.
*/

import java.util.*;

class Person {
    protected String name;
    protected int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayRole(){
        System.out.println("Role: Person");
    }
    void displayBasicInfo() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Teacher extends Person{
    private String subject;
    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
    @Override
    void displayRole(){
        System.out.println("Role: Teacher");
    }
    void displayDetails(){
        displayRole();
        displayBasicInfo();
        System.out.println("Subject: "+subject);
    }
}

class Student extends Person{
    private String grade;
    Student(String name,int age,String grade){
        super(name,age);
        this.grade=grade;
    }
    @Override
    void displayRole(){
        System.out.println("Role: Student");
    }
    void displayDetails(){
        displayRole();
        displayBasicInfo();
        System.out.println("Grade: "+grade);
    }
}
class Staff extends Person{
    private String department;
    Staff(String name,int age,String department){
        super(name,age);
        this.department=department;
    }
    @Override
    void displayRole(){
        System.out.println("Role: Staff");
    }
    void displayDetails(){
        displayRole();
        displayBasicInfo();
        System.out.println("Department: "+department);
    }
    public static void main(String[] args){
        Teacher t=new Teacher("Rajveer Singh",22,"Mathematics");
        Student s=new Student("John Doe",16,"10th Grade");
        Staff st=new Staff("John Doe1",42,"Administration");
        t.displayDetails();
        System.out.println();
        s.displayDetails();
        System.out.println();
        st.displayDetails();
    }
}
