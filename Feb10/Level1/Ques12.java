package Feb10.Level1;

/*Use Reflection to measure the execution time of methods in a given class dynamically.
*/

import java.lang.reflect.*;

class Task
{
    public void fastTask(){
        for(int i=0;i<1_000_000;i++);
    }
    public void slowTask(){
        for(int i=0;i<50_000_000;i++);
    }
}
class MethodTimer{
    public static void measureExecutionTime(Object obj){
        Class<?> clazz=obj.getClass();
        Method[] methods=clazz.getDeclaredMethods();
        for(Method method:methods){
            try{
                method.setAccessible(true);
                long startTime=System.nanoTime();
                method.invoke(obj);
                long endTime=System.nanoTime();
                long duration=endTime-startTime;
                System.out.println("Method: "+method.getName()+" | Execution Time: "+duration+" ns");
            }catch(Exception e){
                System.out.println("Failed to execute method: "+method.getName());
            }
        }
    }
}
public class Ques12 {
    public static void main(String[] args){
        Task task=new Task();
        MethodTimer.measureExecutionTime(task);
    }
}
