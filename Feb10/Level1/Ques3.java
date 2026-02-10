package Feb10.Level1;

/*Define a class Calculator with a private method multiply(int a, int b). Use Reflection to invoke this method and display the result.
*/

import java.lang.reflect.*;

class Calculator {
    private int multiply(int a,int b){
        return a*b;
    }
}
public class Ques3 {
    public static void main(String[] args){
        try{
            Calculator calc=new Calculator();
            Class<?> cls=calc.getClass();
            Method method=cls.getDeclaredMethod("multiply",int.class,int.class);
            method.setAccessible(true);
            int result=(int)method.invoke(calc,5,4);
            System.out.println("Result of multiplication: "+result);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
