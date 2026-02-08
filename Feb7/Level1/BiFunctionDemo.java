package Feb7.Level1;

/*BiFunction Interface:
Implement a program that takes two strings as input and concatenates them with a
space in between using the BiFunction interface.
*/

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args){
        BiFunction<String,String,String> concatWithSpace=(s1,s2)->s1+" "+s2;
        String result=concatWithSpace.apply("Hello","World");
        System.out.println(result);
    }
}