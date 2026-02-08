package Feb7.Level1;

/*Consumer Interface:
Write a program to demonstrate the usage of the Consumer interface to print each
element of a list of strings in uppercase.
*/

import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args){
        List<String> names=Arrays.asList("java","stream","lambda","consumer");
        Consumer<String> printUpperCase=s->System.out.println(s.toUpperCase());
        names.forEach(printUpperCase);
    }
}