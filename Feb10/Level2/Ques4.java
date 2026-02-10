package Feb10.Level2;

/*Create a custom annotation @TaskInfo to mark tasks with priority and assigned person.
🔹 Steps to Follow:
Define an annotation @TaskInfo with fields priority and assignedTo.
Apply this annotation to a method in TaskManager class.
Retrieve the annotation details using Reflection API.
*/

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}
class TaskManager{
    @TaskInfo(priority="High",assignedTo="Rajveer")
    public void completeTask(){
        System.out.println("Task completed");
    }
}
public class Ques4 {
    public static void main(String[] args){
        try{
            Class<TaskManager> cls=TaskManager.class;
            Method method=cls.getDeclaredMethod("completeTask");
            if(method.isAnnotationPresent(TaskInfo.class)){
                TaskInfo taskInfo=method.getAnnotation(TaskInfo.class);
                System.out.println("Priority: "+taskInfo.priority());
                System.out.println("Assigned To: "+taskInfo.assignedTo());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
