package Level1;

/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint =>
Take user input for 3 sides of a triangle
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/

import java.util.*;

public class Ques4 {
    public static int calculateNoOfRounds(int side1,int side2,int side3){
        int perimeter=side1+side2+side3;
        return (5*1000)/perimeter;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt(),side2=sc.nextInt(),side3=sc.nextInt();
        int noOfRounds=calculateNoOfRounds(side1,side2,side3);
        System.out.print("The total number of rounds athlete need to run around a triangular park to complete 5km is "+noOfRounds);
    }
}
