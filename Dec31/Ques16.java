package Dec31;

/*Create a program to find the maximum number of handshakes among N number of students.
Hint =>
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/

import java.util.*;

public class Ques16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int total_no_of_Students=sc.nextInt();
        int possible_handshakes=(total_no_of_Students*(total_no_of_Students-1))/2;
        System.out.print("The total possible handshakes students can do by "+total_no_of_Students+" is "+possible_handshakes);
    }
}
