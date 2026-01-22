package Jan6.Level1;

/*Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers
Hint =>
Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
Take another for loop to get the values of each element and add it to the total
Finally display the total value
*/

import java.util.*;

public class Ques4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double arr[]=new double[10];
        int count=0;
        while(true){
            if(count==10) break;
            double num=sc.nextDouble();
            if(num<=0) break;
            arr[count++]=num;
        }
        double sum=0;
        for(int i=0;i<10;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all elements in the array is "+sum);
    }
}
