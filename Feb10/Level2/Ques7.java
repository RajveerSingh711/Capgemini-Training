package Feb10.Level2;

/*Define an annotation @Todo to mark pending features in a project.
🔹 Requirements:
The annotation should have fields:
task() (String) → Description of the task
assignedTo() (String) → Developer responsible
priority() (default: "MEDIUM")
Apply it to multiple methods.
Retrieve and print all pending tasks using Reflection.
*/

import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
class ProjectTasks{
    @Todo(
            task="Implement login feature",
            assignedTo="Rajveer",
            priority="HIGH"
    )
    public void loginFeature(){}
    @Todo(
            task="Add validation for signup form",
            assignedTo="Amit"
    )
    public void signupValidation(){
    }
    @Todo(
            task="Optimize database queries",
            assignedTo="Neha",
            priority="LOW"
    )
    public void optimizeDB(){}
}
public class Ques7 {
    public static void main(String[] args){
        Class<ProjectTasks> cls=ProjectTasks.class;
        Method[] methods=cls.getDeclaredMethods();
        System.out.println("Pending Tasks:\n");
        for(Method method:methods){
            if(method.isAnnotationPresent(Todo.class)){
                Todo todo=method.getAnnotation(Todo.class);
                System.out.println("Method: "+method.getName());
                System.out.println("Task: "+todo.task());
                System.out.println("Assigned To: "+todo.assignedTo());
                System.out.println("Priority: "+todo.priority());
                System.out.println("--------------------------------");
            }
        }
    }
}
