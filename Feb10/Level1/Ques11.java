package Feb10.Level1;

/*Implement a simple DI container that scans classes with @Inject annotation and injects dependencies dynamically.
*/

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
}
class Engine{
    public void start(){
        System.out.println("Engine started");
    }
}
class Car{
    @Inject
    private Engine engine;
    public void drive(){
        engine.start();
        System.out.println("Car is running");
    }
}
class SimpleDIContainer{
    private static Map<Class<?>,Object> container=new HashMap<>();
    public static <T> T getBean(Class<T> clazz){
        try{
            if(container.containsKey(clazz)){
                return clazz.cast(container.get(clazz));
            }
            T obj = clazz.getDeclaredConstructor().newInstance();
            container.put(clazz, obj);
            for(Field field : clazz.getDeclaredFields()){
                if(field.isAnnotationPresent(Inject.class)){
                    field.setAccessible(true);
                    Class<?> fieldType=field.getType();
                    Object dependency=getBean(fieldType);
                    field.set(obj,dependency);
                }
            }
            return obj;
        }catch(Exception e){
            throw new RuntimeException("Dependency injection failed", e);
        }
    }
}
public class Ques11 {
    public static void main(String[] args){
        Car car=SimpleDIContainer.getBean(Car.class);
        car.drive();
    }
}
