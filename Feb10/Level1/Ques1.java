package Feb10.Level1;

/*Write a program to accept a class name as input and display its methods, fields, and constructors using Reflection.
*/

import java.util.*;
import java.lang.reflect.*;

public class Ques1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter class name (e.g. java.util.ArrayList): ");
        String className=sc.nextLine();
        try{
            Class<?> cls=Class.forName(className);
            System.out.println("\n===== Class Name =====");
            System.out.println(cls.getName());
            System.out.println("\n===== Constructors =====");
            Constructor<?>[] constructors=cls.getDeclaredConstructors();
            for(Constructor<?> c:constructors) System.out.println(c);
            System.out.println("\n===== Methods =====");
            Method[] methods=cls.getDeclaredMethods();
            for(Method m:methods) System.out.println(m);
            System.out.println("\n===== Fields =====");
            Field[] fields=cls.getDeclaredFields();
            for(Field f:fields) System.out.println(f);
        }catch(ClassNotFoundException e){
            System.out.println("Class not found!");
        }

        sc.close();
    }
}
