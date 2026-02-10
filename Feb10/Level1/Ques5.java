package Feb10.Level1;

/*Define a class MathOperations with multiple public methods (add, subtract, multiply). Use Reflection to dynamically call any method based on user input.
*/

import java.util.*;
import java.lang.reflect.*;

class MathOperations{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
}
public class Ques5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName=sc.next();
            System.out.print("Enter first number: ");
            int a=sc.nextInt();
            System.out.print("Enter second number: ");
            int b=sc.nextInt();
            Class<?> cls=MathOperations.class;
            Object obj=cls.getDeclaredConstructor().newInstance();
            Method method=cls.getMethod(methodName,int.class,int.class);
            Object result=method.invoke(obj,a,b);
            System.out.println("Result: "+result);
        }catch(NoSuchMethodException e){
            System.out.println("Invalid method name!");
        }catch(Exception e){
            e.printStackTrace();
        }
        sc.close();
    }
}
