package Dec31;

/* Write a program to find the side of the square whose parameter you read from user
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/

import java.util.*;

public class Ques13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        int perimeterOfSquare=4*side;
        System.out.print("The length of the side is "+side+" whose perimeter is "+perimeterOfSquare);
    }
}
