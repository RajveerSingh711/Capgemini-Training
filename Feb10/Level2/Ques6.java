package Feb10.Level2;

/*Define a custom annotation @ImportantMethod that can be applied to methods to indicate their importance.
🔹 Requirements:
Define @ImportantMethod with an optional level parameter (default: "HIGH").
Apply it to at least two methods.
Retrieve and print annotated methods using Reflection API.
*/

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{
    String level() default "HIGH";
}
class Service{
    @ImportantMethod
    public void processData(){
        System.out.println("Processing data");
    }
    @ImportantMethod(level="LOW")
    public void logInfo(){
        System.out.println("Logging info");
    }
    public void helperMethod(){
        System.out.println("Helper method");
    }
}
public class Ques6 {
    public static void main(String[] args){
        Class<Service> cls=Service.class;
        Method[] methods=cls.getDeclaredMethods();
        for(Method method:methods){
            if(method.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod imp=method.getAnnotation(ImportantMethod.class);
                System.out.println("Method Name: "+method.getName()+", Importance Level: "+imp.level());
            }
        }
    }
}
