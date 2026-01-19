package Jan16.InstancevsClassVariablesandMethods;

/*Problem 2: Online Course Management
Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses.
*/

import java.util.*;

public class Course{
    String courseName;
    int duration;
    double fee;
    static String instituteName="Chitkara University";
    Course(String courseName,int duration,double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    void displayCourseDetails(){
        System.out.println("Course Name   : "+courseName);
        System.out.println("Duration      : " +duration+" weeks");
        System.out.println("Fee           : ₹"+fee);
        System.out.println("Institute     : "+instituteName);
        System.out.println();
    }
    static void updateInstituteName(String newInstituteName){
        instituteName = newInstituteName;
    }
    public static void main(String[] args){
        Course c1 = new Course("Java Full Stack", 24, 45000);
        Course c2 = new Course("Data Structures", 16, 30000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("XYZ Online Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
