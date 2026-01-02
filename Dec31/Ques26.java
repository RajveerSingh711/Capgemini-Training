package Dec31;

/*Create a program to divide N number of chocolates among M children.
Hint =>
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___
 */

import java.util.*;

public class Ques26 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numberOfChocolates=sc.nextInt(),numberOfChildren=sc.nextInt();
        int chocolatesDistributed=numberOfChocolates/numberOfChildren;
        int remainingChocolates=numberOfChocolates%numberOfChildren;
        System.out.print("The number of chocolates each child gets is "+chocolatesDistributed+" and the number of remaining chocolates are "+remainingChocolates);
    }
}
