package Dec31;

/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km
 */

import java.util.*;

public class Ques25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt(),side2=sc.nextInt(),side3=sc.nextInt();
        int perimeter=side1+side2+side3;
        int noOfRounds=(5*1000)/perimeter;
        System.out.print("The total number of rounds the athlete will run is "+noOfRounds+" to complete 5 km");
    }
}
