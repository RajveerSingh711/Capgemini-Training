package Jan8.Level1;

/*Write a program to demonstrate NullPointerException.
Hint =>
Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
*/

import java.util.*;

public class Ques4 {
    public static void generateException(){
        String s=null;
        System.out.println(s.length());
    }
    public static void handleException(){
        String s=null;
        try{
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerException handled");
        }
    }
    public static void main(String[] args){
//        generateException();
        handleException();
    }
}
