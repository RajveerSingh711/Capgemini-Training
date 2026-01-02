package Dec31;

/*Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___
 */

import java.util.*;

public class Ques28 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pound=sc.nextInt();
        double kilograms=pound/2.2;
        System.out.print("The weight of the person in pound is "+pound+" and in kg is "+kilograms);
    }
}
