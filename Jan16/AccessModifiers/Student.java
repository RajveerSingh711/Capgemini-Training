package Jan16.AccessModifiers;

/*Problem 1: University Management System
Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).
Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate the use of protected members.
 */

import java.util.*;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;
    Student(int rollNumber,String name,double cgpa){
        this.rollNumber=rollNumber;
        this.name=name;
        this.cgpa=cgpa;
    }
    public double getCGPA(){
        return cgpa;
    }
    public void setCGPA(double cgpa){
        this.cgpa=cgpa;
    }
}
class PostgraduateStudent extends Student{
    private String specialization;
    PostgraduateStudent(int rollNumber,String name,double cgpa,String specialization){
        super(rollNumber,name,cgpa);
        this.specialization=specialization;
    }
    void displayDetails() {
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Name: "+name);
        System.out.println("CGPA: "+getCGPA());
        System.out.println("Specialization: "+specialization);
    }
    public static void main(String[] args) {
        PostgraduateStudent pg=new PostgraduateStudent(0711,"Rajveer Singh",8.00,"CSE");
        pg.displayDetails();
    }
}

