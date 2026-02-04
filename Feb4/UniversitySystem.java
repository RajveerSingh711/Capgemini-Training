package Feb4;

/*Develop a university course management system where different departments offer courses with different evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
Hints:
Create an abstract class CourseType (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
Implement a generic class Course<T extends CourseType> to manage different courses.
Use wildcards (List<? extends CourseType>) to handle any type of course dynamically.
*/

import java.util.*;

abstract class CourseType{
    public abstract String getEvaluationType();
    public abstract void evaluate();
}
class ExamCourse extends CourseType{
    @Override
    public String getEvaluationType(){
        return "Exam-Based Evaluation";
    }
    @Override
    public void evaluate(){
        System.out.println("Evaluated using mid-term and final exams.");
    }
}
class AssignmentCourse extends CourseType{
    @Override
    public String getEvaluationType(){
        return "Assignment-Based Evaluation";
    }
    @Override
    public void evaluate(){
        System.out.println("Evaluated using assignments and projects.");
    }
}
class ResearchCourse extends CourseType{
    @Override
    public String getEvaluationType(){
        return "Research-Based Evaluation";
    }
    @Override
    public void evaluate(){
        System.out.println("Evaluated using research papers and thesis.");
    }
}
class Course<T extends CourseType>{
    private String courseCode;
    private String courseName;
    private String department;
    private T courseType;
    public Course(String courseCode,String courseName,String department,T courseType){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.department=department;
        this.courseType=courseType;
    }
    public void showCourseDetails(){
        System.out.println(courseCode+" - "+courseName+" ("+department+")");
        System.out.println("Evaluation: "+courseType.getEvaluationType());
        courseType.evaluate();
        System.out.println();
    }
    public T getCourseType(){
        return courseType;
    }
}
class CourseManager{
    public static void displayAllCourses(List<? extends CourseType> courseTypes){
        for(CourseType type:courseTypes){
            System.out.println(type.getEvaluationType());
            type.evaluate();
            System.out.println();
        }
    }
}
public class UniversitySystem {
    public static void main(String[] args){
        Course<ExamCourse> cs101=new Course<>("CS101","Data Structures","Computer Science",new ExamCourse());
        Course<AssignmentCourse> it202=new Course<>("IT202","Web Development","Information Technology",new AssignmentCourse());
        Course<ResearchCourse> phd501=new Course<>("PHD501","AI Research","Computer Science",new ResearchCourse());
        cs101.showCourseDetails();
        it202.showCourseDetails();
        phd501.showCourseDetails();
        List<CourseType> courseTypes=List.of(new ExamCourse(),new AssignmentCourse(),new ResearchCourse());
        CourseManager.displayAllCourses(courseTypes);
    }
}
