package Feb2;

/*Write a Java program that reads the contents of a text file and writes it into a new file. If the source file does not exist, display an appropriate message.
Requirements:
Use FileInputStream and FileOutputStream.
Handle IOException properly.
Ensure that the destination file is created if it does not exist.
*/

import java.util.*;
import java.io.*;

public class Ques1 {
    public static void main(String[] args){
        File sourceFile=new File("source.txt");
        File destinationFile=new File("destination.txt");
        if(!sourceFile.exists()){
            System.out.println("Source file does not exist.");
            return;
        }
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try{
            fis=new FileInputStream(sourceFile);
            fos=new FileOutputStream(destinationFile);
            int data;
            while((data=fis.read())!=-1){
                fos.write(data);
            }
            System.out.println("File copied successfully.");
        }catch(IOException e){
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }finally{
            try{
                if(fis!=null) fis.close();
                if(fos!=null) fos.close();
            }catch(IOException e){
                System.out.println("Error closing the files.");
            }
        }
    }
}
