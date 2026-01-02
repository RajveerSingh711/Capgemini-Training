package Jan2.Level1;

/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
Hint =>
Spring Season is from March 20 to June 20
*/

import java.util.*;

public class Ques7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        boolean isSpringSeason=(month==3&&day>=20)||(month==4)||(month==5)||(month==6&&day<=20);
        if (isSpringSeason) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
