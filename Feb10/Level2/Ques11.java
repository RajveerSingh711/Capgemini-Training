package Feb10.Level2;

/*Define an annotation @JsonField to mark fields for JSON serialization.
🔹 Requirements:
@JsonField(name = "user_name") should map field names to custom JSON keys.
Apply it on a User class.
Write a method to convert object to JSON string by reading the annotations.
*/

import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField{
    String name();
}
class User1{
    @JsonField(name="user_name")
    private String username;
    @JsonField(name="user_age")
    private int age;
    private String password;
    public User1(String username,int age,String password){
        this.username=username;
        this.age=age;
        this.password=password;
    }
}
class JsonSerializer{
    public static String toJson(Object obj){
        StringBuilder json=new StringBuilder("{");
        Class<?> cls=obj.getClass();
        Field[] fields=cls.getDeclaredFields();
        boolean first=true;
        for(Field field:fields){
            if(field.isAnnotationPresent(JsonField.class)){
                field.setAccessible(true);
                JsonField jsonField=field.getAnnotation(JsonField.class);
                try{
                    Object value=field.get(obj);
                    if(!first) json.append(", ");
                    json.append("\"").append(jsonField.name()).append("\":");
                    if(value instanceof String) json.append("\"").append(value).append("\"");
                    else json.append(value);
                    first=false;
                }catch(IllegalAccessException e){
                    e.printStackTrace();
                }
            }
        }
        json.append("}");
        return json.toString();
    }
}
public class Ques11 {
    public static void main(String[] args){
        User1 user=new User1("Rajveer",21,"secret123");
        String json=JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
