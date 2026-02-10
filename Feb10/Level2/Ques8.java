package Feb10.Level2;

/*Define an annotation @LogExecutionTime to measure method execution time.
🔹 Requirements:
Apply @LogExecutionTime to a method.
Use System.nanoTime() before and after execution.
Print execution time.
Apply it on different methods and compare the time taken.
*/

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}
class PerformanceTasks{
    @LogExecutionTime
    public void fastTask(){
        for(int i=0;i<1_000_000;i++);
    }
    @LogExecutionTime
    public void slowTask(){
        for(int i=0;i<50_000_000;i++);
    }
    public void normalTask(){
        System.out.println("Normal task (not timed)");
    }
}
public class Ques8 {
    public static void main(String[] args){
        try{
            PerformanceTasks obj=new PerformanceTasks();
            Class<?> cls=obj.getClass();
            for(Method method:cls.getDeclaredMethods()){
                if(method.isAnnotationPresent(LogExecutionTime.class)){
                    method.setAccessible(true);
                    long startTime=System.nanoTime();
                    method.invoke(obj);
                    long endTime=System.nanoTime();
                    long duration=endTime-startTime;
                    System.out.println("Method: "+method.getName()+" | Execution Time: "+duration+" ns");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
