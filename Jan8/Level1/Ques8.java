package Jan8.Level1;

/*Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint =>
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.*;

public class Ques8{
    static void generateException(int arr[]){
        System.out.println("Accessing invalid index:");
        System.out.println(arr[arr.length]);
    }
    static void handleException(int arr[]){
        try{
            System.out.println("Accessing invalid index:");
            System.out.println(arr[arr.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }catch(RuntimeException e){
            System.out.println("RuntimeException caught!");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }try{
            generateException(arr);
        }catch(Exception e){
            System.out.println("Exception occurred in generateException(): " + e);
        }
        System.out.println("\nHandling exception using try-catch:");
        handleException(arr);
        sc.close();
    }
}
