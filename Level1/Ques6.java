package Level1;

/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false
*/

import java.util.*;

public class Ques6 {
    public static boolean isSpringSeason(int month,int day){
        if(month==3 && day>=20) return true;
        else if(month==4 || month==5) return true;
        else if(month==6 && day<=20) return true;
        return false;
    }
    public static void main(String[] args){
        int month=Integer.parseInt(args[0]);
        int day=Integer.parseInt(args[1]);
        if(isSpringSeason(month,day)) System.out.print("It's a Spring Season");
        else System.out.print("Not a Spring Season");
    }
}
