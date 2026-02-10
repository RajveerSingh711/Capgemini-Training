package Feb10.Level1;

/*Write a program that converts an object to a JSON-like string using Reflection by inspecting its fields and values.
*/

import java.lang.reflect.*;

class JsonUtil{
    public static String toJson(Object obj){
        if(obj==null) return "null";
        Class<?> cls=obj.getClass();
        StringBuilder json=new StringBuilder("{");
        Field[] fields=cls.getDeclaredFields();
        for(int i=0;i<fields.length;i++) {
            Field field=fields[i];
            field.setAccessible(true);
            try{
                Object value=field.get(obj);
                json.append("\"").append(field.getName()).append("\":");
                if(value instanceof String) json.append("\"").append(value).append("\"");
                else json.append(value);
                if(i<fields.length-1) json.append(", ");
            }catch(IllegalAccessException e){
            }
        }
        json.append("}");
        return json.toString();
    }
}
class Student2{
    private String name;
    private int age;
    private double marks;
    public Student2(String name,int age,double marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
}
public class Ques9 {
    public static void main(String[] args){
        Student2 s=new Student2("Rajveer",21,88.5);
        String json=JsonUtil.toJson(s);
        System.out.println(json);
    }
}
