package Dec31;

/*Rewrite the Sample Program 2 with user inputs
Hint =>
Create variables and take user inputs for name, fromCity, viaCity, toCity
Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
Create Variables and take time taken
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___
*/

import java.util.*;

public class Ques24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();
        int fromToVia = sc.nextInt();
        int viaToFinalCity = sc.nextInt();
        int time = sc.nextInt();
        int totalDistance = fromToVia + viaToFinalCity;
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " → " + viaCity + " → " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.print("Total time: "+time+" hours");
    }
}
