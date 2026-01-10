package Jan7.Level1;

/*Create a program to find the maximum number of handshakes among N number of students.
Hint =>
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
*/

import java.util.*;

public class Ques2 {
    public static int calculateHandshakes(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int noOfHandshakes=calculateHandshakes(n);
        System.out.print("The maximum number of handshakes done by "+n+" students is "+noOfHandshakes);
    }
}
