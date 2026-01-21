package Jan21.SelfProblems;

/*Problem 5: University Management System
Description: Model a university system with Student, Professor, and Course classes. Students enroll in courses, and professors teach courses. Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
Goal: Use association and aggregation to create a university system that emphasizes relationships and interactions among students, professors, and course
 */

import java.util.*;

class Course1 {
    private String courseName;
    private Professor professor;
    ArrayList<Student1> students=new ArrayList<>();
    Course1(String courseName){
        this.courseName=courseName;
    }
    void assignProfessor(Professor professor){
        this.professor=professor;
        System.out.println("Professor "+professor.getName()+" assigned to course "+courseName);
    }
    void addStudent(Student1 student){
        students.add(student);
    }
    void showCourseDetails(){
        System.out.println("Course: "+courseName);
        if(professor!=null){
            System.out.println("  Professor: "+professor.getName());
        }
        System.out.println("  Students:");
        for (Student1 s:students){
            System.out.println("    "+s.getName());
        }
    }
    String getCourseName(){
        return courseName;
    }
}
class Student1{
    private String name;
    ArrayList<Course1> courses=new ArrayList<>();
    Student1(String name){
        this.name=name;
    }
    void enrollCourse(Course1 course){
        courses.add(course);
        course.addStudent(this);
        System.out.println("Student "+name+" enrolled in "+course.getCourseName());
    }
    void viewCourses(){
        System.out.println("Student: "+name);
        for (Course1 c:courses){
            System.out.println("  Enrolled in: "+c.getCourseName());
        }
    }
    String getName(){
        return name;
    }
}
class Professor{
    private String name;
    ArrayList<Course1> courses=new ArrayList<>();
    Professor(String name){
        this.name=name;
    }
    void assignToCourse(Course1 course){
        courses.add(course);
        course.assignProfessor(this);
    }
    void viewCourses(){
        System.out.println("Professor: "+name);
        for (Course1 c:courses){
            System.out.println("  Teaching: "+c.getCourseName());
        }
    }
    String getName(){
        return name;
    }
}
public class University1{
    private String universityName;
    ArrayList<Student1> students=new ArrayList<>();
    ArrayList<Professor> professors=new ArrayList<>();
    ArrayList<Course1> courses=new ArrayList<>();
    University1(String universityName){
        this.universityName=universityName;
    }
    void addStudent(Student1 student){
        students.add(student);
    }
    void addProfessor(Professor professor){
        professors.add(professor);
    }
    void addCourse(Course1 course){
        courses.add(course);
    }
    public static void main(String[] args){
        University1 uni=new University1("Chitkara University");
        Student1 s1=new Student1("Rahul");
        Student1 s2=new Student1("Anita");
        Professor p1=new Professor("Dr. Sharma");
        Course1 cs=new Course1("Computer Science");
        Course1 math=new Course1("Mathematics");
        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addCourse(cs);
        uni.addCourse(math);
        p1.assignToCourse(cs);
        s1.enrollCourse(cs);
        s1.enrollCourse(math);
        s2.enrollCourse(cs);
        System.out.println();
        s1.viewCourses();
        System.out.println();
        p1.viewCourses();
        System.out.println();
        cs.showCourseDetails();
    }
}