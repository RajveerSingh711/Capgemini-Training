package Feb10.Level1;

/*Create a class Person with a private field age. Use Reflection to modify and retrieve its value.
*/

import java.lang.reflect.*;

class Person{
    private int age;
    public Person(){
        age=0;
    }
}
public class Ques2 {
    public static void main(String[] args){
        try{
            Person p = new Person();
            Class<?> cls=p.getClass();
            Field field=cls.getDeclaredField("age");
            field.setAccessible(true);
            field.setInt(p,25);
            int ageValue=field.getInt(p);
            System.out.println("Age value using Reflection: "+ageValue);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
