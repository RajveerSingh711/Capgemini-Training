package Feb7.Level1;

/*Custom Functional Interface with Default Method:
Define a custom functional interface with a single abstract method to calculate the
square of a number. Add a default method to print a message along with the result.
*/

@FunctionalInterface
interface SquareCalculator{
    int calculateSquare(int number);
    default void printResult(int number){
        int result=calculateSquare(number);
        System.out.println("The square of "+number+" is: "+result);
    }
}
public class CustomFunctionalInterfaceDemo {
    public static void main(String[] args){
        SquareCalculator squareCalculator=n->n*n;
        squareCalculator.printResult(5);
    }
}