package Feb5.Level2;

/*Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
Use try-with-resources to ensure the file is automatically closed after reading.
Handle any IOException that may occur.
Expected Behavior:
If the file exists, print its first line.
If the file does not exist, catch IOException and print "Error reading file".
*/

import java.io.*;

public class ReadFirstLine {
    public static void main(String[] args){
        try (BufferedReader reader=new BufferedReader(new FileReader("info.txt"))){
            String firstLine=reader.readLine();
            if(firstLine!=null){
                System.out.println(firstLine);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
