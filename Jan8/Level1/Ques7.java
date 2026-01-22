package Jan8.Level1;

/*Write a program to demonstrate NumberFormatException
Hint =>
Define a variable to take user input as a String
Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in function in java.lang.Integer class to extract the number from text. In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception. Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.*;

public class Ques7 {
    static void generateException(String text){
        int n=Integer.parseInt(text);
        System.out.println("Converted Number: "+n);
    }
    static void handleException(String text){
        try{
            int n=Integer.parseInt(text);
            System.out.println("Converted Number: "+n);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException caught: Invalid number format!");
        }catch(RuntimeException e){
            System.out.println("RuntimeException caught!");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        try{
            generateException(input);
        }catch(Exception e){
            System.out.println("Exception occurred in generateException(): "+e);
        }
        System.out.println("\nHandling exception using try-catch:");
        handleException(input);
        sc.close();
    }
}
