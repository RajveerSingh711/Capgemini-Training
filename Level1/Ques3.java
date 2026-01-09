package Level1;

/*Create a program to find the maximum number of handshakes among N number of students.
Hint =>
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/

import java.util.*;

public class Ques3 {
    public static int calculateHandshakes(int noOfStudents){
        return (noOfStudents*(noOfStudents-1))/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int noOfStudents =sc.nextInt();
        int noOfHandshakes=calculateHandshakes(noOfStudents);
        System.out.print("The maximum number of handshakes done by "+noOfStudents+" students is "+noOfHandshakes);
    }
}
