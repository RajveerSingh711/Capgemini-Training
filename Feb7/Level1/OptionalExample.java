package Feb7.Level1;

/*Optional Handling:
Create a program that takes a list of integers, finds the maximum value, and returns it as
an Optional<Integer>. Handle the case when the list is empty using Optional API.
*/

import java.util.*;

public class OptionalExample {
    public static Optional<Integer> findMax(List<Integer> numbers){
        return numbers.stream().max(Integer::compareTo);
    }
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10,25,5,40,30);
        Optional<Integer> maxValue=findMax(numbers);
        if(maxValue.isPresent()) System.out.println("Maximum value: "+maxValue.get());
        else System.out.println("List is empty. No maximum value found.");
        int result=maxValue.orElse(0);
        System.out.println("Max value (default if empty): "+result);
    }
}