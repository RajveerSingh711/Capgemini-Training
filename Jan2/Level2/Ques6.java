package Jan2.Level2;

/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint =>
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
*/

import java.util.*;

public class Ques6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age1=sc.nextInt(),height1=sc.nextInt();
        int age2=sc.nextInt(),height2=sc.nextInt();
        int age3=sc.nextInt(),height3=sc.nextInt();
        String youngest,largest;
        if(age1<age2&&age1<age3){
            youngest="Amar";
        }else if(age2<age3 && age2<age1){
            youngest="Akbar";
        }else youngest="Anthony";
        if(height1>height2&&height1>height3){
            largest="Amar";
        }else if(height2>height3 && height2>height1){
            largest="Akbar";
        }else largest="Anthony";
        System.out.println(youngest+" is the youngest");
        System.out.println(largest+" is the tallest");
    }
}
