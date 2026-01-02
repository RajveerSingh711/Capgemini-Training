package Dec24;
/* Write a program that takes the distance in kilometers as input from the user
and converts it into miles using the formula:
Miles = Kilometers * 0.621371. */

import java.util.*;

public class Convert_Kilometers_to_Miles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int distance_in_kilometer=sc.nextInt();
        double miles=distance_in_kilometer*0.621371;
        System.out.print((int)miles);
    }
}
