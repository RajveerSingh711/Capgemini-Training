package Feb10.Level2;

/*Define an annotation @BugReport that can be applied multiple times on a method.
🔹 Steps to Follow:
Define @BugReport with a description field.
Use @Repeatable to allow multiple bug reports.
Apply it twice on a method.
Retrieve and print all bug reports.
*/

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports{
    BugReport[] value();
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport{
    String description();
}
class Software{
    @BugReport(description="NullPointerException on startup")
    @BugReport(description="Performance issue with large input")
    public void runApp(){
        System.out.println("Application running");
    }
}
public class Ques5 {
    public static void main(String[] args){
        try{
            Class<Software> cls=Software.class;
            Method method=cls.getDeclaredMethod("runApp");
            BugReport[] reports=method.getAnnotationsByType(BugReport.class);
            for(BugReport report:reports){
                System.out.println("Bug: "+report.description());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
