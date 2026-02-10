package Feb10.Level1;

/*Implement a method toObject(Class<T> clazz, Map<String, Object> properties) that uses Reflection to set field values from a given Map.
*/

import java.lang.reflect.*;
import java.util.*;

class ObjectMapper{
    public static <T> T toObject(Class<T> clazz,Map<String,Object> properties){
        try{
            T obj=clazz.getDeclaredConstructor().newInstance();
            for(Map.Entry<String,Object> entry:properties.entrySet()){
                String fieldName=entry.getKey();
                Object fieldValue=entry.getValue();
                try{
                    Field field=clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    field.set(obj,fieldValue);
                }catch(NoSuchFieldException e){
                }
            }
            return obj;
        }catch(Exception e){
            throw new RuntimeException("Failed to map properties to object", e);
        }
    }
}
class Student1{
    private String name;
    private int age;
    @Override
    public String toString(){
        return "Student{name='"+name+"', age="+age +"}";
    }
}
public class Ques8 {
    public static void main(String[] args){
        Map<String, Object> data=new HashMap<>();
        data.put("name","Rajveer");
        data.put("age",21);
        Student1 student=ObjectMapper.toObject(Student1.class,data);
        System.out.println(student);
    }
}
