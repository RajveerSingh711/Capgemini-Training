package Jan18;

/*Create a Student class to manage student data with the following features:
Static:
○       A static variable universityName shared across all students.
○       A static method displayTotalStudents() to show the number of students enrolled.
This:
○       Use this in the constructor to initialize name, rollNumber, and grade.
Final:
○       Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
○       Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
*/

import java.util.*;

public class Student {
    static String universityName="Chitkara University";
    private static int totalStudents=0;
    static void displayTotalStudents(){
        System.out.println("Total Students Enrolled: "+totalStudents);
    }
    private String name;
    private char grade;
    private final int rollNumber;
    Student(String name,int rollNumber,char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalStudents++;
    }
    void displayDetails(Object obj){
        if(obj instanceof Student){
            Student s=(Student) obj;
            System.out.println("University Name: "+universityName);
            System.out.println("Student Name: "+s.name);
            System.out.println("Roll Number: "+s.rollNumber);
            System.out.println("Grade: "+s.grade);
        }else {
            System.out.println("Object is not a Student instance.");
        }
    }
    void updateGrade(Object obj, char newGrade){
        if(obj instanceof Student){
            Student s=(Student) obj;
            s.grade=newGrade;
            System.out.println("Grade updated successfully.");
        }else{
            System.out.println("Cannot update grade. Invalid Student object.");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Rajveer Singh",501,'A');
        Student s2 = new Student("John Doe",502,'B');
        s1.displayDetails(s1);
        System.out.println();
        s2.updateGrade(s2, 'A');
        s2.displayDetails(s2);
        System.out.println();
        Student.displayTotalStudents();
    }
}
