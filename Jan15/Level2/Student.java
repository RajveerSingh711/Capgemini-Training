package Jan15.Level2;

/*Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
Explanation: The Student class organizes all relevant details about a student as attributes. Methods are used to calculate the grade and provide a way to display all information.
*/

import java.util.*;

public class Student{
    String name;
    long rollNumber;
    int marks;
    char grade;
    void calculateGrade(){
        if(marks>=90) grade='A';
        else if(marks>=75) grade='B';
        else if(marks>=60) grade='C';
        else if(marks>=40) grade='D';
        else grade='F';
    }
    void display(){
        System.out.println("Student Name: "+name);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        s.name=sc.nextLine();
        s.rollNumber=sc.nextLong();
        s.marks=sc.nextInt();
        s.calculateGrade();
        s.display();
    }
}
