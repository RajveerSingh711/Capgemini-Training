package Feb2;

/*Write a program that asks the user for their name, age, and favorite programming language, then saves this information into a file.
Requirements:
Use BufferedReader for console input.
Use FileWriter to write the data into a file.
Handle exceptions properly.
*/

import java.util.*;
import java.io.*;

public class Ques3 {
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer=null;
        try {
            System.out.print("Enter your name: ");
            String name=br.readLine();
            System.out.print("Enter your age: ");
            String age=br.readLine();
            System.out.print("Enter your favorite programming language: ");
            String language=br.readLine();
            writer=new FileWriter("user_info.txt");
            writer.write("Name: "+name+"\n");
            writer.write("Age: "+age+"\n");
            writer.write("Favorite Programming Language: "+language+"\n");
            System.out.println("\nData saved successfully to file.");
        }catch(IOException e){
            System.out.println("An error occurred while reading or writing data.");
            e.printStackTrace();
        }finally{
            try{
                if(writer!=null) writer.close();
                if(br!=null) br.close();
            }catch(IOException e){
                System.out.println("Error closing resources.");
            }
        }
    }
}
