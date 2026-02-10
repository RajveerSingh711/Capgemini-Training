package Feb10.Level1;

/*Create a Configuration class with a private static field API_KEY. Use Reflection to modify its value and print it.*/

import java.lang.reflect.*;

class Configuration{
    private static String API_KEY="DEFAULT_KEY";
}
public class Ques7 {
    public static void main(String[] args){
        try {
            Class<?> cls=Configuration.class;
            Field field=cls.getDeclaredField("API_KEY");
            field.setAccessible(true);
            field.set(null,"NEW_SECRET_API_KEY");
            String value=(String)field.get(null);
            System.out.println("API_KEY value: "+value);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
