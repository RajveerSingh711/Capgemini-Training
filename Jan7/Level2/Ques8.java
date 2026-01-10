package Jan7.Level2;

/*Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint =>
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends
*/

import java.util.*;

public class Ques8 {
    public static int findYoungest(int[] age) {
        int ans=0;
        for(int i=1;i<3;i++){
            if(age[i]<age[ans]) ans=i;
        }
        return ans;
    }
    public static int findTallest(double[] height) {
        int ans=0;
        for(int i=1;i<3;i++){
            if(height[i]>height[ans]) ans=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
            height[i]=sc.nextDouble();
        }
        int youngest=findYoungest(age);
        int tallest=findTallest(height);
        System.out.println("Youngest friend is "+names[youngest]);
        System.out.println("Tallest friend is "+names[tallest]);
    }
}
