package Jan21.SelfProblems;

/*Problem 1: School and Students with Courses (Association and Aggregation)
Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
Tasks:
Define School, Student, and Course classes.
Model an association between Student and Course to show that students can enroll in multiple courses.
Model an aggregation relationship between School and Student.
Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
Goal: Practice association by modeling many-to-many relationships between students and courses.
*/

import java.util.*;

class Course{
    private String courseName;
    ArrayList<Student> students=new ArrayList<>();
    Course(String courseName){
        this.courseName=courseName;
    }
    void addStudent(Student student){
        students.add(student);
    }
    String getCourseName(){
        return courseName;
    }
    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("  Student: " + s.getName());
        }
    }
}
class Student{
    private String name;
    ArrayList<Course> courses=new ArrayList<>();
    Student(String name){
        this.name=name;
    }
    void enrollCourse(Course course){
        courses.add(course);
        course.addStudent(this);
    }
    String getName(){
        return name;
    }
    void viewCourses(){
        System.out.println("Student: "+name);
        for(Course c:courses){
            System.out.println("  Enrolled in: "+c.getCourseName());
        }
    }
}
public class School{
    private String schoolName;
    ArrayList<Student> students=new ArrayList<>();
    School(String schoolName){
        this.schoolName=schoolName;
    }
    void addStudent(Student student){
        students.add(student);
    }
    void showStudents(){
        System.out.println("School: "+schoolName);
        for(Student s:students){
            System.out.println("Student: "+s.getName());
        }
    }
    public static void main(String[] args){
        School school=new School("Chitkara School");
        Student s1=new Student("Rahul");
        Student s2=new Student("Anita");
        Course math=new Course("Mathematics");
        Course cs=new Course("Computer Science");
        school.addStudent(s1);
        school.addStudent(s2);
        s1.enrollCourse(math);
        s1.enrollCourse(cs);
        s2.enrollCourse(cs);
        s1.viewCourses();
        System.out.println();
        s2.viewCourses();
        System.out.println();
        math.showStudents();
        System.out.println();
        cs.showStudents();
    }
}
