package Feb7.Level1;

/*Predicate Composition:
Implement a program to filter a list of strings based on multiple conditions such as length
greater than 5 and containing a specific substring using Predicate composition.
*/

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class PredicateCompositionDemo {
    public static void main(String[] args){
        List<String> words=Arrays.asList("functional","lambda","predicate","streamapi","javaeight","code","composition");
        Predicate<String> lengthGreaterThanFive=s->s.length()>5;
        Predicate<String> containsApi=s->s.contains("api");
        Predicate<String> combinedPredicate=lengthGreaterThanFive.and(containsApi);
        List<String> result=words.stream().filter(combinedPredicate).collect(Collectors.toList());
        System.out.println(result);
    }
}