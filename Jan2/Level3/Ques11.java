package Jan2.Level3;

/*Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):y_{0} = y + (- (14 - m)) / 12

x = y_{0} + y_{0} / 4 + (- y_{0}) / 100 + y_{0} / 400

m_{0} = m + 12((14 - m) / 12) - 2

d_{0} = (d + x + 31m_{0} / 12) mod 7
*/

import java.util.*;

public class Ques11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),d=sc.nextInt(),y=sc.nextInt();
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+(31*m0)/12)%7;
        System.out.println("Day of the week (0=Sun, 1=Mon, ..., 6=Sat): "+d0);
    }
}
