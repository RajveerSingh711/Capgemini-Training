package Feb7.Level1;

/*Map and Reduce Operation:
Given a list of integers, find the sum of squares of all even numbers using a map and
reduce operations with lambda expressions.
*/

import java.util.*;
import java.util.stream.*;

public class MapReduceExample {
    public static void main(String[] args){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
        int sumOfSquares=numbers.stream().filter(n ->n%2==0).map(n->n*n).reduce(0,(a,b)->a+b);
        System.out.println("Sum of squares of even numbers = "+ sumOfSquares);
    }
}