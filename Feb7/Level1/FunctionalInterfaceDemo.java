package Feb7.Level1;

/*Functional Interface Implementation:
Write a program to implement a custom functional interface that takes two integer inputs
and returns their sum using lambda expressions.
*/

import java.util.*;

@FunctionalInterface
interface SumOperation{
    int add(int a,int b);
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args){
        SumOperation sum = (a,b)->a+b;
        int result=sum.add(10,20);
        System.out.println("Sum = "+result);
    }
}
