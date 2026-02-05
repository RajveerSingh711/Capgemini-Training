package Feb5.Level2;

/*Create a Java program that reads a file named "data.txt". If the file does not exist, handle the IOException properly and display a user-friendly message.
Expected Behavior:
If the file exists, print its contents.
If the file does not exist, catch the IOException and print "File not found".
*/

import java.io.*;

public class FileReadExample {
    public static void main(String[] args){
        try(BufferedReader reader=new BufferedReader(new FileReader("data.txt"))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}
