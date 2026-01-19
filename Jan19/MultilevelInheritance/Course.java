package Jan19.MultilevelInheritance;

/*Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
*/

import java.util.*;

class Course {
    protected String courseName;
    protected int duration;
    Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    void displayInfo(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration+" hours");
    }
}
class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;
    OnlineCourse(String courseName,int duration,String platform,boolean isRecorded){
        super(courseName,duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Platform: "+platform);
        System.out.println("Recorded: "+isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse{
    private double fee;
    private double discount;
    PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,double fee,double discount){
        super(courseName,duration,platform,isRecorded);
        this.fee=fee;
        this.discount=discount;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Course Fee: ₹"+fee);
        System.out.println("Discount: "+discount+"%");
        System.out.println("Final Price: ₹"+(fee-(fee*discount/100)));
    }
    public static void main(String[] args){
        Course c = new PaidOnlineCourse("Java Full Stack",120,"Udemy",true,15000,20);
        c.displayInfo();
    }
}