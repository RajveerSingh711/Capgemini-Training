package Jan6.Level1;

/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint =>
Define an array of 10 integer elements and take user input for the student's age.
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote.
*/

import java.util.*;

public class Ques1 {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]<0) System.out.println("Invalid Age");
            else if(arr[i]<18) System.out.println("The student with the age "+arr[i]+" cannot vote.");
            else System.out.println("The student with the age "+arr[i]+" can vote.");
        }
    }
}
