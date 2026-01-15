package Jan7.Level3;

/*Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling.
Hint =>
Take inputs for 3 points x1, y1, x2, y2, and x3, y3
Write a Method to find the 3 points that are collinear using the slope formula. The 3 points A(x1,y1), b(x2,y2), and c(x3,y3) are collinear if the slopes formed by 3 points ab, bc, and cd are equal.
slope AB = (y2 - y1)/(x2 - x1), slope BC = (y3 - y2)/(x3 - x3)
slope AC = (y3 - y1)/(x3 - x1) Points are collinear if
slope AB = slope BC = slope Ac
The method to find the three points is collinear using the area of the triangle formula. The Three points are collinear if the area of the triangle formed by three points is 0. The area of a triangle is
area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))
*/

import java.util.*;

public class Ques10 {
    static boolean isCollinearBySlope(int x1,int y1,int x2,int y2,int x3,int y3){
        return (y2-y1)*(x3-x2)==(y3-y2)*(x2-x1)&&(y2-y1)*(x3-x1)==(y3-y1)*(x2-x1);
    }
    static boolean isCollinearByArea(int x1,int y1,int x2,int y2,int x3,int y3){
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area == 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        boolean slopeResult=isCollinearBySlope(x1,y1,x2,y2,x3,y3);
        boolean areaResult=isCollinearByArea(x1,y1,x2,y2,x3,y3);
        System.out.println("\nCollinear using Slope Method: "+slopeResult);
        System.out.println("Collinear using Area Method: "+areaResult);
    }
}
