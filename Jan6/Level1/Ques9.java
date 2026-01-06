package Jan6.Level1;

/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint =>
Take user input for rows and columns, create a 2D array (Matrix), and take the user input
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element
*/

import java.util.*;

public class Ques9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int n=rows*cols;
        int arr[]=new int[n];
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[index++]=matrix[i][j];
            }
        }
        System.out.println("Elements in matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Elements in array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
