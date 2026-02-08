package Feb7.Level1;

/*Filtering a List:
Given a list of strings, filter out the strings starting with the letter "A" using Java 8 lambda
expressions and stream API.
*/

import java.util.*;
import java.util.stream.*;

public class FilterStrings {
    public static void main(String[] args){
        List<String> names=Arrays.asList("Apple","Banana","Avocado","Mango","Apricot","Grapes");
        List<String> result=names.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
        System.out.println(result);
    }
}
