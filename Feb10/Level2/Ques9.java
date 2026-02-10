package Feb10.Level2;

/*Define a field-level annotation @MaxLength(int value) that restricts the maximum length of a String field.
🔹 Requirements:
Apply it to a User class field (username).
Validate length in the constructor.
Throw IllegalArgumentException if the limit is exceeded.
*/

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength{
    int value();
}
class User{
    @MaxLength(10)
    private String username;
    public User(String username){
        try{
            var field=this.getClass().getDeclaredField("username");
            if(field.isAnnotationPresent(MaxLength.class)){
                MaxLength maxLength=field.getAnnotation(MaxLength.class);
                if(username!=null && username.length()>maxLength.value()){
                    throw new IllegalArgumentException("Username length exceeds maximum allowed: "+maxLength.value());
                }
            }
        }catch(NoSuchFieldException e){
            e.printStackTrace();
        }
        this.username=username;
    }
    @Override
    public String toString(){
        return "User{username='"+username+"'}";
    }
}
public class Ques9 {
    public static void main(String[] args){
        User u1=new User("Rajveer");
        System.out.println(u1);
        User u2=new User("RajveerSingh123");
    }
}
