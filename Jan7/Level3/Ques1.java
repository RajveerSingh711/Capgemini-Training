package Jan7.Level3;

/*Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint =>
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team
Write the method to find the tallest height of the players on the football team
Finally display the results
*/

import java.util.*;

public class Ques1 {
    public static int findSum(int[] heights){
        int sum=0;
        for(int i=0;i<heights.length;i++) sum+=heights[i];
        return sum;
    }
    public static double findMean(int[] heights){
        int sum=findSum(heights);
        return (double)sum/heights.length;
    }
    public static int findShortest(int[] heights){
        int min=heights[0];
        for(int i=1;i<heights.length;i++) {
            if(heights[i]<min) min=heights[i];
        }
        return min;
    }
    public static int findTallest(int[] heights) {
        int max=heights[0];
        for (int i=1;i<heights.length;i++) {
            if(heights[i]>max) max=heights[i];
        }
        return max;
    }

    public static void main(String[] args){
        int[] heights=new int[11];
        for (int i=0;i<11;i++){
            heights[i]=(int)(Math.random()*101)+150;
            System.out.println("Player "+(i+1)+" Height: "+heights[i]);
        }
        int shortest=findShortest(heights);
        int tallest=findTallest(heights);
        double mean=findMean(heights);
        System.out.println("Shortest Height: "+shortest);
        System.out.println("Tallest Height: "+tallest);
        System.out.println("Mean Height: "+mean);
    }
}
