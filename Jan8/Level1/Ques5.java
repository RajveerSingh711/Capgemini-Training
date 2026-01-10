package Jan8.Level1;

/*Write a program to demonstrate StringIndexOutOfBoundsException
Hint =>
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.*;

public class Ques5 {
    public static void generateException(String s){
        System.out.println(s.charAt(s.length()));
    }
    public static void handleException(String s){
        try{
            System.out.println(s.charAt(s.length()));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
//        generateException(s);
        handleException(s);
    }
}
